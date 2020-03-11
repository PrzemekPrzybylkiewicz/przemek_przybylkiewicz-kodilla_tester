package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplication {

    private MessageService messageService = new MessageService() {
        @Override
        public void send(String message, String receiver) {

        }
    };

    public SimpleApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    public void processMessage(String messeage, String receiver) {
        if (checkReceiver(receiver)) {
            this.messageService.send(messeage, receiver);
        }
    }

    public boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
