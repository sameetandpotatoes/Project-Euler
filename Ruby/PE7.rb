require 'prime.rb'
beginning = Time.now
puts (Prime.first 10001).last
puts Time.now - beginning