import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo1 {
    public static void main(String[] args) {
         String text1 = "My Customer id: C-123";
        String text2 = "C-450";

        Pattern compile = Pattern.compile("C-\\d{3}");
        Matcher matcher = compile.matcher(text1);
        Matcher matcher2 = compile.matcher(text2);

       /*1 */ System.out.println(matcher.matches());
            matcher.reset();
            System.out.println(matcher.find());
            
    }
    
}
