# https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_map_step2?language_uid=ruby
# ランクC相当問題

def change(board, x, y)
  board[x][y] == "#" ? board[x][y] = "#" : board[x][y] = "#" # 指定マスの既存駒に限らず全て"#"に書き換える
end

h, w, n = gets.split.map(&:to_i)

board = Array.new(h) { Array.new(w, 0)}

h.times do |i|
  board[i].replace(gets.chomp.split(''))
end

############
# メイン処理
############
n.times do
  x, y = gets.split.map(&:to_i)
  change(board, x, y)
end

board.each do |row|
  puts row.join
end


# 入力値ケース
# 10 10 10
# .#########
# .###.#.#.#
# #.#####.#.
# .#.###.#..
# .#...#....
# .##.#...##
# ....#.#.#.
# #.#.####..
# .....#....
# ..#..#.#.#
# 0 0
# 1 2
# 2 3
# 3 4
# 4 5
# 5 6
# 9 2
# 3 9
# 4 1
# 2 5
