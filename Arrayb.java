import java.util.*;
public  class Arrayb{
    public static int binaryserch(int nums[], int key){
        int start =0, end =nums.length-1;
        while(start<=end){
            int mid=(start+end)/2;

            if(key==nums[mid]){
                return mid;
            }
            else if(nums[mid] <key ){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;


    }

    public static void  reverse(int num[]){
       int first=0,last=num.length-1;
       while(first<last){
        int temp=num[last];
        num[last] = num[first];
        num[first]=temp;
        first++;
        last--;
       }

    }

    public static void printpairs(int nums[]){
        for(int i=0; i<nums.length; i++){
            int current=nums[i];
            for(int j=i+1;j<nums.length;j++){
                System.out.print("("+current +" "+nums[j] +")");

            }
            System.out.println();
        }
    }

    public static void printsubarray(int nums[]){
        int n =nums.length;
        for(int i=0;i<n-1;i++){
            int start=i;
                for(int j=i+1;j<=n-1;j++){
                    int end=j;
                    for(int k=start;k<=end;k++){
                        System.out.print(nums[k]+" ");
                    }
                    System.out.println();
                }
                 System.out.println();
        }
    }
  public static void main (String args[]){
    int nums[]={2,4,6,8,10};
    int key =155;
    System.out.println(binaryserch(nums, key));
   
    // reverse(nums);
    // for(int n : nums){
    //       System.out.print(n + " ");
          
    // }
    //    printpairs(nums);
    // for(int n : nums){
    //       System.out.print(n + " ");
    //}
    printsubarray(nums);
    for(int n:nums){
        System.out.println(n);
    }
  }

}