package mediatorpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users = new ArrayList<>();

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String msg, User sender) {
        for (User u : users) {
            // Message should not be received by the sender
            if (u != sender) {
                u.receive(msg);
            }
        }
    }
}
