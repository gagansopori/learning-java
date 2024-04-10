package edu.learning.java.trees;

public class BinaryTrees {

  static Node root;

  public static boolean lookup(int data) {
    return (lookup(root, data));
  }

  public static void insert(int data) {
    root = insert(root, data);
  }

  /** Recursive lookup -- given a node, recur down searching for the given data. */
  private static boolean lookup(Node node, int data) {

    if (node == null) return false;

    if (data == node.data) {
      return true;
    } else if (data < node.data) {
      return lookup(node.left, data);
    } else {
      return lookup(node.right, data);
    }
  }

  /**
   * Recursive insert -- given a node pointer, recur down and insert the given data into the tree.
   * Returns the new node pointer (the standard way to communicate a changed pointer back to the
   * caller).
   */
  private static Node insert(Node node, int data) {

    if (node == null) {
      return new Node(data);
    } else {
      if (data <= node.data) {
        node.left = insert(node.left, data);
      } else {
        node.right = insert(node.right, data);
      }
    }
    return node;
  }

  /**
   * This is a very basic problem with a little pointer manipulation. Write code that builds the
   * following little 1-2-3 binary search tree... <br>
   * 2 <br>
   * / \ <br>
   * 1 3
   *
   * <p>Write the code in three different ways...
   *
   * <p>a: by calling newNode() three times, and using three pointer variables <br>
   * b: by calling newNode() three times, and using only one pointer variable <br>
   * c: by calling insert() three times passing it the root pointer to build up the tree
   *
   * <p>(In Java, write a build123() method that operates on the receiver to change it to be the
   * 1-2-3 tree with the given coding constraints. See Section 4.) struct node* build123() {
   */
  public static Node build123() {
    root = null;
    root = insert(root, 4);
    root = insert(root, 2);
    root = insert(root, 1);
    root = insert(root, 3);
    root = insert(root, 5);
    return root;
  }

  /**
   * Tree-List Recursion: Write a recursive function treeToList(Node root) that takes an ordered
   * binary tree and rearranges the internal pointers to make a circular doubly linked list out of
   * the tree nodes. The "previous" pointers should be stored in the "small" field and the "next"
   * pointers should be stored in the "large" field. The list should be arranged so that the nodes
   * are in increasing order. Return the head pointer to the new list. The operation can be done in
   * O(n) time -- essentially operating on each node once. Basically take figure-1 as input and
   * rearrange the pointers to make figure-2
   */
  //  public static

  public static void main(String[] args) {
    build123();
  }
}
