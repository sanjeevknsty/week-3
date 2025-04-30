
class DLL{
    int id;
    String name;
    String movieName;
    String seatNumber;

    int time;
    DLL next;
    DLL prev;
    public DLL(int id, String name, String movieName, String seatNumber,int time){
        this.id = id;
        this.name = name;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.time = time;
        next = null;
        prev = null;
    }
}

class TicketReserve{
    DLL head;
    public TicketReserve(){
        head = null;
    }

    void insert(int id, String name, String movieName, String seatNumber,int time){
        DLL newNode = new DLL(id,name,movieName,seatNumber,time);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        System.out.println("Inserted");
        DLL temp = head;
        while(temp.next != head){
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = head;
        head.prev = newNode;
    }

    void display(){
        DLL temp = head;
        while(temp.next != head){
            System.out.println("**********");
            System.out.println("Id " + temp.id + " Name " + temp.name + " Movie Name " + temp.movieName + " Seat Number " + temp.seatNumber);
            temp = temp.next;
        }
        if(temp.next == head){
            System.out.println("**********");
            System.out.println("Id " + temp.id + " Name " + temp.name + " Movie Name " + temp.movieName + " Seat Number " + temp.seatNumber);
        }
    }

    void remove(int id){
        DLL temp = head;
        if(temp.id == id){
            head = temp.next;
            return;
        }
        DLL prev = null;
        while(temp.next != head && temp.id != id){
            prev = temp;
            temp = temp.next;
        }
        if(temp.next == head){
            head.prev = temp;
        }
        prev.next = temp.next;
        temp.next.prev = prev;

    }

}

public class Q9 {
    public static void main(String[] args) {
        TicketReserve tr1 = new TicketReserve();
        tr1.insert(12,"sanjev","SuperMan","B23",11);
        tr1.insert(13,"Kohli","Batman","A20",3);
        tr1.insert(14,"Rohit","HitMan","Y5",6);
        tr1.insert(15,"Rohit","HitMan","Y5",6);
        tr1.remove(15);
        tr1.display();
    }
}
