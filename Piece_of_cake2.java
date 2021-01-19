import java.util.*;

public class Piece_of_cake2{ 
  public static void main(String args[]){  
    Scanner kb= new Scanner(System.in);
    int n=kb.nextInt();
    int h=kb.nextInt();
    int v=kb.nextInt();
    if(2<=n && n<=10000 && 0<h && h<n && 0<v && v<n){
      if(n-h > h) h=n-h;
      if(n-v > v) v=n-v;
      System.out.print(h*v*4);
    }
  }  
} 