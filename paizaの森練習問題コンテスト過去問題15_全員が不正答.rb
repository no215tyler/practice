# https://paiza.jp/works/mondai/forest_contest_015/forest_contest_015__b_hardproble/edit?language_uid=ruby
# n = 科目数(col), m = 生徒数(row)
n, m = gets.split.map(&:to_i)

result = [] # 各生徒の科目毎の合否結果

m.times do
  result << gets.split.map(&:to_i)
end

flg = false
subjects = []
# 科目毎に各生徒が不正答（0）でないかを走査し、生徒の人数 == 0の数があったら"Yes"を出力
for i in (0...n)
  subjects.clear
  for j in (0...m)
    subjects << result[j][i]
  end
  if subjects.count(0) == subjects.length
    flg = true
  end
end

flg == true ? puts("Yes") : puts("No")
