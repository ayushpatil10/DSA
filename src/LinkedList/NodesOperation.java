package LinkedList;
class Node {
    int val; // value
    Node next; //next address
    Node(int val){
        this.val = val;
    }
}
class Linkedlist{
    Node head;
    Node tail;
    int size;

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null ){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtindex(int index, int val){
        if(index < 0 || index > size) return;
        if(index == 0 ){
            addAtHead(val);
            return;
        }
        if(index == size) {
            addAtTail(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index-1; i++){
            if(temp == null) return;
            temp = temp.next;
        }
        Node newElement = new Node(val);
        newElement.next = temp.next;
        temp.next = newElement;
        size++;

    }
    void deleteAtHead(){
        if(head == null) {
            System.out.println("List is Empty");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }
    boolean search(int val){
        if(head==null) return false;
        Node temp = head;
        while(temp != null){
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
    int searchNoAtIndex(int val){
        if(head == null) return -1;
        int index = 0;
        Node temp = head;
        while(temp != null){
            if(temp.val == val) return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
    void getValueFromIndex(int index){
        if(index < 0 || index >= size) return;
        if(head == null) return;
        int count = 0;
        Node temp = head;
        while(temp != null){
            if(count == index){
                System.out.println(temp.val +" ");
                return;
            }
            temp = temp.next;
            count++;
        }
    }
    void deleteAtTail(){
        if(head == null) return;
        if(head == tail){
            head = tail = null;
            size--;
            return;
        }
        Node temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }
    void deleteAtIndex(int index){
        if(index < 0 || index >= size || head == null) return;
        Node temp = head;
        for(int i = 0; i < index - 1; i++){
            temp = temp.next;
            if(temp == null) return;
        }
        if(temp.next == null) return;
        if(temp.next == tail){
            tail = temp;
        }
        temp.next = temp.next.next;
        size--;
    }
}

class NodesOperation {
    public static void main(String[] args){
        Linkedlist ls = new Linkedlist();
        ls.addAtTail(40);
        ls.addAtHead(50);
        ls.insertAtindex(2,20);
        ls.display();
        System.out.println(ls.size);
        ls.deleteAtHead();
        ls.display();
        System.out.println(ls.size);
        System.out.println(ls.search(40));
        System.out.println(ls.search(100));
        System.out.println(ls.searchNoAtIndex(100));
        System.out.println(ls.searchNoAtIndex(20));
        ls.getValueFromIndex(1);
        ls.display();
        ls.deleteAtTail();
        ls.display();
        ls.addAtHead(10);
        ls.addAtTail(20);
        ls.insertAtindex(1,20);
        ls.display();
        ls.deleteAtIndex(1);
        ls.display();
    }
}
