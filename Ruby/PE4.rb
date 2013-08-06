beginning = Time.now
a = b = 999
max = 0
while b >= 800
	if a == 800
		a = 999
		b -= 1
	end
	max = (a * b) if (a * b) > max && (a * b).to_s == (a * b).to_s.reverse
	a -= 1
end
puts max
puts Time.now - beginning