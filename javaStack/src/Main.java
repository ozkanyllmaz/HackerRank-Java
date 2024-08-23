import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static boolean dengeKontrol(String input){
        Stack stack = new Stack();

        for(char ch : input.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = (char) stack.pop();
                if(!eslesmeKontrol(top,ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean eslesmeKontrol(char open, char close){
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            if(dengeKontrol(input)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
    }
}
