public class Duplicate {
 public static void main(String[]args){
  String []arr1={"Prathmesh","Shubham","Raj","Atharv"};
  String []arr2={"Ashwajeet","Raj","Aarth","Prathmesh"};
  System.out.println("Duplicte value between two String  is :");
 for(int i=0;i<arr1.length;i++){
    for(int j=0;j<arr2.length;j++){
        if (arr1[i].equals(arr2[j])) {
            System.out.println(arr1[i]);
     }
   }
 }    
}
}