package org.hdlservices.exercise;

/**
 * Search an element in Binary Search Tree
 */
public class SearchInBinaryTree {

    public static void main(String[] args) {
        Node3 rootNode = new Node3();
        rootNode.data = 2;

        BinarySearchTree tree = new BinarySearchTree();
        tree.root = rootNode;

        tree.insert(1);
        tree.insert(3);
        tree.insert(4);
        tree.insert(6);
        tree.insert(8);

        System.out.println(tree.contains(8));
    }
}

class BinarySearchTree {
    Node3 root;

    public void insert(int value) {
        insert(root, value);
    }

    private Node3 insert(Node3 root, int value) {
        if (root == null) {
            root = new Node3();
            root.data = value;
        } else if (value < root.data) {
            // insert on left
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    public boolean contains(int value) {
        return this.contains(this.root, value);
    }

    public boolean contains(Node3 root, int value) {
        if (root == null) {
            return false;
        }

        if (root.data > value) {
            return this.contains(root.left, value);
        }

        if (root.data < value) {
            return this.contains(root.right, value);
        }
        return true;
    }

}

class Node3 {
    Node3 left;
    Node3 right;
    int data;
}
