package flow;

import java.util.List;
import java.util.concurrent.SubmissionPublisher;

public class Main {
    public static void main(String[] args) {
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        MessageSubscriber<String> subscriber = new MessageSubscriber<>();

        publisher.subscribe(subscriber);

        //her bir mesaj için demo
        List<String> items = List.of("Hi!", "My name is Furkan", "I am from Turkey");

        items.forEach(m -> {
            publisher.submit(m);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        publisher.close();
    }
}
