import java.util.Scanner;

public class GetInput {
    private static final Scanner scaanner = new Scanner(System.in);
    public static void main(String[] args) {

        int userInput;
        int square;

        System.out.print("Enter a number: ");
        userInput = scaanner.nextInt();
        scaanner.nextLine();

        square = userInput*userInput;

        System.out.printf("Square value of the %s is %s : ",userInput,square);

       

        
    }
}
