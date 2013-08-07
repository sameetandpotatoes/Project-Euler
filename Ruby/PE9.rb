beginning = Time.now
maxProduct = product = 0
a = b = c = 950
while c >= 200
	if a == 200
		a = 950
		b -= 1
	end
	if b == 200
		b = 950
		c -= 1
	end
	product = a * b * c
	if (a < b && b < c)
		if (a + b + c == 1000)
			if (a*a) + (b*b) == (c*c)
				puts "#{a} #{b} #{c}"
				if (product > maxProduct)
					maxProduct = product
				end
			end
		end
	end
	a -= 1
end
puts maxProduct
puts Time.now - beginning