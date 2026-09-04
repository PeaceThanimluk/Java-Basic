public class Condition {
    public static void main(String[] args) {
        boolean isRaning = true;

        int number1 = 10, number2 = 20;


        //1. if
        if (isRaning) {
            System.out.println("Bring an umbrella!");
        }

        //2. if else
        if (number1 > number2) {
            System.out.println("SixSeven");
        }
        else {
            System.out.println("Baka");
        }

        int baka1 = 5, baka2 = 10, baka3 = 15;
        

        //3.if elseif else
        if (baka1 < baka2) {
            System.out.println("baka1 is less than baka2");
        } else if (baka1 < baka3) {
            System.out.println("baka1 is less than baka3");
        }
        else {
            System.out.println("Femboy");
        }

        //4.ternary operator -> variable = (condition) ? expresstionTrue : expresstionFalse;
        int time = 20;
        System.out.println((time > 19) ? "Femboy" : "KuyDum");


        //5.Condition Operators

        if (10 > 5 && 10 > 4) {
            System.out.println("You're gay");
        }

        //6.Switch

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("day = 1");
                break;
        
            case 2:
                System.out.println("day = 2");
                break;
            case 3:
                System.out.println("day = 4");
                break;
            case 4:
                System.out.println("day = 4");
                break;

            default:
                System.out.println("None of day");
        }

    }    
}
