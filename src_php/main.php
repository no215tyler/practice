<?php
  $N = trim(fgets(STDIN));
  $nums = explode(" ", trim(fgets(STDIN)));
  $count = array_count_values($nums);
  for ($i = 0; $i <= 9; $i++) {
    echo isset($count[$i]) ? $count[$i] : 0;
    if ($i < 9) {
      echo " ";
    } else {
      echo "\n";
    }
  }
?>
