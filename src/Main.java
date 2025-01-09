public class Main {
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        LinkedList list = new LinkedList();
        list.addHead(10);
        list.addHead(20);
        list.addHead(30);
        list.addAfter(20, 30);
        list.print();
    }
}