
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestOne {

    public static void main(String[] args) {

          String ms="a#423b%dAB4Cd1! ";
          String pattern1="\\W";//[a-zA-Z0-9]
          Pattern p=Pattern.compile(pattern1);
          Matcher m=p.matcher(ms);
          
          while(m.find()){
              System.out.println(m.start()+","+m.group());
          }
          
        
    }
}
