package org.hdlservices.exercise;

/**
 * The example shows a way for removing of element at particular index,
 * counting from right to left
 */

public class RemoveElementFromLinkedList {

    public static void main(String[] args) {
        CustomLinkedList customLinkedList = new CustomLinkedList();

        Node firstNode = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node fourthNode = new Node(4);
        Node fifthNode = new Node(5);
        Node sixthNode = new Node(6);
        Node seventhNode = new Node(7);
        Node eighthNode = new Node(8);

        customLinkedList.head = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        fourthNode.next = fifthNode;
        fifthNode.next = sixthNode;
        sixthNode.next = seventhNode;
        seventhNode.next = eighthNode;

        customLinkedList.displayLinkedListContent();
        customLinkedList.deleteKthNodeFromEnd(6);
        customLinkedList.displayLinkedListContent();
    }

}

class CustomLinkedList {
    Node head;

    public void displayLinkedListContent() {
        Node currentElement = head;
        while (currentElement != null) {
            System.out.print(currentElement.data + " -> ");
            currentElement = currentElement.next;
        }
        System.out.println();
    }

    public void deleteKthNodeFromEnd(int k) {
        if (head == null || k == 0) {
            return;
        }

        Node first = head;
        Node second = head;

        for (int i = 0; i < k; i++) {
            second = second.next;
            if (second.next == null) {
                // K >= Length of list
                if (i == k - 1) {
                    head = head.next;

                }
                return;
            }
        }

        while (second.next != null) {
            first = first.next;
            second = second.next;
        }

        first.next = first.next.next;


    }

}

class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }

}