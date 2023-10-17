import java.util.Scanner;

public class Demo5 {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String[] names = {"Kasun","Nuwan","Ruwan","Supun","Upul","Nimal"};

        loop:
       do{ 
        System.out.print("Search a name to find: ");
        String search = scanner.nextLine();

        for(int i=0;i<names.length;i++){
            if(names[i].equalsIgnoreCase(search.strip())){
                System.out.printf("Number found at: %s \n",i+1);
                continue loop;

            }
        }
        System.out.println("Name not found");
        }while(true);
    }
}
