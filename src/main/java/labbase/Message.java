package labbase;

public class Message {
    private String message;

    public Message(final String message) {
        if (message == null) {
            throw new IllegalArgumentException("message is null");
        }
        if (message.isEmpty()) {
            throw new IllegalArgumentException("message is empty");
        }
        if(message.length() > 2000) {
            throw new IllegalArgumentException("message is too long");
        }
        this.message = message;
    }
}
