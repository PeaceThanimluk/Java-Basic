
public class Method {
    public static void main(String[] args) {
        System.out.println("Main Function");
        callMethod();
        checkAge(18);
        System.out.println("10 + 20 = "+ Addition(10,20));
    }

    //1.Function none return -> use void
    static void myMethod()
    {
        System.out.println("I just Pooped!");
    }

    public static void callMethod(){
        myMethod();
    }

    //2.Function void have parameters

    static void checkAge(int age){
        if (age >= 18) {
            System.out.println("You are Old!");
        }
        else if (age >= 30) {
            System.out.println("You are too old!");
        }
        else{
            System.out.println("You are young!");
        }
    }

    //3.Function return value
    static int Addition(int number1, int number2){
        return (number1 + number2);
    }

    

}
