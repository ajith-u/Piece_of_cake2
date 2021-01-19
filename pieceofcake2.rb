n,h,v=gets.chomp.split.map(&:to_i)
if(n.between?(2,10000) and h.between?(0,n) and v.between?(0,n))
  h=n-h if(n-h > h) 
  v=n-v if(n-v > v) 
  print(h*v*4)
end