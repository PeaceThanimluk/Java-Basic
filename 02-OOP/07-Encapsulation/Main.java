class User {
    private String user_name; 
    private int user_id;
    public int Number;

    //Constructor
    public User(String name, int Id){
        this.user_name = name;
        this.user_id = Id;
    }

    //Setter Method
    public void editName(String newName){ //ใช้ได้เฉพาะใน class/object เท่านั้น
        this.user_name = newName;
    }

    //Getter Method
    public String getName(){
        return this.user_name;
    }


}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Femboy", 0);

        // user1.user_name = "Femboy"; ใช้ไม่ได้เพราะติด private

        user1.editName("Skibidy");
        System.out.println("Username : " + user1.getName());

    }
}
