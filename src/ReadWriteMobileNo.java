
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.System.out;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadWriteMobileNo {

    public static void main(String[] args) throws Exception {

        Pattern pt1 = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern pt2 = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-z]+)+");
        FileReader reader = new FileReader("info.txt");
        BufferedReader br = new BufferedReader(reader);
        StringBuffer contents = new StringBuffer();
        
        while (true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            contents.append(line);
        }

        //Reading all Mobiles
        System.out.println("All Mobiles : ");
        Matcher matcher1 = pt1.matcher(contents);
        while (matcher1.find()) {
            out.println(matcher1.group());
        }

        //Reading all Emails
        System.out.println("All EMails : ");
        Matcher matcher2 = pt2.matcher(contents);
        while (matcher2.find()) {
            out.println(matcher2.group());
        }
    }
}
