package LinkedLists;

import java.util.*;
public class LinkedListUtils {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public int sise=0;

    public static Node convertArr2LL(int[] arr) {
        head=new Node (arr[0]);
        Node mover=head;
        for (int i=1;i<arr.length;i++){
            Node temp=new Node (arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }

    public static void checkIfPresent(int val) {
        Node temp=head;
        while(temp!=null){
            if(temp.data==val){
                System.out.print("node is present ");
                return;
            }
            temp=temp.next;
        }
        System.out.print("node is not present ");
    }

    public static Node deleteHead() {
        if(head==null){
            return null;
        }
        head=head.next;
        return head;

    }

    public static void main(String[] args) {
        int[] arr={3,6,2,8};
        head=convertArr2LL(arr);
        head=deleteHead();
        //print a linked list and size of ll
        Node temp=head;
        int count=0;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            count++;
        }


    }
}
