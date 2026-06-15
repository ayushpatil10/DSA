package inheritances;

class telephone{
    void call() {
        System.out.println("Can make a call");
    }
}
class nokiaPhone extends telephone{
    void message(){
        System.out.println("Able to chat");
    }
}
class smartPhone extends nokiaPhone{
    void touchScreen(){
        System.out.println("Touch Screen phones");
    }
    public static void main(String[] args) {
        smartPhone phones = new smartPhone();
        phones.call();
        phones.message();
        phones.touchScreen();

        telephone tele = new telephone();
        tele.call();
       //error --> tele.message();   not inherits
    }
}