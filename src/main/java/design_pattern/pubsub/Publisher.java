package design_pattern.pubsub;

import java.util.ArrayList;
import java.util.List;

public class Publisher {
    List<Subscriber> subscriberList;

    public Publisher() {
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


