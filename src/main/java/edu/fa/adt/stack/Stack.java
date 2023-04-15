/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.stack;

public interface Stack<E> extends OrderStore<E> {
    void push(E value);

    E pop();

    E peek();

    @Override
    default E checkFirst() {
        return peek();
    }

    @Override
    default void insert(E value) {
        push(value);
    }

    @Override
    default E pickFirst() {
        return pop();
    }
}
