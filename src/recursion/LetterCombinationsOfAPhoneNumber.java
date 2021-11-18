package recursion;

public class LetterCombinationsOfAPhoneNumber {
    static String[] getKey = {"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wx", "yz"};
    public static void main(String[] args) {
        String str = "198";
        keyPad(str, "");
    }
    public static void keyPad(String ques, String ans){
        if(ques.length()==0){
            System.out.println(ans+" ");
            return;
        }
        char ch = ques.charAt(0);
        String key = getKey[ch-48];
        for(int i=0; i<key.length(); i++){
            keyPad(ques.substring(1), ans+key.charAt(i));
        }
    }
}
