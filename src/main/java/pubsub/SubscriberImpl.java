package pubsub;

public class SubscriberImpl implements Subscriber {
    public void receive(String message) {
        System.out.println(message);
    }
}
