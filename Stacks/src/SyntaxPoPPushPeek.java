// peek --> last element view
// pop --> last element remove
// push --> add element  on last
// stacks --> FILO (First In Last Out)
// or LIFO (Last In First Out)

import java.util.Scanner;
import java.util.Stack;
public class SyntaxPoPPushPeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("Stacks : Push, Peek and Pop");
        System.out.print("Enter the First Number to push on stack:");
        int push1 = input.nextInt();
        stack.push(push1);
        System.out.print("Enter the Second Number to Push on stack:");
        int push2 = input.nextInt();
        stack.push(push2);
        System.out.print("Check Peek:");
        System.out.println(stack.peek());
        System.out.print("POP Number:");
        System.out.println(stack.pop());
        System.out.print("Check Peek:");
        System.out.print(stack.peek());
    }
}
