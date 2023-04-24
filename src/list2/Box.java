package list2;

public class Box {

    private Object content = null;
    private Box next = null;
    private Box prev = null;

    public Box() {

    }

    public Box(Object content) {
        this.content = content;
    }

    public Box(Object content, Box next) {
        this.content = content;
        this.next = next;
    }

    public Box(Object content, Box next, Box prev) {
        this.content = content;
        this.next = next;
        this.prev = prev;
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

    public Box getPrev() {
        return prev;
    }

    public void setPrev(Box prev) {
        this.prev = prev;
    }
}
