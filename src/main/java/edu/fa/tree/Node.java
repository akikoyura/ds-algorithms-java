/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 17, 2023
 * @Version 1.0
 */
package edu.fa.tree;

/*
    Tree basics
    Tree terminology
    Traversals
    Basic tree algorithms
    Binary search trees (BSTs)
    Creating and traversing BSTs
    BST algorithms
 */

import edu.fa.linkedlist.LinkedList;

public class Node<E> {
    private E value;
    private LinkedList<Node<E>> children;
    protected Tree<E> hostTree;
    protected Node<E> parent;

    public LinkedList<Node<E>> getChildren() {
        return children;
    }

    public E getValue() {
        return value;
    }

    public Node(LinkedList<Node<E>> children, Tree<E> hostTree, E value, Node<E> parent) {
        this.children = children;
        this.hostTree = hostTree;
        this.value = value;
        this.parent = parent;
    }


}