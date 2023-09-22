public class Subroutines {
    public static void main(String[] args) {
        long startTime;
        long endTime;
        long diffTime;

        startTime = System.nanoTime();
        
        double width;
        double height;
        double hypotenus;

        width = 10;
        height = 20;

        hypotenus = Math.sqrt(width*width + height*height);
        System.out.println("hypotenus of the traingle is: " + Math.round(hypotenus));

        endTime = System.nanoTime();
        diffTime = endTime - startTime;
        System.out.println(diffTime/1000000000.00);
        

    }
}