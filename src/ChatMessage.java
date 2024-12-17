import java.util.Date;

public final class ChatMessage implements Runnable {

    private final ChatUser recipient;
    private final ChatMessageContent messageContent;

    /**
     * ChatMessage constructor.
     * @param recipient The ChatUser object for our recipient.
     * @param messageContent The message to send.
     */
    public ChatMessage(ChatUser recipient, ChatMessageContent messageContent) {
        this.recipient = new ChatUser(recipient.getUsername(), recipient.getUserId());
        this.messageContent = new ChatMessageContent(
                new ChatUser(messageContent.getSender().getUsername(),
                        messageContent.getSender().getUserId()),
                messageContent.getMessage(), new Date(messageContent.getCreationDate().getTime()));
    }

    public ChatUser getRecipient() {
        return new ChatUser(recipient.getUsername(), recipient.getUserId());
    }

    public ChatMessageContent getMessageContent() {
        return new ChatMessageContent(
                new ChatUser(messageContent.getSender().getUsername(),
                        messageContent.getSender().getUserId()),
                messageContent.getMessage(), new Date(messageContent.getCreationDate().getTime()));
    }

    /**
     * Run the thread to send the message to a recipient.
     */
    public void run() {
        // here's where we send the message to our recipient.
        System.out.println("Message: '" + this.messageContent.getMessage() + "' has been sent to user " +
                this.getRecipient().getUsername() + " by " +
                this.messageContent.getSender().getUsername() + " on " +
                this.messageContent.getCreationDate().toString());
    }

}
