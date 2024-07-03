# https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_mapmove_step1?language_uid=ruby

def check(board, y, x, m)
  direction = ['E', 'W', 'S', 'N']
  d = direction.index(m)
  move = [
    [0, 1], [0, -1], [1, 0], [-1, 0]
  ]
  return puts "No" if y == 0 && m == "N"
  return puts "No" if x == 0 && m == "W"
  y += move[d][0]
  x += move[d][1]
  board[y][x] == "#" ? puts("No") : puts("Yes")
end

h, w, sy, sx, m = gets.split
h, w, sy, sx = [h, w, sy, sx].map.with_index do |env, index|
  env = env.to_i
end

board = []
h.times do
  board << gets.chomp.split('')
end

check(board, sy, sx, m)

# 5 7 1 0 W
# ##...#.
# .......
# #..#...
# #...#.#
# ...#.#.
