import customPackages.formula;

public class packageCheck_2 {
    public static void main(String[] args) {
        formula fr = new formula();
        //public can be access in different package
        //(it is different package because we import it not write in.)
        fr.AreaOfCircle(5);

        //fr.AreaOfTriangle(2,5); --> NOT possible due to default (private in package)
        //only same package can access as access in packageCheck1 because it is in same package
    }
}
