<?php
  $N = trim(fgets(STDIN));
  $nums = [];
  for ($i = 0; $i < $N; $i++) {
    $nums[] = trim(fgets(STDIN));
  }

  $result = array_count_values($nums);
  // 三項演算子の場合はechoメソッドはエラーになるため使用できない
  // 代わりに戻り値のあるprintメソッドを使う
  isset($result["0"]) ? print "NO\n" : print "YES\n";
?>
