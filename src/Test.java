
public class Test {

    public static void add(int a, int b){
        assert (a>b):"Divisior Is Large";
        System.out.println(a/b);
    }
    
    public static void main(String[] args) {
            add(1000,200);
    }

}
