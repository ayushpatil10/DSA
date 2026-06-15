package constructor;

public class constructorOverloading {
    int ID ;
    String name = "Guess-name";

    constructorOverloading(){
        ID = 45;
        name = "Rohit";
    }
    constructorOverloading(int ID){
        this.ID = ID;
    }
    constructorOverloading(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
    constructorOverloading(String name , int ID){
        this.name = name;
        this.ID =ID;
    }

    public static void main(String[] args){
        constructorOverloading a = new constructorOverloading(); //no parameter
        System.out.print(a.ID + "-->");
        System.out.println(a.name);

        constructorOverloading b = new constructorOverloading(18);
        System.out.print(b.ID + "-->");
        System.out.println(b.name);   //no-name due to no argument pass and define

        constructorOverloading c = new constructorOverloading(7,"Mahi");
        System.out.print(c.ID + "-->");
        System.out.println(c.name);

        constructorOverloading d = new constructorOverloading("Sachin", 10);
        System.out.print(d.ID + "-->");
        System.out.print(d.name);
    }
}
