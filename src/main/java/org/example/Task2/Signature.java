package main.java.org.example.Task2;


import lombok.Getter;

import java.util.function.Consumer;

public class Signature<T> extends Task<T> {
    @Getter
    private Consumer<T> consumer;
    private StampingVisitor stampingVisitor = new StampingVisitor();
    public Signature(Consumer<T> consumer) {
        this.consumer = consumer;
    }

    public void apply(T arg) {
        this.freeze();
        stampingVisitor.onSignature(this, getHeaders());
        consumer.accept(arg);
    }
}
