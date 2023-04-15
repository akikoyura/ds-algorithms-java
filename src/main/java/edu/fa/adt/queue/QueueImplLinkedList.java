/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.queue;

import edu.fa.linkedlist.LinkedList;

import java.util.Iterator;

public class QueueImplLinkedList<E> implements Queue<E> {
    protected LinkedList<E> list = getNewLinkedList();

    protected LinkedList<E> getNewLinkedList() {
        return new LinkedList<>();
    }

    @Override
    public void enqueue(E value) {
        list.appendLast(value);
    }

    @Override
    public E dequeue() {
        if (list.getLength() == 0) return null;

        E value = list.getFirst();
        list.removeFirst();
        return value;
    }

    @Override
    public E peek() {
        if (list.getLength() == 0) return null;

        return list.getFirst();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    public static void main(String[] args) {
        Queue<Integer> store = new QueueImplLinkedList<>();
        store.enqueue(3);
        store.enqueue(4);
        store.enqueue(5);
        System.out.println(store.dequeue());
        System.out.println(store.dequeue());
        System.out.println(store.dequeue());
        System.out.println(store.dequeue());
    }

}
