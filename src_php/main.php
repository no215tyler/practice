<?php
  $input = explode(" ", trim(fgets(STDIN)));
  $N = $input[0];
  $K = $input[1];
  $users = [];
  for ($i = 0; $i < $N; $i++) {
    $parsonInfo = explode(" ", trim(fgets(STDIN)));
    $user = new User($parsonInfo[0], $parsonInfo[1], $parsonInfo[2], $parsonInfo[3]);
    $users[] = $user;
  }
  for ($i = 0; $i < $K; $i++) {
    $changeParams = explode(" ", trim(fgets(STDIN)));
    $idx = $changeParams[0] - 1;
    $users[$idx]->changeName($changeParams[1]);
  }
  foreach ($users as $user) {
    $user->output();
  }

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
      echo $this->nickname . " " . $this->old . " " . $this->birth . " " . $this->state . "\n";
    }

    public static function searchUser($users, $param) {
      foreach($users as $user) {
        if ($user->old == $param) {
          echo $user->nickname . "\n";
        }
      }
    }

    public function changeName($newName) {
      $this->nickname = $newName;
    }
  }
?>
