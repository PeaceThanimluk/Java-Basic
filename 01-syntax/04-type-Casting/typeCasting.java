
public class typeCasting {
    public static void main(String[] args) {
        //1.Widening Casting
        int number1 = 10;
        double doubleNumber1 = number1; // Automatic casting: int to double

        System.out.println(doubleNumber1); //Output : 10.0

        //2.Narrowing Casting
        double number2 = 9.7855d;
        int intNumber2 = (int)number2; // Manual casting : double to int

        System.out.println(intNumber2); //Cut off the decimal places

    }
}
