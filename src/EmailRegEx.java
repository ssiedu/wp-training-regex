import static java.lang.System.out;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegEx {
     public static void main(String[] args) {
        out.println("Enter Your Email Id : ");
        Scanner sc=new Scanner(System.in);
        String no=sc.next();
        String pattern1="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-z]+)+";
        Pattern p=Pattern.compile(pattern1);
        Matcher m=p.matcher(no);
        if(m.matches()){
            out.println("Valid Email");
        }else{
            out.println("Invalid Email");
        }
        
    }
}
/*
    1. first character should be alphabate or digit
    2. after 1st char 0 to n no of alphates,digits,underscore,dot(.)
    3. then @ 1 or more alphabate,digit
    4. then one dot (.) and one or more alphabates (1 or more)
    
*/
