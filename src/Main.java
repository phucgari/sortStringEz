import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String input=getInput();
        System.out.println(input);
        int max=0;
    }

    public static String getInput() {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        return input;
    }

    public static String takeCharsWithOrderAtIndex(String string, int index) {
        String result=string.charAt(0)+"";
        int counter=0;
        for (int i = index; i < string.length()-1; i++) {
            if(result.charAt(counter)<string.charAt(i+1)){
                result+=string.charAt(i+1);
                counter++;
            }
        }
        return result;
    }

    public static String takeCharsWithOrderMaxLength(String input) {
        int max=0;
        String result="";
        for (int i = 0; i < input.length(); i++) {
            String temp= takeCharsWithOrderAtIndex(input,i);
            if (temp.length()>max){
                result=temp;
                max=result.length();
            }
        }
        return result;
    }
}