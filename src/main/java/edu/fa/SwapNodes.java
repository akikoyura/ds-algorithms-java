/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 01, 2023
 * @Version 1.0
 */
package edu.fa;

class Node {
    protected int data;
    protected Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}

public class SwapNodes {

    public static Node swapsNode(Node head, int left_index, int right_index) {
        if (left_index == right_index) {
            return head;
        }

        Node onePrevious = null;
        Node oneCurrent = null;

        Node twoPrevious = null;
        Node twoCurrent = null;

        int currentIndex = 0;
        Node currentNode = head;
        Node newHead = null;

        return null;
    }

    public static Node createLinkedList(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    public static void printLinkedList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 4, 5, 2, 6, 1, 9};
        Node head = createLinkedList(arr);
        int leftIndex = 2;
        int rightIndex = 5;
        printLinkedList(createLinkedList(arr));

    }
}
