# https://paiza.jp/works/mondai/forest_contest_015/forest_contest_015__b_find_multiple_number/edit?language_uid=ruby
# a の倍数が b 以上 c 以下の範囲に存在するかどうかを求めてください。

def check(numbers, a)
  numbers.each do |num|
    return true if num % a == 0
  end
  return false
end

a, b, c = gets.split.map {|n| n.to_i}

numbers = Array.new((b..c).to_a)

check(numbers, a) ? puts('Yes') : puts('No')
