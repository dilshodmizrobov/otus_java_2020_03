package ru.otus.front;

import ru.otus.UserData;
import ru.otus.messagesystem.client.MessageCallback;

public interface FrontendService {
    void getUserData(long userId, MessageCallback<UserData> dataConsumer);
}

