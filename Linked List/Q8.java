class DoublelyLinkedList{
    String text;
    DoublelyLinkedList prev;
    DoublelyLinkedList next;
    public DoublelyLinkedList(String text){
        this.text = text;
        prev = null;
        next = null;
    }
}

class UndoRedo{
    DoublelyLinkedList currentNode;
    DoublelyLinkedList head;
    private int historyLimit = 10;
    private int historyCount = 0;
    public UndoRedo(){
        head = null;
    }

    void insert(String text){
        DoublelyLinkedList newNode = new DoublelyLinkedList(text);


        if(currentNode != null){
            newNode.prev = currentNode;
            currentNode.next = newNode;
        }
        currentNode = newNode;
        historyCount++;

        if(historyCount> historyLimit){
            DoublelyLinkedList temp = currentNode;
            while(temp.prev != null){
                temp = temp.prev;
            }
            temp.prev = null;
//            historyCount--;
        }

    }
    public void undo() {
        if (currentNode != null && currentNode.prev != null) {
            currentNode = currentNode.prev;
            System.out.println("Undo: Current state -> " + currentNode.text);
        } else {
            System.out.println("Undo not possible.");
        }
    }
    public void redo() {
        if (currentNode != null && currentNode.next != null) {
            currentNode = currentNode.next;
            System.out.println("Redo: Current state -> " + currentNode.text);
        } else {
            System.out.println("Redo not possible.");
        }
    }
    public void displayCurrentNode(){
        if(currentNode != null){
            System.out.println("Current state -> " + currentNode.text);
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        UndoRedo ur1 = new UndoRedo();
        ur1.insert("we");
        ur1.insert("we are ");
        ur1.insert("we are here");
        ur1.displayCurrentNode();

        ur1.undo();
        ur1.undo();
        ur1.displayCurrentNode();

        ur1.redo();
        ur1.redo();
        ur1.displayCurrentNode();
    }
}
