require 'prime.rb'
beginning = Time.now
sum = 0
	Prime.each(5000000) do |x|
		 x <= 2000000 ? sum += x : break
	end
puts sum
puts Time.now - beginning