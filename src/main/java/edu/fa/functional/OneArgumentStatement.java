/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date May 04, 2023
 * @Version 1.0
 */
package edu.fa.functional;

@FunctionalInterface
public interface OneArgumentStatement<E>{
    void doSomething(E argument);
}
