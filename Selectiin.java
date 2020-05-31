
import java.util.*;

class Selection{
  void Ssort(int[] ar){
    for(int i=0;i<ar.length-1;i++){
      int min = i;
      for(int j=i+1;j<ar.length;j++){
        if(ar[j]<ar[min]){
          min = j;
        }
      }
      int temp = ar[min];
      ar[min] = ar[i];
      ar[i] = temp;
    }
    for(int i=0;i<ar.length;i++){
      System.out.println(ar[i]);
    }
  }
}

public class array {

  public static void main(String[] args) {
  
   Scanner nt = new Scanner(System.in);
   
    System.out.println("Enter the arry size"); 
        int n = nt.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the array value");
        
        for(int i=0;i<arr.length;i++){
        
          arr[i]=nt.nextInt();
          
        }
        
        Selection obj =new Selection();
        
        
        obj.Ssort(arr);
        
  

  }

}
