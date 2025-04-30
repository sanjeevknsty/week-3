
class CricleNode{
    int taskId;
    String name;
    int priority;
    CricleNode next;
    CricleNode(int taskId, String name, int priority){
        this.taskId = taskId;
        this.name = name;
        this.priority = priority;
        next = null;
    }
}

class CircularLinkedList{
    CricleNode head;
    public CircularLinkedList(){
        head = null;
    }

    void insertAtBegin(int taskId, String name, int priority){
        CricleNode newNode = new CricleNode(taskId, name, priority);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        CricleNode temp = head;
        while (temp.next != head){
            temp= temp.next;
        }
        newNode.next = head;
        head = newNode;
        temp.next = head;
        System.out.println("Inserted");

    }
    void insert(int taskId, String name, int priority){
        CricleNode newNode = new CricleNode(taskId, name, priority);

        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }



        CricleNode temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        System.out.println("Inserted");

    }

    void display(){
        CricleNode temp = head;
        while(temp.next != head){
            System.out.println("**********");
            System.out.println("Task Id " + temp.taskId);
            System.out.println("Name " + temp.name);
            System.out.println("Priority " + temp.priority);
            temp = temp.next;
        }

        if(temp.next == head){
            System.out.println("**********");
            System.out.println("Task Id " + temp.taskId);
            System.out.println("Name " + temp.name);
            System.out.println("Priority " + temp.priority);
        }

    }

    void delete(int taskId){
        CricleNode temp = head;
        if(temp!= null && temp.taskId == taskId){
            head = temp.next;
            return;
        }

        CricleNode prev = null;

        while(temp.next != head && temp.taskId != taskId){
            prev = temp;
            temp = temp.next;

        }
        System.out.println("DELETED " + taskId);
        prev.next = temp.next;

    }


}
public class Q3 {
    public static void main(String[] args) {
        CircularLinkedList  cl1 = new CircularLinkedList();
        cl1.insert(2332,"fight",1);
        cl1.insert(2333,"Wash",2);
        cl1.insert(2334,"fight",3);
        cl1.insertAtBegin(2335,"Study",1);

        cl1.delete(2335);
        cl1.display();
    }
}
