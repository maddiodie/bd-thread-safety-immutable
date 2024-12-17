

import java.util.Date;
import java.util.Objects;

public final class ChatMessageContent {

    private final ChatUser sender;
    private final String message;
    private final Date creationDate;

    /**
     *
     * @param sender ChatUser for sender so we can look at username as well as id.
     * @param message The message to send.
     * @param creationDate date the message was created
     */
    public ChatMessageContent(ChatUser sender, String message, Date creationDate) {
        this.sender = sender;
        this.message = message;
        this.creationDate = new Date(creationDate.getTime());
    }

    public ChatUser getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public Date getCreationDate() {
        return new Date(creationDate.getTime());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatMessageContent)) return false;
        ChatMessageContent that = (ChatMessageContent) o;
        return Objects.equals(getSender(), that.getSender())
                && Objects.equals(getMessage(), that.getMessage())
                && Objects.equals(getCreationDate(), that.getCreationDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSender(), getMessage(), getCreationDate());
    }

}
