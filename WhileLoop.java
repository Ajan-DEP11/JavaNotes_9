import java.util.Scanner;

public class WhileLoop {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        int input;
        int sum;
        int count;
        double Average;

        sum=0;
        count=0;

        System.out.print("Enter the Integer Number: ");
        input  = scanner.nextInt();
        scanner.nextLine();

        while(input !=0){
            sum += input;
            count++;
           
             System.out.print("Enter a Integer, if you want to end the cal enter 0:");
             input = scanner.nextInt();
             scanner.nextLine();
        }
        if(input ==0){
            System.out.println("Programe is ended..");
        }
         Average = (double)sum/count;
         System.out.printf("average is %.2f: \n",Average);
      
        
       
        





    }
}
