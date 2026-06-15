package LinkedList;
//Que 1) linkedList given reverse it.
import java.util.*;

public class LinkedListQues_1 {
    public static LinkedList <Integer> reverse(LinkedList<Integer> list){
        LinkedList<Integer> ls = new LinkedList<>();
        for (int i = 0 ; i < list.size() ; i++) {
            ls.addFirst(list.get(i));
        }
        return ls;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.add(1,2);
        list.addLast(3);

        System.out.println( "Before Reverse:"+list);
        list = reverse(list);
        System.out.print("After Reverse:"+ list);
    }
}


