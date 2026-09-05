import  java.util.ArrayList;

/*
    size of an array cannot be modified(if you want to add or remove element you have to create new one)

*/

public class ArrayListLesson {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars.get(0));

        cars.set(0, "Femboy");
        cars.remove(0);

        System.out.println("Cars array size :" + cars.size());

        for(int index = 0; index < cars.size(); index++)
        {
            System.out.println(index + ":" + cars.get(index));
        }

        for (String car : cars) {
            System.out.println(car);
        }
        
    }
}
