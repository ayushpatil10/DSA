class Node{
    int val;
    Node left;
    Node right;
    Node(int val){
        val = this.val;
    }
}
public class syntax_BinaryTree {
    public static void main(String[] args) {
        //         1
        //       /   \
        //     2      5
        //    / \     / \
        //   3   4   6   7
        //tree - [1 2 3 4 5 6 7]


        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        a.left = b; b.left = c; b.right = d;
        a.right = e; e.left = f; e.right = g;

    }
}
