/*
 * (C) Copyright 2023 Fresher Spring. All rights reserved.
 * @Author HoangMH1
 * @Date Apr 23, 2023
 * @Version 1.0
 */
package edu.fa.tree;

import edu.fa.functional.OneArgumentStatement;
import edu.fa.linkedlist.LinkedList;

public class Tree<E> {
    private Node<E> root;

    public Node<E> getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void addRoot(E value) {
        if (root == null) root = new Node<>(new LinkedList<>(), this, value, null);
        else throw new IllegalStateException("Trying to add new node to a non empty tree");
    }

    public Node<E> addNode(Node<E> parent, E value) {
        if (parent == null) throw new NullPointerException("Cannot add child to null parent");
        else if (parent.hostTree != this) throw new IllegalArgumentException("Parent node not a part of this tree");
        else {
            Node<E> newNode = new Node<>(new LinkedList<>(), this, value, parent);
            parent.getChildren().appendLast(newNode);
            return newNode;
        }
    }

    public void traverseDepthFirst(OneArgumentStatement<E> processor, Node<E> current) {
        processor.doSomething(current.getValue());
        current.getChildren().forEach((n) -> traverseDepthFirst(processor, n));
    }

    public void traverseDepthFirst(OneArgumentStatement<E> processor) {
        traverseDepthFirst(processor, getRoot());
    }

    public void displayText(Node<E> parent, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.println("        ");
        }
        System.out.println(parent.getValue());
        parent.getChildren().forEach((n) -> displayText(n, depth + 1));
    }

    protected void displayText() {
        displayText(getRoot(), 0);
    }


}
