package main.java.org.example.Task1;

public class Handler {
    private int quantity;
    private Handler next;

    public Handler(int quantity) {
        this.quantity = quantity;
    }

    public void setNext(Handler tray) {
        this.next = tray;
    }

    public void process(int amount) {
        if (amount % quantity > 0 && next == null) {
            throw new IllegalArgumentException();
        } else if (next != null && amount % quantity != 0) {
            System.out.println(amount / quantity + " * " + quantity);
            next.process(amount % quantity);
        } else {
            System.out.println(amount / quantity + " * " + quantity);
        }
    }
}
