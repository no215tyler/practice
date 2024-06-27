n = gets.to_i

multiplication = (1..n).to_a
result = multiplication.reduce(:*)

puts result
