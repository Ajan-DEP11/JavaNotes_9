import java.util.Scanner;

public class Demo6 {
    private static final Scanner scanner =  new Scanner(System.in);
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,7,54,76,-90,45,45,23,5,8,9,0,-12,1,3,4,5,3,9};

        
        int search;
      do { 
        System.out.print("Enter number to search: ");
        search = scanner.nextInt();
        scanner.nextLine();

        int duplicates=0;
        for(int i=0;i<nums.length;i++){
         
                if(nums[i]==search){
                    duplicates++;
                }
            
        }
          if(duplicates> 1){
            System.out.printf("Number of duplicates: %s \n",duplicates);
        }else if(duplicates==1){
            System.out.println("No duplicates");
        }else{
            System.out.println(search+ "number not found");
        }
      

        }while(true);

        
      
    }
}
