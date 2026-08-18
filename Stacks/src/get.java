import java.util.Stack;
import java.util.Scanner;
public class get {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println(st);
        Stack<Integer> tem = new Stack<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number to get position in Stacks:");
        int num = input.nextInt();
        int pst = 0;
        int size = st.size();
        while(!st.empty()){
            if(num == st.peek()) {
                System.out.println("At this Position the Number is present:"+ ((size-pst)-1));
                break;
            }
            pst++;
            int temp = st.pop();
            tem.push(temp);
        }
        if(st.empty()) System.out.println("The number not Found");
        while(!tem.empty()){
            st.push(tem.pop());
        }
        System.out.print(st);
    }
}
