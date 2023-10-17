import java.util.Scanner;

public class Demo4 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        loop:
       do {
        int[] num = {1,3,-5,23,12,7,9,45,67,11};

        System.out.print("Enter a number to search: ");
        int search = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<num.length;i++){
            if(num[i]==search){
                System.out.printf("Number found at %s \n", i+1);
                continue loop;
              
             }
                
             
            }
            System.out.println("number not found");
            //continue;
        }while(true);
        
    }
}
