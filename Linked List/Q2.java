class DoubleNode{
    DoubleNode prev;
    String movie;
    String director;
    int year ;
    int rating;
    DoubleNode next;
    public DoubleNode(String movie, String director, int year, int rating){
        prev = null;
        this.movie = movie;
        this.director = director;
        this.year = year;
        this.rating = rating;
        next = null;
    }
}


class DoublyLinkedList{
    DoubleNode head;
    public DoublyLinkedList(){
        head = null;
    }

    void insertAtBegin(String movie, String director, int year, int rating){
        DoubleNode newNode = new DoubleNode(movie,director,year,rating);
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

    void insert(String movie, String director, int year, int rating){
        DoubleNode newNode = new DoubleNode(movie,director,year,rating);
        if(head == null){
            head = newNode;
            newNode.prev = head;
            return;
        }
        DoubleNode temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        System.out.println("Inserted");

    }

    void display(){
        DoubleNode temp = head;

        while( temp!=null ){
            System.out.println("**********");
            System.out.println("Movie " + temp.movie);
            System.out.println("Director " + temp.director);
            System.out.println("Year " + temp.year);
            System.out.println("Rating " + temp.rating);
            temp = temp.next;
        }

    }

    void delete(String title){
        DoubleNode temp = head;

        if(temp!=null && temp.movie.equals(title)){
            head = temp.next;
        }

        while(temp != null && !temp.movie.equalsIgnoreCase(title)){
            temp = temp.next;
        }

        temp.prev.next= temp.next;

        if(temp.next != null){
            temp.next.prev = temp.prev;
        }
    }

    void search(String director){
        DoubleNode temp = head;
        while(temp != null){
            if(temp.director.equalsIgnoreCase(director)){
                System.out.println("Found " + director);
                break;
            }
            temp = temp.next;
        }

    }

    void ReverseDisplay(){
        DoubleNode temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        while(temp != head){
            System.out.println("**********");
            System.out.println("Movie " + temp.movie);
            System.out.println("Director " + temp.director);
            System.out.println("Year " + temp.year);
            System.out.println("Rating " + temp.rating);
            temp = temp.prev;
        }
        if(temp == head){
            System.out.println("**********");
            System.out.println("Movie " + temp.movie);
            System.out.println("Director " + temp.director);
            System.out.println("Year " + temp.year);
            System.out.println("Rating " + temp.rating);
        }
    }


    void updateRatiing(String title, int rating){
        DoubleNode temp = head;
        while(temp != null){
            if(temp.movie.equalsIgnoreCase(title)){
                temp.rating = rating;
                break;
            }
            temp = temp.next;
        }
    }



}


public class Q2 {
    public static void main(String[] args) {
        DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.insert("Jersey","Goutham",2019,10);
        dl1.insert("Batman","Noolan",2010,9);
        dl1.insert("MI","Rohit",2013,5);
        dl1.insert("CSK","Dhoni",2010,5);
        dl1.insertAtBegin("MadMax","Tjaaf",2342,7);

        dl1.display();
        System.out.println("_________________");
        dl1.search("dhoni");
        System.out.println("_________________");
        System.out.println("deleted ");
        dl1.delete("csk");
        System.out.println("_________________");
        dl1.updateRatiing("mi",9);

        dl1.ReverseDisplay();;

    }

}
