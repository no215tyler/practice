# https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_map_step4?language_uid=ruby

def check(board, h, w)
  results = Array.new
  for col in (0...w)
    for row in (0...h)
      if row == 0
        results << [row, col] if board[row + 1][col] == "#"
      elsif row == board.length - 1
        results << [row, col] if board[row - 1][col] == "#"
      else
        results << [row, col] if board[row - 1][col] == "#" && board[row + 1][col] == "#"
      end
    end
  end

  results.sort.each do |result|
    puts "#{result[0]} #{result[1]}"
  end
end

h, w = gets.split.map(&:to_i)

board = Array.new
h.times do
  board << gets.chomp.split('')
end

check(board, h, w)

# 14 15
# ....#......#...
# ...............
# ...............
# ...............
# ...............
# #..............
# #..............
# ...............
# .######........
# ...............
# .#.............
# ...............
# #..............
# .............#.
