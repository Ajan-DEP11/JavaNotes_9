import java.util.Scanner;

public class Demo6 {
    //private static final Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,7,54,76,-90,45,45,23,5,8,9,0,-12,1,3,4,5,3,9};
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    System.out.printf("duplicate find at %s\n",i+1);
                }
            }
        }
    }
}
