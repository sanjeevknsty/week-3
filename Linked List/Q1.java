import java.sql.SQLOutput;

class Node{
    int rollNumber;
    String name;
    int age;
    Node next;
    Node(int rollNumber , String name, int age){
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        next = null;
    }
}


class LinkedList {
    Node head;

    LinkedList() {
        head = null;
    }

    void insert(int rollNumber, String name, int age) {
        Node newNode = new Node(rollNumber, name, age);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.println("**********");
            System.out.println("Roll Number " + temp.rollNumber);
            System.out.println("Age " + temp.age);
            System.out.println("Name " + temp.name);
            temp = temp.next;
        }
    }

    void search(int rollNumber){
        Node temp = head;

        while (temp != null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Found " + rollNumber);
                break;
            }
            temp = temp.next;
        }
    }

    void delete(int rollNumber){
        Node temp = head;
        Node ref  = null;

        if(temp != null && temp.rollNumber == rollNumber){
            head = temp.next;
            System.out.println("Deleted " + rollNumber);

            return;
        }

        while (temp.next != null && temp.rollNumber != rollNumber){

            ref = temp;
            temp = temp.next;
        }
        ref.next = temp.next;

    }
}
public class Q1 {
    public static void main(String[] args) {
        LinkedList l1 =  new LinkedList();
        l1.insert(12,"venom",23);
        l1.insert(13,"Ram",25);
        l1.insert(14,"Syam",27);
        l1.display();
        l1.search(14);
        System.out.println("**********");
        l1.delete(14);

        l1.display();
    }
}
