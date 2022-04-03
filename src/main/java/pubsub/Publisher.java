package pubsub;

import pubsub.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscriberList;

    Publisher() {
        this.subscriberList = new ArrayList<Subscriber>();
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    public void publish(String message) {
        for (Subscriber subscriber : this.subscriberList) {
            subscriber.receive(message);
        }
    }
}


