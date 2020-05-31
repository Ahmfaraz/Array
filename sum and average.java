import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
     Scanner in = new Scanner(System.in);
    System.out.println("enter the size of array");
    int n = in.nextInt();
    int[] arr = new int[n];
    int sum =0;
    System.out.println("enter the value of array");
    for(int i =0;i<arr.length;i++){
      arr[i]=in.nextInt();
    }
    for(int i =0;i<arr.length;i++){
      sum = sum + arr[i];
    }
    System.out.println("total="+sum);
    System.out.println("average="+sum/arr.length);
    
    
   }
 }
