/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.stack;

import edu.fa.linkedlist.LinkedList;

import java.util.Iterator;

public class StackImplLinkedList<E> implements Stack<E> {

    protected LinkedList<E> list = getNewLinkedList();

    protected LinkedList<E> getNewLinkedList() {
        return new LinkedList<>();
    }

    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }

    @Override
    public void push(E value) {
        list.appendFirst(value);
    }

    @Override
    public E pop() {
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

    public static void main(String[] args) {
        Stack<Integer> store = new StackImplLinkedList<>();
        store.push(4);
        store.push(3);
        store.push(2);
        for (var item : store) {
            System.out.println(item.toString());
        }
    }
}
