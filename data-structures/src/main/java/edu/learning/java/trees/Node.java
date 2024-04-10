package edu.learning.java.trees;

/**
 * --Node-- The binary tree is built using this nested node class. Each node stores one data
 * element, and has left and right sub-tree pointer which may be null. The node is a "dumb" nested
 * class -- we just use it for storage; it does not have any methods.
 */
public class Node {
  int data;
  Node left, right;

  public Node() {
    this.data = -1;
    left = null;
    right = null;
  }

  public Node(int key) {
    this.data = key;
    left = null;
    right = null;
  }

  public Node(int key, Node leftNode, Node rightNode) {
    this.data = key;
    left = leftNode;
    right = rightNode;
  }
}
