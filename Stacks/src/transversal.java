import java.util.Stack;
public class transversal {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(12);
        st.push(14);
        st.push(16);
        st.push(18);
        st.push(20);
        System.out.println(st);

        //transversal
        Stack<Integer> temp = new Stack<>();
        while(!st.empty()){
            int num = st.pop();
            temp.push(num);
        }
        System.out.println(temp); //Done transversal

        st = temp; //again back in starting Stack

        System.out.print(st);
    }
}
