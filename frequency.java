
import java.util.*;
class Binary{
  int binSearch(int[] a,int low,int high,int num){
    int mid =(low+high)/2;
    if(num==a[mid]){
      return mid;
      }
    else if(num>a[mid]){
    mid =mid+1;
      return binSearch(a,mid,high,num);
    }else{
      mid=mid-1;
      return binSearch(a,low,mid,num);
    }
  }
}

public class frequency {

  public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of array");
       int n = in.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++){
         arr[i]=in.nextInt();
       }
       System.out.println("Enter the number to srch");
       int num =in.nextInt();
       Binary obj = new Binary();
       System.out.println(obj.binSearch(arr,0,n,num));
  }

}
