package ru.skillbox.notification;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class PushNotification implements Notification{
    private String title;
    private String receivers;
    private String massage;
    private static final String EMOJI = "\uD83D\uDC4B ";

    @Override
    public String getMessage() {
        return EMOJI + massage;
    }
}
