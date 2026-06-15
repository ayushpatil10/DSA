package LinkedList;
import java.util.*;
public class LinkedListOperations {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<>();

        //add
        list.addFirst(1);
        list.add(1,2); // add(index, value)
        list.add(2,3);
        list.add(3,4);
        list.addLast(5);

        System.out.println("1. After Adding value in LinkedList :"+ list);

        //delete
        list.remove(1); //remove index 1 value --> 2
        list.removeFirst(); //remove index 0 (first) --> 1
        list.removeLast(); //remove index 4 (last) --> 5

        System.out.println("2. After Deleting value in linkedlist :"+ list);

        //Acess the value
        System.out.print("3. Acessing the  values :");
        System.out.print(list.getFirst() + " ");  //firstvalue --> 3
        System.out.print(list.getLast() + " "); //lastvalue --> 4
        System.out.println(list.get(1)); //index 1 values --> 4

        //tranversal
        System.out.print("4. Adv for each tranversal :");
        for(Integer l: list){
            System.out.print(l + " ");
        }
        System.out.println(); //spaces

        //Iterator methods
        // .hasNext (Method to check whether next value ahead) --> true or false
        System.out.print("5. Iteration of loop using Iterator :");
        Iterator <Integer> ls = list.iterator();
        while(ls.hasNext()){
            System.out.print(ls.next() + " ");
        }
    }
}
