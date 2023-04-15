/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.stack;

import edu.fa.util.NoSpaceException;

import java.util.Iterator;

public class StackImplArray<E> implements Stack<E> {
    protected E[] array;
    int top = -1;

    public StackImplArray(int size) {
        this.array = (E[]) new Object[size];
    }

    @Override
    public void push(E value) {
        if (top == array.length - 1) throw new NoSpaceException("No more space in stack");

        top++;
        this.array[top] = value;
    }

    @Override
    public E pop() {
        if (top == -1) return null;

        top--;
        return array[top + 1];
    }

    @Override
    public E peek() {
        if (top == -1) return null;
        return array[top];
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            int nextPos = 0;

            @Override
            public boolean hasNext() {
                return nextPos <= top;
            }

            @Override
            public E next() {
                return array[nextPos++];
            }
        };
    }

    public static void main(String[] args) {
        Stack<Integer> store = new StackImplArray<>(4);
        store.push(4);
        store.push(3);
        store.push(2);

        for (var item : store) {
            System.out.println(item);
        }
    }
}
