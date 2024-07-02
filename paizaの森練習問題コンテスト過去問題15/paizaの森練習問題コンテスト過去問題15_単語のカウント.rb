# https://paiza.jp/works/mondai/forest_contest_015/forest_contest_015__c_word_count/edit?language_uid=ruby

words = gets.chomp.split

hash = Hash.new
words.each do |word|
  sym = word.to_sym
  if !hash.key?(sym)
    hash[sym] = 0
  end
  hash[sym] += 1    
end

arr = hash.to_a
arr.each do |word|
  puts "#{word[0].to_s} #{word[1]}"
end
