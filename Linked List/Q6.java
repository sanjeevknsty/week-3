import java.util.LinkedList;
import java.util.Queue;

class CircularNode{
    int Id;
    int time;
    int priority;
    int remainingTime;
    int waitingTime;
    int turnaroundTime;
    CircularNode next;
    public CircularNode(int Id, int time, int priority){
        this.Id = Id;
        this.time = time;
        this.priority = priority;
        this.remainingTime = time;
        this.waitingTime = 0;
        this.turnaroundTime = 0;
        next = null;
    }

}

class CircleLinkedList{
    CircularNode head;

    public CircleLinkedList() {
        head = null;
    }


    public void roundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        CircularNode current = head;
        int time = 0;
        System.out.println("\nExecuting Round-Robin Scheduling:");

        while (true) {
            display(); // Display queue after each round

            if (current.remainingTime > 0) {
                if (current.remainingTime > timeQuantum) {
                    time += timeQuantum;
                    current.remainingTime -= timeQuantum;
                    System.out.println("Process " + current.Id + " executed till time " + time + ", remaining: " + current.remainingTime);
                } else {
                    time += current.remainingTime;
                    current.remainingTime = 0;
                    current.turnaroundTime = time;
                    current.waitingTime = time - current.time;
                    System.out.println("Process " + current.Id + " finished at time " + time);
                }
            }
            current = current.next;

            if (allProcessesFinished()) break;
        }

        calculateAverageTimes();
    }

    public void remove(int pid) {
        if (head == null) return;
        CircularNode temp = head, prev = null;

        // Find the process to remove
        while (temp.Id != pid) {
            prev = temp;
            temp = temp.next;
            if (temp == head) return;  // Process not found
        }

        // Remove the process
        if (temp == head && temp.next == head) {
            head = null;  // Only one process in list
        } else if (temp == head) {
            CircularNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            head = head.next;
            last.next = head;
        } else {
            prev.next = temp.next;
        }
    }

    private boolean allProcessesFinished() {
        if (head == null) return true;
        CircularNode temp = head;
        do {
            if (temp.remainingTime > 0) return false;
            temp = temp.next;
        } while (temp != head);
        return true;
    }

    // Calculate and display average waiting and turnaround times
    private void calculateAverageTimes() {
        int totalWaitingTime = 0, totalTurnaroundTime = 0, count = 0;
        CircularNode temp = head;
        System.out.println(head);
        do {
            totalWaitingTime += temp.waitingTime;
            totalTurnaroundTime += temp.turnaroundTime;
            count++;
            temp = temp.next;
        } while (temp != head);

        double avgWaitingTime = (double) totalWaitingTime / count;
        double avgTurnaroundTime = (double) totalTurnaroundTime / count;

        System.out.println("\nAverage Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turnaround Time: " + avgTurnaroundTime);
    }

    void insertAtBegin(int Id, int time, int priority){
        CircularNode newNode = new CircularNode(Id,time,priority);

        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        CircularNode temp = head;
        while (temp.next != head){
            temp = temp.next;
        }

        newNode.next = head;
        head = newNode;
        temp.next = head;
        System.out.println("Inserted");
    }

    void insert(int Id, int time, int priority){
        CircularNode newNode = new CircularNode(Id,time,priority);
        if(head == null){
            head = newNode;
            newNode.next = head;
            return;
        }
        CircularNode temp = head;

        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;
        System.out.println("Inserted");
    }

    void display(){
        CircularNode temp = head;

        while( temp.next != head ){
            System.out.println("Id " + temp.Id + " Time " + temp.time + " Priority " + temp.priority);

            temp = temp.next;
        }

        if(temp.next == head){

            System.out.println("Id " + temp.Id + " Time " + temp.time + " Priority " + temp.priority);


        }
    }



}

public class Q6 {
    public static void main(String[] args) {
        CircleLinkedList cl1 = new CircleLinkedList();
        cl1.insert(123,3,1);
        cl1.insert(124,4,2);
        cl1.insert(125,5,3);
        cl1.insertAtBegin(122,23,4);

        cl1.roundRobin(3);


    }
}


