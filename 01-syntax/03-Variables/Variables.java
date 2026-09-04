
public class Variables {
    public static void main(String[] args) {
        String name_test = "Femboy";
        int Number = 15;
        float myFloat = 3.1445555f;
        boolean myBool = true;

        byte byteNumber = 100;
        long longNumber = 15000000L;
        
        double doubleNumber = 19.99d;

        char charater = 'A';
        
        String firstName = "Skibidy";
        String lastName = "FemboyHaha";

        int Number1 = 10;
        int Number2 = 20;

        int Number3 = 30, Number4 = 40, Number5 = 50;

        int x,y,z;
        x = y = z = 50;
        x = 40;

        final int constNum = 99; //const value , constant value = cant change


        System.out.println(name_test);
        System.out.println(Number);
        System.out.println(myFloat);
        System.out.println(myBool);

        System.out.println(firstName + lastName);

        System.out.println("The sum is " + Number1 + Number2);
        System.err.println("The sum is " + (Number1 + Number2));

        System.err.println(Number3 + Number4 + Number5);

        System.err.println(x + y + z);

        System.err.println(constNum);

        System.out.println(byteNumber + longNumber + doubleNumber);

        System.out.println(charater);
    }   

}
