str = gets.chomp.split(' ')

hash = {}
str.each do |s|
  hash[s.to_sym] = hash[s.to_sym] ? hash[s.to_sym] + 1 : 1
end

hash.each do |key, val|
  puts "#{key} #{val}"
end
