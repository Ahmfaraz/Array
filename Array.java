
import java.util.*;

public class Array {

  public static void main(String[] args) {
   Scanner in =new Scanner(System.in);
   System.out.println("Enter the size of array");
   int n = in.nextInt();
   int[] arr = new int[n];
   int temp=0;
   int flag=0;
   System.out.println("Enter the value of array");
   for(int i=0;i<arr.length;i++){
     arr[i]=in.nextInt();
   }
   System.out.println("Enter the no to search");
   int srch = in.nextInt();
   for(int i =0;i<arr.length;i++){
     if(srch==arr[i]){
       temp=i;
       flag++;
       break;
       
     }
   }
   if(flag>0){
     System.out.println(temp);
   }
   else{
     System.out.println("Not found");
   }
   
  }
}
