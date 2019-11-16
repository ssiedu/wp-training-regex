
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class REFind {

    public static void main(String[] args) {
        Pattern p=Pattern.compile("java|python");
        
        Matcher m=p.matcher("this is java and java is object oriented and java is powerful java program are easy to write and python is also easy");
        
        while(m.find()){
            out.println(m.start()+","+m.end()+","+m.group());
        }
    }
}
