package labbase;

import java.util.List;

class Messages {
    private List<Message> messages;

    public void addMessage(Message message) {
        this.messages.add(message);
    }

    public void deleteMessage(Message message) {
        this.messages.remove(messages.indexOf(message));
    }
}
