beginning = Time.now
a = b = sum = 0
c = 1
while (c < 4000000)
  a = b + c
  b = c + a
  c = a + b
  sum += a if (a % 2 == 0)
  sum += b if (b % 2 == 0)
  sum += c if (c % 2 == 0)
end
puts sum
puts Time.now - beginning
