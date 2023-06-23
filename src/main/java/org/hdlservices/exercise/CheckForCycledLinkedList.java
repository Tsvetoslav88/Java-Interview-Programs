package org.hdlservices.exercise;


import java.util.HashSet;

/**
 * The example show a way to be validated if Linked List has cycled relation
 */
public class CheckForCycledLinkedList {

    public static void main(String[] args) {

        CustomLinkedList2 noCycleLinkedList = new CustomLinkedList2();
        Node2 firstNode = new Node2(3);
        Node2 secondNode = new Node2(4);
        Node2 thirdNode = new Node2(5);
        Node2 fourthNode = new Node2(6);

        noCycleLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;

        System.out.println(noCycleLinkedList.hasCycle());

        CustomLinkedList2 cycleLinkedList = new CustomLinkedList2();
        cycleLinkedList.head = firstNode;
        thirdNode.next = secondNode;

        System.out.println(cycleLinkedList.hasCycle());
    }
}


class CustomLinkedList2 {
    Node2 head;

    public boolean hasCycle() {
        HashSet<Node2> nodes = new HashSet<>();
        Node2 current = head;
        while (current != null) {
            if (nodes.contains(current)) {
                return true;
            } else {
                nodes.add(current);
            }
            current = current.next;
        }

        return false;
    }
}

class Node2 {

    int data;
    Node2 next;

    public Node2(int data) {
        this.data = data;
    }
}
