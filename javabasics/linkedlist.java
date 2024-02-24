public class linkedlist {
  class node {
    int data;
    node next;

    public node(int data) {
      this.data = data;
      this.next = null;
    }
  }

  public static node head;
  public static node tail;

  public void addFirst(int data) {
    // step 1 = create new node
    node newNode = new node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step 2 = newnode next = head
    newNode.next = head;
    // step 3 = head = new node
    head = newNode;
  }

  public void addLast(int data) {
    // step 1 = create new node
    node newNode = new node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    // step 2 = tailnode next = head
    tail.next = newNode;

    // step 3
    tail = newNode;

  }

  public void print() {
    node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
    System.out.println("null");

  }
  public static void main(String[] args) {
    linkedlist ll = new linkedlist();
    ll.print();
    ll.addFirst(1);
    ll.print();
    ll.addFirst(2);
    ll.print();
    ll.addLast(4);
    ll.print();
    ll.addLast(7);
    ll.print();

  }
}
