public class Demo3 {
    public static void main(String[] args) {
        int x = 10;
        int y = x;
            x = 20;

            System.out.println(x);
            System.out.println(y);

            System.out.println("---------------------------------");

            int[] A ={10,20,30,40,50};
            int[] B = A;

            for(int i=0;i< A.length;i++){
                System.out.print( A[i]+" ");
            }

            System.out.println();

            for(int i=0;i< B.length;i++){
                System.out.print(B[i] + " ");
            }
            System.out.println();
            System.out.println("===================================");

            A[0] = 100;
            B[4] = 500;


            for(int i=0;i< A.length;i++){
                System.out.print( A[i]+" ");
            }

            System.out.println();

            for(int i=0;i< B.length;i++){
                System.out.print(B[i] + " ");
            }
            System.out.println();


    } 
}
