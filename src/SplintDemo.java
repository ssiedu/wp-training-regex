
import static java.lang.System.out;
import java.util.regex.Pattern;


public class SplintDemo {

    public static void main(String[] args) {
        //String pattern="\\.";     //not only . because its any-char in regex
        String pattern="[.]";
        String text="www.ssi.com";
        
        Pattern p=Pattern.compile(pattern);
        String s[]=p.split(text);
        for(String res:s){
            out.println(res);
        }
    }
}
