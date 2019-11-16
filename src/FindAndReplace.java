
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FindAndReplace {

    public static void main(String[] args) {
        String s="0731-223345,0731-2323654,07272-2356565,0731-23565478,0734-2356565";
        String regex="[0731]+-[0-9]{6,8}";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(s);
        while(m.find()){
            out.println(m.group());
        }
        String newstr=m.replaceAll("Indore");
        System.out.println(newstr);
    }
}
