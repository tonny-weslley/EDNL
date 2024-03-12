package Commun;

public class Node implements Comparable<Node> {
    private int key;
    private Object element;
    private Node left;
    private Node right;

    public Node(int key, Object element) {
        this.key = key;
        this.element = element;
    }

    public int getKey() {
        return key;
    }

    public Object getElement() {
        return element;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.key, o.key);
    }
}