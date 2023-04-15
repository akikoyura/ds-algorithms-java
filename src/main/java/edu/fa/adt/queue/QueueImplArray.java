/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.queue;

import edu.fa.util.NoSpaceException;

import java.util.Iterator;

public class QueueImplArray<E> implements Queue<E> {

    protected E[] array;
    protected int start = 0;
    protected int end = 0;
    protected int length = 0;

    public QueueImplArray(int size) {
        this.array = (E[]) new Object[size];
    }

    @Override
    public void enqueue(E value) {
        if (this.length >= array.length) throw new NoSpaceException("No more space to add an element");
        array[end] = value;
        end = (end + 1) % array.length;
        length++;
    }

    @Override
    public E dequeue() {
        if (this.length <= 0) return null;
        E value = array[start];
        start = (start + 1) % array.length;
        length--;
        return value;
    }

    @Override
    public E peek() {
        if (length <= 0) return null;
        return array[start];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int nextPos = start;

            @Override
            public boolean hasNext() {
                if (length == 0) {
                    return false;
                }
                if (start < end) {
                    return nextPos >= start && nextPos < end;
                } else {
                    return nextPos > start || nextPos <= end;
                }
            }

            @Override
            public E next() {
                int pos = nextPos;
                nextPos = (nextPos + 1) % array.length;
                return array[pos];
            }
        };
    }
}
