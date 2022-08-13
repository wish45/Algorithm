package LeetCode.medium;

import java.util.Stack;

public class BasicCalculatorII {
    public static void main(String args[]){
        BasicCalculatorII asd = new BasicCalculatorII();

        System.out.println(asd.calculate("12-3"));
    }
    
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char op = '+';
        int currno = 0;
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                currno = (currno * 10) + (ch - '0');
            }
            if (!Character.isDigit(ch) && ch != ' ' || i == len - 1) { //숫자가 아니고 비어있지 않고, 마지막인덱스이면,
            //if (!Character.isDigit(ch) && ch != ' ') {
                if (op == '+') {
                    stack.push(currno);
                } else if (op == '-') {
                    stack.push(-currno);
                } else if (op == '*') {
                    stack.push(stack.pop() * currno);
                } else if (op == '/') {
                    stack.push(stack.pop() / currno);
                }
                currno = 0;
                op = ch;
            }
        }
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        return sum;
    }
}
