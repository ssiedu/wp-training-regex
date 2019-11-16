
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SSI
 */
public class RETwo {
      public static void main(String[] args) {
        Pattern p=Pattern.compile("[xyz]"); 
        Matcher m=p.matcher("y");
        System.out.println(m.matches());
        
    }
}
