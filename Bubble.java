
import java.util.*;
class Bsort{
  void Bubble(int[] n){
    for(int i=0;i<n.length-1;i++){
      for(int j=0;j<n.length-1-i;j++){
        if(n[j]>n[j+1]){
          int temp = n[j];
          n[j]= n[j+1];
          n[j+1]=temp;
       
      }
    }
    for(int i=0;i<n.length;i++){
      System.out.println(n[i]);
    }
  }
}

public class array {

  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       
        System.out.println("Enter the arry size");
        
        int n = in.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the array value");
        
        for(int i=0;i<arr.length;i++){
        
          arr[i]=in.nextInt();
          
        }
        
        Bsort obj =new Bsort();
        
        
        obj.Bubble(arr);
        
        
  }

}
