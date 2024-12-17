import java.util.Objects;

public class ChatUser {

    private String username;
    private String userId;

    /**
     * Constructor for Chat user. Class used to tag messages in the chat system.
     * @param username the user's username.
     * @param userId the user's userId
     */
    public ChatUser(String username, String userId) {
        this.username = username;
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public String getUserId() {
        return userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChatUser)) return false;
        ChatUser chatUser = (ChatUser) o;
        return Objects.equals(getUsername(), chatUser.getUsername())
                && Objects.equals(getUserId(), chatUser.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getUserId());
    }

}
