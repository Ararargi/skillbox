package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;


@Getter
@AllArgsConstructor
public class EmailNotification implements Notification {
    private String subject;
    private List<String> receivers;
    private String massage;


    @Override
    public String getMessage() {
        return "<p>" + massage + "<p>";
    }
}
