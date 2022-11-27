package exam;

// LIFO - Last in first out
public class Stack {
 
  private Box head;
  private int size;

  public int getSize() {
    return size;
  }

  public Stack() {
    head = null;
  }

  public boolean isEmpty() {
    return head == null;
  }

  public void push(Object pObject) {
    if(pObject == null) return;
    size++;
    head = new Box(pObject, head);
  }

  public void pop() {
    if(isEmpty()) return;
    size--;
    head = head.getNext();
  }

  public Object top() {
    return head.getObject();
  }

}
