# https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_move_boss/edit?language_uid=ruby
def action(x, y, now_d, next_d)
  # now_dの向きに応じて、与えられたnext_dによりx, yのいずれかを増減する
  # now_dの向きに応じて、与えられたnext_dによりnow_dの向きを更新する
  case now_d
  # 東e
  when "e"
    # : L = y - 1 && now_d = 北n
    if next_d == "L"
      y -= 1
      now_d = "n"      
    # : R = y + 1 && now_d = 南s
    else
      y += 1
      now_d = "s"      
    end
  # 西w
  when "w"
    # : L = y + 1 && now_d = 南s
    if next_d == "L"
      y += 1
      now_d = "s"      
    # : R = y - 1 && now_d = 北n 
    else
      y -= 1
      now_d = "n"      
    end
  # 南s
  when "s"
    # : L = x + 1 && now_d = 東e
    if next_d == "L"
      x += 1
      now_d = "e"      
    # : R = x - 1 && now_d = 西w
    else
      x -= 1
      now_d = "w"      
    end
  # 北n
  when "n"
    # : L = x - 1 && now_d = 西w
    if next_d == "L"
      x -= 1
      now_d = "w"      
    # : R = x + 1 && now_d = 東e
    else
      x += 1
      now_d = "e"      
    end
  end
  return x, y, now_d
end

x, y, n = gets.split.map(&:to_i)
now_d = "n" # 東:e 西:w 南:s 北:n

n.times do
  next_d = gets.chomp
  x, y, now_d = action(x, y, now_d, next_d)
  puts "#{x} #{y}"
end


##############
# フィードバック
##############

# 可読性の向上:
  # 方角の文字（n, e, s, w）をハードコーディングしている部分があります。
  # これを定数として定義すると、コードが読みやすくなり、誤入力のリスクを減らせます。

################
# リファクタコード
################

# DIRECTIONS = {
#   "n" => { "L" => ["w", -1, 0], "R" => ["e", 1, 0] },
#   "e" => { "L" => ["n", 0, -1], "R" => ["s", 0, 1] },
#   "s" => { "L" => ["e", 1, 0], "R" => ["w", -1, 0] },
#   "w" => { "L" => ["s", 0, 1], "R" => ["n", 0, -1] }
# }

# def action(x, y, now_d, next_d)
#   direction_info = DIRECTIONS[now_d][next_d]
#   now_d, dx, dy = direction_info
#   x += dx
#   y += dy
#   return x, y, now_d
# end

# x, y, n = gets.split.map(&:to_i)
# now_d = "n"

# n.times do
#   next_d = gets.chomp
#   x, y, now_d = action(x, y, now_d, next_d)
#   puts "#{x} #{y}"
# end
  