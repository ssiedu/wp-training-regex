
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class REOne {

    public static void main(String[] args) {
        Pattern p=Pattern.compile(".xx.");
        Matcher m=p.matcher("AxxB");
        System.out.println(m.matches());
        
    }
}
