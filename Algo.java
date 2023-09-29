import java.util.Scanner;

public class Algo {
    private static final Scanner scaanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a integer number: ");
        int N = scaanner.nextInt();
        scaanner.nextLine();

        while(N !=1){
            if(N%2 ==0){
                N = N/2;
               continue;
               // System.out.println(N +",\b");
            }else{
                N = 3*N +1;
                continue;
            }
           // 
        }
        
        System.out.println(N +",\b");
    }
}
