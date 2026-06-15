package LinkedList;
//LinkedList Node has two things
// 1--> values 2--> next address

class NodeOfLinkedList{
    public static void main (String[] args){
        //Creation of node and assign --> values
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        System.out.println(a.val);
        System.out.println(a.next); // null --> no next assign till now
        //assign next address for continue LinkedList
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //e.next = null;   default e --> null , no need to write extra

        System.out.println(b);      //LinkedList.Node@8efb846  b address
        System.out.println(a.next); //LinkedList.Node@8efb846  a.next-->b address
        System.out.println(a.next.next.next.val);  //a.next-->b.next-->c.next-->d.val-->40
        System.out.println(e.next); //null

    }
}
