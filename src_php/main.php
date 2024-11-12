<?php
  $S = strval(trim(fgets(STDIN)));
  $T = strval(trim(fgets(STDIN)));
  $result = bcmul($S, $T);
  echo $result;
  echo "\n";
?>
