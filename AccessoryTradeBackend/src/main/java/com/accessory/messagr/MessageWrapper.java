package com.accessory.messagr;

public class MessageWrapper {
    Object data;
    private  MessageType messageType;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public MessageType getMessageType() {
        return messageType;
    }
    public void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }
}
