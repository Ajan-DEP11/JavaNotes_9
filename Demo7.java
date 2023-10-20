import java.util.Scanner;

public class Demo7 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {-10, -5, 1, 3, 7, 9};

        System.out.print("Enter number to insert: ");
        int insertion= scanner.nextInt();
        scanner.nextLine();

        int insertionIndex;
        if(insertion> nums[nums.length-1]){
            insertionIndex = nums.length;
        }else{
            
        }
    }
}
