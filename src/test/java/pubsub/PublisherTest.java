package pubsub;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import design_pattern.pubsub.Publisher;
import design_pattern.pubsub.Subscriber;

import static org.junit.jupiter.api.Assertions.*;


class PublisherTest {

    private int count;

    @BeforeEach
    private void setUp() {
        count = 0;
    }

    private class SubscriberMock implements Subscriber {
        public void receive(String message) {
            assertEquals("Hello World!", message);
            count++;
        }
    }

    @Test
    public void testPublish(){
        Publisher publisher = new Publisher();
        publisher.addSubscriber(new SubscriberMock());
        publisher.addSubscriber(new SubscriberMock());

        publisher.publish("Hello World!");

        assertEquals(2, this.count);
    }
}