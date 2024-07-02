# https://paiza.jp/works/mondai/a_rank_level_up_problems/a_rank_snake_map_step3?language_uid=ruby
# ランクC相当問題

# 問題趣旨：入力された盤面の「左右のマスが"#"」であるようなマスの座標を全て出力すること
        # ただし、左端のマスの場合は「右のマスが"#"」であれば、右端のマスの場合は「左のマスが"#"」であれば条件を満たすものとする

def check(row_board, index)
  if index == 0 # 左端
    row_board[index + 1] == "#"
  elsif index == row_board.length - 1 # 右端
    row_board[index - 1] == "#"
  else # 左右に盤目が存在する
    row_board[index - 1] == "#" && row_board[index + 1] == "#"
  end
end

h, w = gets.split.map {|n| n.to_i}

board = Array.new
h.times do
  board << gets.chomp.split('')
end

board.each_with_index do |row, index|
  for i in (0...row.length) do
    puts "#{index} #{i}" if check(row, i)
  end
end
