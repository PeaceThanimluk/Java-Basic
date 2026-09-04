public class StringLesson {
    public static void main(String[] args) {
        String message1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String message2 = "Femboy";

        String Message3 = "Hello";
        String Message4 = "Hello";

        String special_character = "We are called \"Femboy\" hahaha";
        String backslash = "The character \\ is called backslash!";

        System.out.println("The length of the message string is: " + message1.length());

        System.out.println("UpperCase : " + message1.toUpperCase());
        System.out.println("LowerCase : " + message1.toLowerCase());

        System.out.println("The index of C : " + message1.indexOf('C'));

        System.out.println("Index 3 is character : " + message1.charAt(3));

        System.err.println("Is message1 quals message2 : " +  message1.equals(message2));
        System.out.println("Is Message3 = Message4 : " + Message3.equals(Message4)) ;

        System.out.println(message1 + "" + message2);
        System.out.println(message1.concat(message2));

        System.out.println(special_character);
        System.out.println(backslash);

    }


}
