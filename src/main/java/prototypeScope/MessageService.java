package prototypeScope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    private final ObjectFactory<MessageBuilder> messageBuilder;

    MessageService(ObjectFactory<MessageBuilder> messageBuilder) {
        this.messageBuilder = messageBuilder;
    }

    Message createMessage(String content, String receiver) {
        return messageBuilder.getObject()
                .withContent(content)
                .withReceiver(receiver)
                .build();
    }
}