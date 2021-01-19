n,h,v=map(int,input().split())
if(2<=n<=10000 and 0<h<n and 0<v<n):
  if(n-h > h): h=n-h
  if(n-v > v): v=n-v
  print((h*v*4))
