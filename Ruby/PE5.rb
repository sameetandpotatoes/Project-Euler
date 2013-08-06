def gcd(a, b)
  while b > 0
    a %= b
    return b if a == 0
    b %= a
  end
  a
end

beginning = Time.now
lcm = 1
(2..20).each do |i|
	lcm *= i / gcd(lcm, i)
end
puts lcm
puts Time.now - beginning