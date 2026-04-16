import java.util.Stack;
class ExpressionThread extends Thread {
    String expr;
    String result;

    ExpressionThread(String expr) {
        this.expr = expr;
    }

    public void run() {
        result = convertToInfix(expr);
    }

    String convertToInfix(String expression) {
        Stack<String> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                stack.push(ch + "");
            } else {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String temp = op1 + ch + op2;
                stack.push(temp);
            }
        }
        return stack.pop();
    }
}

public class PolishNotation {
    public static void main(String[] args) {

        String expr = "AB*CD/+";  

        String part1 = "AB*";
        String part2 = "CD/";

        ExpressionThread t1 = new ExpressionThread(part1);
        ExpressionThread t2 = new ExpressionThread(part2);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String finalResult = t1.result + "+" + t2.result;

        System.out.println("Infix Expression: " + finalResult);
    }
}