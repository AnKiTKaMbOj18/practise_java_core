package practise_java_core;

public class Node {

  protected int data;
  protected Node link;

  public Node() {

  }

  public Node(int d, Node n) {
    this.data = d;
    this.link = n;
  }

  /*  Function to get data from current Node  */
  public int getData() {
    return data;
  }

  /*  Function to set data to current Node  */
  public void setData(int data) {
    this.data = data;
  }

  /*  Function to get link to next node  */
  public Node getLink() {
    return link;
  }

  /*  Function to set link to next Node  */
  public void setLink(Node link) {
    this.link = link;
  }
}
