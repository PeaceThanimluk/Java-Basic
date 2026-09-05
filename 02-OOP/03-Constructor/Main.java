class User {
    // Attribute
    String user_name;
    Integer user_id;

    //Overloading

    //Constructor ที่รับ 2 parameter
    public User(String name, int Id){
        this.user_name = name;
        this.user_id = Id;

        System.out.println("User have 2 data");
    }

    // Constructor ที่รับ 1 parameter
    public User(String name){
        this.user_name = name;
        this.user_id = 0;

        System.out.println("User have 1 data");
    }

    // Constructor ที่รับ 0 parameter
    public User(){
        this.user_name = "Anonymouse";
        this.user_id = 0;

        System.out.println("User have none of data ");
    }

    // Method of class
    void showStatus() {
        System.out.println("Username : " + this.user_name);
        System.out.println("Id : " + this.user_id);
    }

}

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Femboy", 1);
        User user2 = new User("KuyDum");
        User user3 = new User();

        user1.showStatus();
        user2.showStatus();
        user3.showStatus();

    }
}
