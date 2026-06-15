package LinkedList;

import java.util.LinkedList;

public class LinkedList_Creation {
    public static void main(String[] args){
        //creation
        LinkedList<Integer> list = new LinkedList<>();
        //Adding elements
        list.addFirst(1);
        list.add(1,2);
        list.add(2,3);
        list.addLast(4);
        System.out.print("Without Shifting: ");

        //Advance for-each --> transversal
        for (Integer l : list){
            System.out.print(l +" ");
        }

        System.out.println();

        LinkedList <Integer> newList = new LinkedList<>();
        newList.add(0,1);
        newList.add(0,2);
        newList.add(0,3);
        newList.add(0,4);

        System.out.print("With Shifting:");
        for (Integer nl : newList){
            System.out.print(nl +" ");
        }
    }
}
