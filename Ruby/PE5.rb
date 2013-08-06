beginning = Time.now
num = 10000
while (num < 1000000000)
	divisor = 20
	while (num % divisor == 0 && divisor != 1)
		divisor -= 1
	end
	break if divisor == 1
	num += 10
end
puts num
puts Time.now - beginning