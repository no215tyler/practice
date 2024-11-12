<?php
  $input = explode(" ", trim(fgets(STDIN)));
  $x = $input[0];
  $y = $input[1];
  $z = $input[2];

  if ($z >= 10 || ($x >= 10 && $y >= 10)) {
    echo "YES\n";
  } else {
    echo "NO\n";
  }
?>
