//ABSTRACT CLASS
abstract class Employee {
    private String name;

    //abstract class ก็ยังมี constructor และ subclass ก็นำมาใช้ได้
    public Employee(String name) {
        this.name = name;
    }

    //abstract method
    abstract double calculateSalary();

    //Getter Method
    public void showName() {
        System.out.println("Name : " + this.name);
    }

}

//ABSTRACT SUBCLASS
class fullTimeEmployee extends Employee {
    private double monthlySalary;

    public fullTimeEmployee(String name, double salary) {
        super(name);
        this.monthlySalary = salary;

    }

    @Override //when use abstract method must place Override
    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int Hours;

    public PartTimeEmployee(String name, double hourly_rate, int hours) {
        super(name);
        this.hourlyRate = hourly_rate;
        this.Hours = hours;
    }

    @Override
    double calculateSalary() {
        return (this.hourlyRate * this.Hours);
    }

}

//Non-Abstract Class
class Product {
    private String product_name;
    private double product_price;

    public Product(String name, double price) {
        this.product_name = name;
        this.product_price = price;
    }

    public void setProductPrice(double new_price) {
        this.product_price = new_price;
    }

    public double getProductPrice() {
        return this.product_price;
    }

    public String getProductName() {
        return  this.product_name;
    }



}


public class Main {
    public static void main(String[] args) {
        //create object
        Employee employee1 = new fullTimeEmployee("Femboy", 10000);
        Employee employee2 = new PartTimeEmployee("Skibidy", 200, 6);

        employee1.showName();
        employee2.showName();

        Product lemon = new Product("lemon", 10);
        System.out.println("Product : " + lemon.getProductName());
       


    }    
}
