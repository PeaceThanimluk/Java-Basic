class User{
    //Attribute -> when create object must set value of attribute
    String user_name;
    Integer user_id;

    //Method of class
    void showStatus(){
        System.out.println("Username : " + this.user_name);
        System.out.println("Id : " + this.user_id);
    }

}

/**
 * CreateObject
 */
public class CreateObject {
    public static void main(String[] args) {
        User user1 = new User();

        //Set Object Attribute
        user1.user_name = "Femboy";
        user1.user_id = 1;

        user1.showStatus();
    }
}
