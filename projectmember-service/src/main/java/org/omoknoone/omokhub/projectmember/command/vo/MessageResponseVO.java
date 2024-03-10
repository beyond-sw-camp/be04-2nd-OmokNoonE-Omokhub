package org.omoknoone.omokhub.projectmember.command.vo;

public class MessageResponseVO {
    private String message;

    public MessageResponseVO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ChangeLeaderResponseVO{" +
                "message='" + message + '\'' +
                '}';
    }
}
