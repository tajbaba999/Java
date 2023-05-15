import java.util.Scanner;

public class LinkedListUse {

    public static Node<Integer> createLinkedlist(){
        Node<Integer> n1;
        n1 = new Node<>(10);
        Node<Integer> n2 = new Node<>(20);
        Node<Integer> n3 = new Node<>(30);
     //   Node<Integer> n4 = new Node<>(40);
        n1.next =n2;
        //System.out.println("n1 "+ n1 +"data" + n1.data +"Next" + n1.next);
        n2.next = n3;
       // System.out.println("n2 "+ n1 +"data" + n1.data +"Next" + n1.next);
       // n3.next = n4;
       // System.out.println("n3 "+ n3 +"data" + n3.data +"Next" + n3.next);
        //System.out.println("n4 "+ n4 + "data" + n4.data +"Next" + n4.next);


       return n1;
    }
    public static void incrment(Node<Integer> head){
        head.data++;
    }
    public static void print(Node<Integer> head){
        Node<Integer> temp = head;
        while (temp.next != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
//        public static Node<Integer> takeInput(){
//            Scanner sc = new Scanner(System.in);
//            int data = sc.nextInt();
//            Node<Integer> head = null;
//            while (data != -1){
//                Node<Integer> currentNode = new Node<Integer>(data);
//                if (head == null){
//                  head =  currentNode;
//                }
//                else {
//                    Node<Integer> tail =head;
//                    while (tail.next != null){
//                        tail=tail.next;
//                    }
//                    tail.next=currentNode;
//                }
//                data= sc.nextInt();
//            }
//            return head;
//
//        }



        public static Node<Integer> takeInput(){
            Scanner s= new Scanner(System.in);
            int data = s.nextInt();
            Node<Integer> head = null;
            while(data != -1){
                Node<Integer> currentNode= new Node<integer>(data);
                if(head==null){
                    head=currentNode;
                }else{
                    Node<Integer> tail = head;
                    while(tail.next != null){
                        tail= tail.next;
                    }
                    tail.next= currentNode;
                }
                data=s.nextInt();
            }
            return head;
//        System.out.println(head);
//        System.out.println(head.data);
//        System.out.println(head.next);
//        System.out.println(head.next.data);
//        System.out.println(head.next.next);
//        System.out.println(head.next.next.data);
    }
    public static void main(String[] args) {
            Node<Integer> head = takeInput();
          //  incrment(head);
          //  print(head);
       // length(head)
//        Node n1 = new Node(10);
//        System.out.println(n1);
//        System.out.println(n1.data);
//        System.out.println(n1.next);
    }
}
