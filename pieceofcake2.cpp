#include <iostream>
using namespace std;

int main() { 
  int n,h,v;
  cin>>n>>h>>v;
  if(2<=n && n<=10000 && 0<h && h<n && 0<v && v<n){
    if(n-h > h) h=n-h;
    if(n-v > v) v=n-v;
    cout<<h*v*4;
  }
  
}

