require 'prime.rb'
beginning = Time.now
num = 600851475143
answer = 0

Prime.each(10000) do |prime|
	if num % prime == 0 && prime > answer
		answer = prime
	end
end

puts answer
puts Time.now - beginning