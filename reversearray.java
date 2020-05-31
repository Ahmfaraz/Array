import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.println("Enetr the size of array");
    int n = in.nextInt();
    int[] num = new int[n];
    for(int i=0;i<num.length;i++){
      num[i] = in.nextInt();
    }
    for(int i =0;i<num.length;i++){
      System.out.println(num[n-1-i]);
    }
   }
 }
