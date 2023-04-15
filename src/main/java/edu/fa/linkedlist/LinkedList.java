/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 05, 2023
 * @Version 1.0
 */
package edu.fa.linkedlist;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Spliterator;
import java.util.function.Consumer;

public class LinkedList<E> implements Iterable<E> {

    protected int length = 0;
    protected Node<E>[] lastModifiedNode;

    protected Node<E> first;
    protected Node<E> last;

    public int getLength() {
        return this.length;
    }

    public void appendAllLast(LinkedList<E> anotherList) {
        if (first == null) {
            first = anotherList.first;
        } else {
            last.next = anotherList.first;
        }
        last = anotherList.last;
        this.length += anotherList.length;
    }

    @Override
    public Iterator<E> iterator() {
        return new ListIterator<>(this.first);
    }

    public Node<E> getNewNode() {
        Node<E> node = new Node<>();
        lastModifiedNode = new Node[]{node};
        return node;
    }

    public Node<E> appendFirst(E value) {
        Node<E> node = getNewNode();
        node.value = value;
        node.next = first;
        first = node;

        if (length == 0) last = node;
        length++;
        return node;
    }

    public Node<E> appendLast(E value) {
        Node<E> node = getNewNode();
        node.value = value;
        if (last != null) last.next = node;
        last = node;
        if (first == null) first = node;
        length++;
        return node;
    }

    public Node<E> insert(int index, E value) {
        Node<E> node = getNewNode();

        if (index < 0 || index > length) throw new IllegalArgumentException("Invalid index for insertion");

        if (index == length) {
            return appendLast(value);
        } else if (index == 0) {
            return appendFirst(value);
        } else {
            Node<E> prev = first;
            while (index > 1) {
                index--;
                prev = prev.next;
            }

            node.value = value;
            node.next = prev.next;
            prev.next = node;
            length++;
            return node;
        }
    }

    public E getFirst() {
        if (length == 0) throw new NoSuchElementException();
        return this.first.value;
    }

    public E getLast() {
        if (length == 0) throw new NoSuchElementException();
        return this.last.value;
    }

    public Node<E> removeFirst() {
        if (length == 0) throw new NoSuchElementException();

        Node<E> originalFirst = first;
        first = first.next;
        length--;
        if (length == 0) last = null;

        return originalFirst;
    }

    public E findAtIndex(int index) {
        Node<E> result = first;
        while (index >= 0) {
            if (result == null) {
                throw new NoSuchElementException();
            } else if (index == 0) {
                return result.value;
            } else {
                index--;
                result = result.next;
            }
        }
        return null;
    }

    public Node<E> removeAtIndex(int index) {
        if (index > length || index < 0) throw new NoSuchElementException();

        if (index == 0) {
            Node<E> nodeRemoved = first;
            removeFirst();
            return nodeRemoved;
        }

        Node<E> justBeforeIt = first;
        while (--index > 0) {
            justBeforeIt = justBeforeIt.next;
        }

        Node<E> nodeRemoved = justBeforeIt.next;
        if (justBeforeIt.next == last) {
            last = justBeforeIt.next.next;
        }

        justBeforeIt.next = justBeforeIt.next.next;
        length--;
        return nodeRemoved;
    }

    public void setValueAtIndex(int index, E value) {
        Node<E> result = first;
        while (index >= 0) {
            if (result == null) {
                throw new NoSuchElementException();
            } else if (index == 0) {
                result.value = value;
                return;
            } else {
                index--;
                result = result.next;
            }
        }
    }

    public Node<E> removeLast() {
        return removeAtIndex(length - 1);
    }

    @Override
    public void forEach(Consumer<? super E> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<E> spliterator() {
        return Iterable.super.spliterator();
    }
}
