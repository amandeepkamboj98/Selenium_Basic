package basic_code;

public class EvenNumberSum {

    public static void main(String[] args) {
        int n = 0;
        int i;
        for (i = 1; i <= 1000; i++) {
            if (i % 2 == 0) {
                //    System.out.println("Even numbers " + i);
                n = n + i;
            }
        }
        System.out.println(n - i);
    }
}