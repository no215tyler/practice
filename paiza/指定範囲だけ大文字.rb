a, b = gets.split(' ').map(&:to_i)
strs = gets.split('')
a -= 1
b -= 1 

for i in (a..b)
  strs[i] = strs[i].upcase
end

puts strs.join('').chomp
