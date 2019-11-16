
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class QuantifiersDemo {

    public static void main(String[] args) {

        String text="I live in house no 121-A, Adarsh Nagar which is in ward 32 of Dewas with PIN 455001 and STD code 07272";
        //Pattern p=Pattern.compile("\\d");//exactly one digit
        //Pattern p=Pattern.compile("\\d?"); //0 or 1 digit (exactly one)
        //Pattern p=Pattern.compile("\\d*"); //any no of digit including 0 no also
        //Pattern p=Pattern.compile("\\d+"); //one or  more digits
        Pattern p=Pattern.compile("\\d{5,8}"); //one or  more digits
        Matcher m=p.matcher(text);
        
        
        while(m.find()){
            out.println(m.start()+","+m.end()+","+m.group());
        }
        
    }
}
