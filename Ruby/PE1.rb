x = sum = 0
beginning = Time.now
1000.times {|x|
  if x % 3 == 0 || x % 5 == 0
    sum += x
  end
  end
}
puts sum
puts "Time: " + (Time.now - beginning).to_s

  
