n, k = gets.split(' ').map(&:to_i)
nums = []

n.times do
  nums << gets.to_i
end

result = []
nums.each do |num|
  result << num + k
end

result.each do |num|
  puts num
end
