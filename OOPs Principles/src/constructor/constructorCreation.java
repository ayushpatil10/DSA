package constructor;
//constructor is created when object is created
public class constructorCreation {
    int ID;
    constructorCreation(){
        ID= 45;
    }

    public static void main(String[] args) {
        constructorCreation cs = new constructorCreation();
        System.out.print(cs.ID);
    }
}
