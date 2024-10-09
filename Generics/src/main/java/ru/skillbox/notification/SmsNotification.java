package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class SmsNotification implements Notification {
    private String massage;
    private List<String> receivers;

    @Override
    public String getMessage() {
        return massage;
    }
}
