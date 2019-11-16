
import static java.lang.System.out;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MobileNoRegEx {

    public static void main(String[] args) {
        out.println("Enter Your Mobile No. : ");
        Scanner sc=new Scanner(System.in);
        String no=sc.next();
        Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(no);
        if(m.matches()){
            out.println("Valid No.");
        }else{
            out.println("Invalid No.");
        }
        
    }
}
/*
    1) each no should contain 10 digits only
    2) In India first digit should be 7,8,9
        [7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
             ----------------------------------------------
             [7-9][0-9]{9}
    ----------------------------------------------------------------------
    if 11 digits allowed but in that case first digit should be 0
            0?[7-9][0-9]{9}
    if 12 digits allowed but in that case first two digits should be 91.
        (0|91)?[7-9][0-9]{9}

*/
