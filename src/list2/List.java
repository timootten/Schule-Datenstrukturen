package list2;

public class List {

    private Box head = null;
    private Box tail = null;
    private Box current = null;


    public List() {

    }

    public boolean isEmpty() {
        return head == null && tail == null;
    }

    public boolean hasAccess() {
        return current == null;
    }

    public void next() {
        if(!isEmpty() && hasAccess()) {
            current = current.getNext();
        } else {
            current = null;
        }
    }

    public void prev() {
        if(!isEmpty() && hasAccess()) {
            current = current.getPrev();
        } else {
            current = null;
        }
    }

    public void toFirst() {
        if(!isEmpty()) {
            current = head;
        }
    }

    public void toLast() {
        if(!isEmpty()) {
            current = tail;
        }
    }

    public Object getObject() {
        if(hasAccess()) {
            return current.getContent();
        }
        return null;
    }

    public void setObject(Object object) {
        if(hasAccess() && object != null) {
            current.setContent(object);
        }
    }

    public void append(Object object) {
        if(object == null) return;
        Box neu = new Box(object);
        if(isEmpty()) {
            head = tail = neu;
        } else {
            tail.setNext(neu);
            tail = neu;
        }
    }

    public void insert(Object object) {
        if(object == null) return;
        if(!isEmpty() && !hasAccess()) {
            return;
        }
        if(isEmpty()) {
            append(object);
        } else {
            Box neu = new Box(object);
            if(current == head) {
                neu.setNext(head);
                head = neu;
            } else {
                Box temp = head;
                while (temp.getNext() != current) {
                    temp = temp.getNext();
                }
                neu.setNext(current);
                temp.setNext(neu);
            }
        }
    }

    public void insertD(Object object) {
        if(object == null) return;
        if(!isEmpty() && !hasAccess()) return;
        Box neu = new Box(object);
        if(isEmpty()) {
            head = tail = neu;
            current = null;
        } else {
            if(head == current) {
                head.setPrev(neu);
                neu.setNext(head);
                head = neu;
            } else {
                neu.setNext(current);
                neu.setPrev(current.getPrev());
                current.getPrev().setNext(neu);
                current.setNext(neu);
            }
        }
    }

    public void concat(List list) {
        if(list == null || list.isEmpty()) return;
        tail.setNext(list.head);
        tail = list.tail;
    }

    public void remove() {
        if(isEmpty() || !hasAccess()) return;
        if(current == head) {
            head = current.getNext();
            current = head;
        } else {
            Box temp = head;
            while (temp.getNext() != current) {
                temp = temp.getNext();
            }
            temp.setNext(current.getNext());
            current = current.getNext();
        }
    }

}
