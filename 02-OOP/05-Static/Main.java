class Item {

    static int itemCounter = 0; //Static Variables = object ใช้ร่วมกันได้
    String item_name;

    Item(String name){
        this.item_name = name;

        itemCounter++; //ทุกครั้งที่สร้าง object จะเพิ่ม itemcounter

        System.out.println(this.item_name + " is number " + itemCounter);
    }

    void showCounter()
    {
        System.out.println("Item Total : " + itemCounter);
    }

    //Static Method = เป็น Method ของ class ภายนอกสามารถใช้ได้ เอาไว้ใช้เมื่อไม่จำเป็นต้องพึ่งข้อมูลของ object
    static void showItem(){
        System.out.println("Item Counter : " + itemCounter);
    }

}


public class Main {
    public static void main(String[] args) {
        Item item1 = new Item("Femboy");
        Item item2 = new Item("Skibidy");

        item1.showCounter();
        item2.showCounter();

    }    
}
