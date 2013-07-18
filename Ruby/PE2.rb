a = b = sum = 0
c = 1
beginning = Time.now
while (c < 4000000)
  a = b + c
  b = c + a
  c = a + b
  if (a % 2 == 0)
    sum += a
  end
  if (b % 2 == 0)
    sum += b
  end
  if (c % 2 == 0)
    sum += c
  end
end
puts sum
puts "Time: " + (Time.now - beginning).to_sofficejet
