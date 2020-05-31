import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner in = new Scanner(System.in);
    System.out.println("enter month in small latter");
    String month = in.nextLine();
    String[] m1 = {"january","february","march","april","may","june","july","august","september","october","november","december"};
    int[] days ={31,29,31,30,31,30,31,31,30,31,30,31 };
   
    for(int i=0;i<m1.length;i++){
      if(month.equals(m1[i])){
        System.out.println(days[i]);
      }
    }
    
    
   }
 }
