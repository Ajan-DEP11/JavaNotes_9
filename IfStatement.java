import java.util.Scanner;

public class IfStatement {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        int y;
        int z;

        do{

       System.out.print("Enter x: ");
       x=scanner.nextInt();
       scanner.nextLine();

        System.out.print("Enter y: ");
        y=scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter z: ");
        z=scanner.nextInt();
        scanner.nextLine();

        if(x<y && y<z){
            System.out.println(x +","+y+","+z);
        }else if(x>z && z>y){
            System.out.println(y +","+ z +","+x);
        }else if(x<z && x>y){
            System.out.println(y +","+ x +","+z);
        }else{
            System.out.println(z +","+ x +","+y);
        }
    }while(true);
        
    }
}
