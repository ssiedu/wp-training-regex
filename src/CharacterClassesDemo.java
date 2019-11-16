
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class CharacterClassesDemo {

    public static void main(String[] args) {

        String ms="a#423b%dAB4Cd1! ";
        String pattern1="[abc]";//either a or  b or c
        String pattern2="[^abc]";//anything except a,b or c
        String pattern3="[a-z]";//any lowercase symbol
        String pattern4="[A-Z]";//any uppercase symbol
        String pattern5="[a-zA-Z]";//any alphabates symbol
        String pattern6="[0-9]";//any digit
        String pattern7="[a-zA-Z0-9]";//any alpha-numeric character
        String pattern8="[^a-zA-Z0-9]";//anything otherthan digit or alphabate
        String pattern9="\\s";
        String pattern10="\\S";
        String pattern11="\\d";
        String pattern12="\\D";
        String pattern13="\\w";
        String pattern14="\\W";
        String pattern15=".";
        String ps="[A-Z]";
        Pattern p=Pattern.compile(pattern15);
        Matcher m=p.matcher(ms);
        while(m.find()){
            out.println(m.start()+","+m.end()+","+m.group());
        }
        
    }
}
/*
    built-in-character-classes
    \s  space
    \S  any character except space
    \d  any digit
    \D  any character except Digit
    \w  any alpha numeric character
    \W  special character
    .
*/