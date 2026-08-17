import java.util.Stack;
public class stack {
    public static void main(String[] args){
        Stack <String> st = new Stack<>();
        System.out.println("Is stack empty:"+ st.empty()); // .empty --> true or false
        st.push("Ayush");
        st.push("Patil");
        System.out.println(st); //Print all Stacks
        System.out.println("Peek last string view:"+ st.peek());
        System.out.println("PoP last String:"+ st.pop());
        System.out.println(st);
    }
}
