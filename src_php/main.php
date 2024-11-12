<?php
  $num = trim(fgets(STDIN));

  checkFizzBuzz($num);

  function checkFizzBuzz($num) {
    if ($num % 5 === 0 && $num % 3 === 0) {
      echo "FizzBuzz\n";
    } else if ($num % 5 === 0) {
      echo "Buzz\n";
    } else if ($num % 3 === 0) {
      echo "Fizz\n";
    } else {
      echo $num . "\n";
    }
  }
?>
