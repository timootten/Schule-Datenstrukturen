package exam2;

public class Main {

    public static void main(String[] args) {

        List list = new List();
        list.appendD("A");
        list.appendD("B");
        list.appendD("C");
        list.appendD("D");

        list.toFirst();
        list.next();
        list.next();
        list.removeD();

        nextLoop(list);
        prevLoop(list);
    }

    public static void nextLoop(List list) {
        list.toFirst();
        while (list.hasAccess()) {
            System.out.println(list.getObject());
            list.next();
        }
    }

    public static void prevLoop(List list) {
        list.toLast();
        while (list.hasAccess()) {
            System.out.println(list.getObject());
            list.prev();
        }
    }

}
