package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DictionaryOrderSmaller {
    static ArrayList<String> al = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ques = scanner.nextLine();
        printAnswer(ques, "");
        Collections.sort(al);
        for(int i=0; i< al.size(); i++){
            if(ques.equals(al.get(i))){
                break;
            }
            else{
                System.out.println(al.get(i));
            }
        }
    }
    public static void printAnswer(String question, String answer){
        if(question.length() == 0){
            al.add(answer);
            return;
        }
        for(int i=0; i<question.length(); i++) {
            char ch = question.charAt(i);
            String part = question.substring(0, i) + question.substring(i+1);
            printAnswer(part,answer+ch);
        }
    }
}
