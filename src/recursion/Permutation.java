package recursion;

public class Permutation {
    public static void main(String[] args) {
        String ques = "ABC";
        String ans = "";
        printAnswer(ques, ans);
    }
    public static void printAnswer(String question, String answer){
        if(question.length() == 0){
            System.out.println(answer);
            return;
        }
        for(int i=0; i<question.length(); i++) {
            char ch = question.charAt(i);
            String part = question.substring(0, i) + question.substring(i+1);
            printAnswer(part,answer+ch);
        }
    }
}
