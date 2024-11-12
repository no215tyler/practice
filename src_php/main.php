<?php
  $S = gmp_init(trim(fgets(STDIN)));
  $T = gmp_init(trim(fgets(STDIN)));
  $result = gmp_mul($S, $T);
  echo $result;
  echo "\n";
?>
