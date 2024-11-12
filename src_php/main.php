<?php
  $num = trim(fgets(STDIN));
  for ($i = 1; $i <= $num; $i++) {
    checkFizzBuzz($i);
  }

  function checkFizzBuzz($num) {
    switch ($num) {
      case ($num % 5 === 0 && $num % 3 === 0):
        echo "Fizz Buzz\n";
        break;
      case ($num % 5 === 0):
        echo "Buzz\n";
        break;
      case ($num % 3 === 0):
        echo "Fizz\n";
        break;
      default:
        echo $num . "\n";
    }
  }
?>
