package recursion;

import java.util.Scanner;

public class ReplaceAllPi {
    public static String replaceAllPi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.charAt(0) == 'p' && str.charAt(1) == 'i'&& str.length() >= 2) {
            return "3.14" + replaceAllPi(str.substring(2));
        }
        return str.charAt(0) + replaceAllPi(str.substring(1));
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i=0; i<test; i++) {
            String str = scanner.next();
            System.out.println(replaceAllPi(str));
        }
    }
}
