beginning = Time.now
sumsquare = 0
(1..100).each do |x|
	sumsquare += x**2
end
squaresum = ((100 * 101)/2) ** 2
puts squaresum - sumsquare
puts Time.now - beginning
