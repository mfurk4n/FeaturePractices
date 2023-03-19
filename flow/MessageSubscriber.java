package flow;

import java.util.concurrent.Flow;

public class MessageSubscriber<T> implements Flow.Subscriber<T> {

    //reactive stream
    private Flow.Subscription subscription;

    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        subscription.request(1);

    }

    @Override
    public void onNext(T item) {
        System.out.println("Message received: " + item);
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        throwable.printStackTrace();
    }

    @Override
    public void onComplete() {
        System.out.println("Done");
    }
}


