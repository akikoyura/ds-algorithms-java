/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.queue;

import edu.fa.adt.stack.OrderStore;

import java.util.Iterator;

public interface Queue<E> extends OrderStore<E> {

    void enqueue(E value);

    E dequeue();

    E peek();

    @Override
    default E checkFirst() {
        return peek();
    }

    @Override
    default void insert(E value) {
        enqueue(value);
    }

    @Override
    default E pickFirst() {
        return dequeue();
    }
}
