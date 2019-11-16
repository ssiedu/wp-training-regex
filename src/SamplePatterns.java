
public class SamplePatterns {

    public static void main(String[] args) {

        /*
            1) allowed characters are alphabates, digits, # and $
            2) length should be minimum 2
            3) 1st char should be alphabate from a-k
            4) 2nd char should be a digit divisible by 3 (0,3,6,9)
        */
        String pattern1="[a-k][0369][a-zA-Z0-9$#]*";
        /*
            1) pattern to represent all names starting with a or A
        */
        String pattern2="[a|A][a-zA-Z]*";
        /*
            1) pattern to represent all names ending with l or L
        */
        String pattern3="[a-zA-Z]*[lL]";
        /*
            1) pattern to represent all names starting with a or A and ending with l or L
        */
        String pattern4="[a|A][a-z][A-Z]*[l|L]";
        
    }
}
