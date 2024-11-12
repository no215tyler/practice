<?php
  $input = explode(" ", trim(fgets(STDIN)));
  $N = $input[0];
  $r = $input[2] - 1;
  $c = $input[3] - 1;

  $array = [];
  for($i = 0; $i < $N; $i++) {
    $row = explode(" ", trim(fgets(STDIN)));
    $array[] = $row;
  }

  echo $array[$r][$c] . "\n";
?>
