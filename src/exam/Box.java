package exam;

// Aufgabe - 5
public class Box {
  
  private Object pObject = null;
  private Box next = null;

  public Box() {
    
  }

  public Box(Object pObject) {
    this.pObject = pObject;
  }

  public Box(Object pObject, Box next) {
    this.pObject = pObject;
    this.next = next;
  }

  public Object getObject() {
    return pObject;
  }

  public void setObject(Object pObject) {
    this.pObject = pObject;
  }

  public Box getNext() {
    return next;
  }

  public void setNext(Box next) {
    this.next = next;
  }

}
