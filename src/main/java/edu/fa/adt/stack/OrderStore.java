/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 06, 2023
 * @Version 1.0
 */
package edu.fa.adt.stack;

public interface OrderStore<E> extends Iterable<E> {
    void insert(E value);

    E pickFirst();

    E checkFirst();
}
