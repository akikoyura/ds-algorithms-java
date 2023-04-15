/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 05, 2023
 * @Version 1.0
 */
package edu.fa.linkedlist;

public class Node<E> {
    protected E value;
    protected Node<E> next;

    public String toString() {
        return this.value.toString();
    }

    public Node<E> getNext() {
        return next;
    }

    public E getValue() {
        return this.value;
    }

}
