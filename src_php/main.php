<?php
  $input = explode(" ", trim(fgets(STDIN)));
  $N = $input[0];
  $K = $input[1];

  // 客リスト
  $customers = [];
  // 客数分のインスタンスを生成
  for ($i = 0; $i < $N; $i++) {
    $age = trim(fgets(STDIN));
    if ($age >= 20) {
      $customers[] = new Adult($age);
    } else {
      $customers[] = new Customer($age);
    }
  }

  // 注文
  for ($i = 0; $i < $K; $i++) {
    $orders = explode(" ", trim(fgets(STDIN)));
    $index = $orders[0] - 1;
    $order = $orders[1];
    $price = $orders[2];
    try {
      if (!($customers[$index]->isAdult()) && $order === "alcohol") {
        throw new Exception("未成年のアルコール注文です\n");
      }
      order($customers[$index], $order, $price);
    } catch (Exception $e) {
      // echo $e->getMessage();
    }
  }

  // 客ごとの会計
  foreach ($customers as $customer) {
    echo $customer->getAmount() . "\n";
  }


  ##############
  # メソッド定義 #
  ##############

  function order($customer, $order, $price) {
    switch ($order) {
      case "food":
        $customer->orderFood($price);
        break;

      case "softdrink":
        $customer->orderSoftdrink($price);
        break;

      case "alcohol":
        $customer->orderAlcohol($price);
        break;

      default:
    }
  }


  class Customer {
    private $amount = 0;
    private $age;
    protected $discountFlg = false;
    protected $adult = false;

    public function __construct($age) {
      $this->amount = 0;
      $this->age = $age;
    }

    public function getAmount() {
      return $this->amount;
    }

    public function setAmount($amount) {
      $this->amount += $amount;
    }

    public function isAdult() {
      return $this->adult;
    }

    public function orderFood($price) {
      if ($this->discountFlg) {
        $this->amount += $price - 200;
      } else {
        $this->amount += $price;
      }
    }

    public function orderSoftdrink($price) {
      $this->amount += $price;
    }
  }

  class Adult extends Customer {
    public function __construct() {
      $this->adult = true;
    }

    public function orderAlcohol($price) {
      $this->setAmount($price);
      $this->discountFlg = true;
    }
  }
?>
