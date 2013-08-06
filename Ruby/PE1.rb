x = sum = 0
beginning = Time.now
1000.times do |x|
  sum += x if x % 3 == 0 || x % 5 == 0
end
puts sum
puts Time.now - beginning


