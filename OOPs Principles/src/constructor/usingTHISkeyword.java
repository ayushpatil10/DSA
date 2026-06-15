package constructor;

public class usingTHISkeyword {
    int ID ;
    String name ;

    usingTHISkeyword(int ID,String name){
        this.ID = ID;
        this.name = name;
    }

    public static void main(String[] args) {
        usingTHISkeyword a = new usingTHISkeyword(10,"Ayush");
        System.out.println(a.ID);
        System.out.print(a.name);
    }
}
