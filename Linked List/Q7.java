import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

class SingleLinkedList{
    int id;
    String name;
    int age;
    ArrayList<Integer> Ids;
    SingleLinkedList next;
    public SingleLinkedList(int id, String name, int age,ArrayList<Integer> ids){
        this.id = id;
        this.age = age;
        this.name = name;
        this.Ids = ids;
        next = null;
    }




}


class SocialMedia{
    SingleLinkedList head;
    public SocialMedia(){
        head = null;
    }

    void insert(int id, String name,int age, ArrayList<Integer> ids){
        SingleLinkedList newNode = new SingleLinkedList(id,name,age,ids);
        if(head == null){
            head = newNode;
            return;
        }
        SingleLinkedList temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    void  display(){
        SingleLinkedList temp = head;
        while(temp != null){
            System.out.println("**********");
            System.out.println("Id " + temp.id + " Name " + temp.name + " Ids " +temp.Ids);

            temp = temp.next;
        }
    }
    public void findMutualFriends(int userId1, int userId2) {
        SingleLinkedList user1 = search(userId1);
        SingleLinkedList user2 = search(userId2);

        if (user1 == null || user2 == null) {
            System.out.println("users not found.");
            return;
        }

        HashSet<Integer> mutualFriends = new HashSet<>(user1.Ids);
        mutualFriends.retainAll(user2.Ids);

        System.out.println("Mutual friends between " + user1.name + " and " + user2.name + ":");
        if (mutualFriends.isEmpty()) {
            System.out.println("No mutual friends.");
        } else {
            for (int friendId : mutualFriends) {
                SingleLinkedList friend = search(friendId);
                System.out.println(friend.name);
            }
        }
    }

    SingleLinkedList search(int id){
        SingleLinkedList temp = head;
        while(temp != null){
            if(temp.id == id){
                return temp;
            }
            temp = temp.next;

        }
        return  null;
    }
    public void countFriends() {
        System.out.println();
        System.out.println("count ");
        SingleLinkedList temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.Ids.size() + " friends.");
            temp = temp.next;
        }
    }

}


public class Q7 {
    public static void main(String[] args) {
        SocialMedia sm1 = new SocialMedia();

        sm1.insert(1,"venom",23, new ArrayList<>(Arrays.asList(2,3)));
        sm1.insert(2,"Ram",25,new ArrayList<>(Arrays.asList(1,3)));
        sm1.insert(3,"Syam",28,new ArrayList<>(Arrays.asList(1,2)));
        sm1.display();

        sm1.findMutualFriends(1, 2);
        sm1.countFriends();

//        sm1.removeFriend(1, 3);
//        sm1.displayFriends(1);
    }
}
