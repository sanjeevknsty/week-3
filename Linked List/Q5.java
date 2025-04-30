class DoubleNode1{
    DoubleNode1 prev;

    String title;
    String author;
    String genre;
    int id;
    boolean availability;
    DoubleNode1 next;
    public DoubleNode1(String title,String author, String genre, int id, boolean availability){
        prev = null;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.id = id;
        this.availability = availability;
        next = null;
    }

}

class DoubleLinkedList{
    DoubleNode1 head;
    public DoubleLinkedList(){
        head = null;
    }

    void insertAtBegin(String title,String author, String genre, int id, boolean availability){
        DoubleNode1 newNode = new DoubleNode1(title,author,genre,id,availability);

        if(head == null){
            head = newNode;
            newNode.prev = head;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        newNode.prev = head;
        System.out.println("Inserted");

    }

    void insert(String title,String author, String genre, int id, boolean availability){
        DoubleNode1 newNode = new DoubleNode1(title,author,genre,id,availability);

        if(head == null){
            head = newNode;
            newNode.prev = head;
            return;
        }
        DoubleNode1 temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        System.out.println("Inserted");

    }
    void display(){
        DoubleNode1 temp = head;

        while( temp!=null ){
            System.out.println("**********");
            System.out.println("Title " + temp.title);
            System.out.println("Author " + temp.author);
            System.out.println("Genre " + temp.genre);
            System.out.println("Id " + temp.id);
            System.out.println("Availability " + temp.availability);
            temp = temp.next;
        }

    }

    void delete(int id){
        DoubleNode1 temp = head;

        if(temp!=null && temp.id == id){
            head = temp.next;
        }

        while(temp != null && temp.id != id){
            temp = temp.next;
        }

        temp.prev.next= temp.next;

        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
    }


    void search(String author){
        DoubleNode1 temp = head;
        while(temp != null){
            if(temp.author.equalsIgnoreCase(author)){
                System.out.println("Found " + author);
                break;
            }
            temp = temp.next;
        }

    }

    void ReverseDisplay() {
        DoubleNode1 temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != head) {
            System.out.println("**********");
            System.out.println("Title " + temp.title);
            System.out.println("Author " + temp.author);
            System.out.println("Genre " + temp.genre);
            System.out.println("Id " + temp.id);
            temp = temp.prev;
        }
        if (temp == head) {
            System.out.println("**********");
            System.out.println("Title " + temp.title);
            System.out.println("Author " + temp.author);
            System.out.println("Genre " + temp.genre);
            System.out.println("Id " + temp.id);
        }
    }

    void updateAvailability(int id, boolean availability){
        DoubleNode1 temp = head;
        while(temp != null){
            if(temp.id == id){
                temp.availability = availability;
                break;
            }
            temp = temp.next;
        }
    }

    void countList(){
        DoubleNode1 temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        System.out.println("Count " + count);
    }

}

public class Q5 {

    public static void main(String[] args) {
        DoubleLinkedList  dl1 = new DoubleLinkedList();
        dl1.insert("Lords","Stokes","Crikcet",135,true);
        dl1.insert("Perth","Head","Crikcet",166,true);
        dl1.insert("Overseas","Ronaldo","Football",007,true);

        dl1.display();
        dl1.countList();
        dl1.search("head");

        System.out.println("-------REVERSED ORDER----------");
        dl1.ReverseDisplay();
        dl1.updateAvailability(166,false);

        System.out.println("***********************");
        dl1.display();
    }
}


