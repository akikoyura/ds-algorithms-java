/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 05, 2023
 * @Version 1.0
 */
package edu.fa.linkedlist;

import java.util.Iterator;
import java.util.function.Consumer;

public class ListIterator<E> implements Iterator<E> {
    protected Node<E> firstNode;
    protected Node<E> nextNode;
    protected Node<E> currentNode = null;
    protected Node<E> prevNode = null;

    public ListIterator(Node<E> first) {
        this.firstNode = first;
        this.nextNode = firstNode;
    }

    @Override
    public boolean hasNext() {
        return nextNode != null;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new IllegalStateException();
        }
        this.prevNode = currentNode;
        this.currentNode = nextNode;
        nextNode = nextNode.next;
        return currentNode.value;
    }

    @Override
    public void remove() {
        if (currentNode == null || currentNode == prevNode) {
            throw new IllegalStateException();
        }
        if (currentNode == firstNode) {
            firstNode = nextNode;
        } else {
            prevNode.next = nextNode;
        }

        currentNode = prevNode;
    }

    public void setValue(E value) {
        currentNode.value = value;
    }
}
