public class MathLesson {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;

        int randomNumber = (int)(Math.random() * 101);

        System.out.println("Min value : " + Math.min(number1, number2));
        System.out.println("Sqaure root of 16 : " + Math.sqrt(16));
        System.out.println("Absolute of -67 : " + Math.abs(-67));
        System.out.println("2 ^ 4 : " + Math.pow(2, 4));

        //Rounding Methods
        System.out.println("Math.round(4.6) : "+ Math.round(4.6)); //Round the nearest integer
        System.out.println("Math.celi(4.1) : "+ Math.ceil(4.1)); //Rounds up
        System.out.println("Math.floor(4.9) : "+ Math.floor(4.9)); //Rounds down

        //Random
        System.out.println("Random Number (1-100) : " + randomNumber);


    }
}
