package w4.hw2Answer;

import w4.hw2.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    public LinkedList(){
    }

    public LinkedList(int data){
        add(null, new ListNode(data), 0);
    }

    public LinkedList(ListNode nodeToAdd){
        add(null, nodeToAdd, 0);
    }

    public ListNode add(ListNode head, ListNode nodeToAdd, int position){
        if(!isAvailablePosition(head, position)) {
            throw new IndexOutOfBoundsException();
        }

        if (head == null) return nodeToAdd;

        if(position == 0){
            nodeToAdd.next = head;
            return nodeToAdd;
        }

        ListNode prevNode = getNodePosition(head, position - 1);
        nodeToAdd.next = prevNode.next;
        prevNode.next = nodeToAdd.next;
        return head;
    }

    public boolean isAvailablePosition(ListNode head, int position){
        return !(position < 0 || position > listSize(head));
    }

    public int listSize(ListNode head){
        if(head == null) return 0;
        else if(!isAvailableNext(head)) return 1;
        else{
            ListNode node = head.next;
            int size = 2;
            while(isAvailableNext(node)){
                size++;
                node = node.next;
            }
            return size;
        }
    }

    public boolean isAvailableNext(ListNode head) {
        return !(head.next == null);
    }

    public ListNode getNodePosition(ListNode head, int position){
        for (int i = 0; i < position; i++) {
            head = head.next;
        }
        return head;
    }

    public String printString(ListNode head){
        if(head == null) {
            return "";
        }

        List<String> nodes = new ArrayList<>();
        ListNode tmp = head;

        while(head != null){
            nodes.add(String.valueOf(head.getData()));
            head = head.next;
        }
        head = tmp;
        return String.join(",",nodes);
    }

}
