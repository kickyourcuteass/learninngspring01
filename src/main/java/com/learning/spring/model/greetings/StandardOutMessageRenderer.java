package com.learning.spring.model.greetings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("renderer")
public class StandardOutMessageRenderer implements MessageRenderer {
    private String name;

    private MessageProvider messageProvider;

    public StandardOutMessageRenderer() {
        System.out.println("StandardOutMessageRenderer - constructor called!");
        this.name = "Ioana's Standard Out Message Renderer";
    }

    @Override
    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException("You must set the property messageProvider of class " + StandardOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    @Autowired
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }

    @Override
    public String toString() {
        return "StandardOutMessageRenderer{" +
                "name = "+name+
                ", messageProvider=" + messageProvider +
                '}';
    }
}
