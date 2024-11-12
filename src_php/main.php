<?php
  $N = trim(fgets(STDIN));
  $users = [];
  for ($i = 0; $i < $N; $i++) {
    $parsonInfo = explode(" ", trim(fgets(STDIN)));
    $user = new User($parsonInfo[0], $parsonInfo[1], $parsonInfo[2], $parsonInfo[3]);
    $users[] = $user;
  }
  $searchParam = trim(fgets(STDIN));
  User::searchUser($users, $searchParam);

  class User {
    private $nickname;
    private $old;
    private $birth;
    private $state;

    public function __construct($nickname, $old, $birth, $state) {
      $this->nickname = $nickname;
      $this->old = $old;
      $this->birth = $birth;
      $this->state = $state;
    }

    public function output() {
      echo "User{\n";
      echo "nickname : " . $this->nickname . "\n";
      echo "old : " . $this->old . "\n";
      echo "birth : " . $this->birth . "\n";
      echo "state : " . $this->state . "\n";
      echo "}\n";
    }

    public static function searchUser($users, $param) {
      foreach($users as $user) {
        if ($user->old == $param) {
          echo $user->nickname . "\n";
        }
      }
    }
  }
?>
