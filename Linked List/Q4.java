
class SingleNode{
    String itemName;
    int itemId;
    int quantity;
    int price;
    SingleNode next;
    public SingleNode(String itemName, int itemId, int quantity, int price){
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        next = null;
    }
}

class SinglyLinkedList {
    SingleNode head;

    public SinglyLinkedList() {
        head = null;
    }

    void insertAtBegin(String itemName, int itemId, int quantity, int price) {
        SingleNode newNode = new SingleNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        head = newNode;
        System.out.println("Inserted");

    }

    void insert(String itemName, int itemId, int quantity, int price) {
        SingleNode newNode = new SingleNode(itemName, itemId, quantity, price);
        if (head == null) {
            head = newNode;
            return;
        }
        SingleNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        System.out.println("Inserted");
    }

    void display() {
        SingleNode temp = head;
        while (temp != null) {
            System.out.println("**********");
            System.out.println("Item Name " + temp.itemName);
            System.out.println("Item Id " + temp.itemId);
            System.out.println("Quantity " + temp.quantity);
            System.out.println("Price " + temp.price);
            temp = temp.next;
        }

    }

    void updateQuantity(int itemId, int quantity){

        SingleNode temp = head;

        while(temp.next != null && temp.itemId != itemId){
            temp = temp.next;
        }

        temp.quantity = quantity;

    }


    void calculateTotalPrice(){
        SingleNode  temp = head;

        while(temp !=null){
            System.out.println("Price " + temp.price + " Quantity " + temp.quantity + " Total :" + (temp.price*temp.quantity));
            temp = temp.next;
        }
    }

    void sortList(){
        SingleNode temp = head;
        SingleNode  ref = head;
        while (temp != null){
            while (ref != null && ref.price > temp.price){
                int tempPrice = temp.price;
                temp.price = ref.price;
                ref.price = tempPrice;

                int tempQuantity = temp.quantity;
                temp.quantity = ref.quantity;
                ref.quantity = tempQuantity;

                String tempName = temp.itemName;
                temp.itemName = ref.itemName;
                ref.itemName = tempName;

                int tempId = temp.itemId;
                temp.itemId = ref.itemId;
                ref.itemId = tempId;
                ref = ref.next;
            }
            temp = temp.next;
        }
    }

}

    public class Q4 {
        public static void main(String[] args) {
            SinglyLinkedList l1 = new SinglyLinkedList();
            l1.insert("Dell", 1, 23, 999);
            l1.insert("Lenovov", 2, 25, 799);
            l1.insert("Predator", 3, 27, 899);
            System.out.println("**********");
            l1.display();

            l1.updateQuantity(1,22);

//            l1.display();
            System.out.println("**********");
            l1.calculateTotalPrice();
            System.out.println( "SORTED");
            l1.sortList();

            l1.display();
        }
    }
