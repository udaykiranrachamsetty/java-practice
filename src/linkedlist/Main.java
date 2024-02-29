package linkedlist;

public class Main {
    public static void main(String[] args) {
        LL l = new LL();
        l.insertatbeginning(3);
        l.insert(5);
        l.insert(6);
        l.insert(7);
        l.insertatbeginning(9);
        l.insertatithposition(8,2);
        System.out.println(l.size);
        l.display();
    }
}
