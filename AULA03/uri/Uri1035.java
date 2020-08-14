package uri;

import java.util.Scanner;

public class Uri1035 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n1,n2,n3,n4;
  
        n1 = in.nextInt();
        n2 = in.nextInt();
        n3 = in.nextInt();
        n4 = in.nextInt();
  
        if ((n2 > n3) && (n4 > n1) && (n3+n4 > n1+n2) && (n3 > 0) && (n4 > 0) && (n1%2==0)) {
          System.out.println("Valores aceitos");
        }
        else {
          System.out.println("Valores nao aceitos");
        }
        in.close(); 
    }
}