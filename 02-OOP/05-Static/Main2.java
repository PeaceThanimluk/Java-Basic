class MathTools {

    //Static Method
    static int add(int number1, int number2){
        return (number1 + number2);
    }

    static int substract(int number1, int number2){
        return  (number1 - number2);
    }

}

public class Main2 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 5;

        //Use static Method
        int result = MathTools.add(number1, number2);

        System.out.println("Result = " + result);

    }
}
