package exam;

// Aufgabe - 5
public class Box {
  
  private Object content = null;
  private Box next = null;

  public Box() {
    
  }

  public Box(Object content) {
    this.content = content;
  }

  public Box(Object content, Box next) {
    this.content = content;
    this.next = next;
  }

  public Object getContent() {
    return content;
  }

  public void setContent(Object pObject) {
    this.content = pObject;
  }

  public Box getNext() {
    return next;
  }

  public void setNext(Box next) {
    this.next = next;
  }

}
