public class ArrayLoop {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        for(int index = 0; index < cars.length; index++)
        {
            System.out.println((index + 1) + ":" + cars[index]);
        }

        int[] numbers = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for(int i = 0; i< numbers.length; i++){
            sum += numbers[i];
        }

        System.out.println(sum);

        //ForEach
        for (String car : cars) {
            System.out.println(car);
        }

    }    
}
