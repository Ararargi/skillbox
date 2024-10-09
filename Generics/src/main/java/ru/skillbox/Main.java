package ru.skillbox;

import ru.skillbox.notification.EmailNotification;
import ru.skillbox.notification.PushNotification;
import ru.skillbox.notification.SmsNotification;
import ru.skillbox.notification_sender.EmailNotificationSender;
import ru.skillbox.notification_sender.PushNotificationSender;
import ru.skillbox.notification_sender.SmsNotificationSender;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailNotification email1 = new EmailNotification(
                "Успешная регистрация! ",
                Arrays.asList("oleg@java.skillbox.ru", "masha@java.skillbox.ru", "yan@java.skillbox.ru"),
                "Спасибо за регистрацию в сервисе!"
        );
        List<EmailNotification> emailNotifications = Arrays.asList(email1);
        EmailNotificationSender emailSender = new EmailNotificationSender();
        emailSender.send(emailNotifications);

        SmsNotification sms1 = new SmsNotification(
                "Спасибо за регистрацию в сервисе!", Arrays.asList("+70001234567")
        );

        List<SmsNotification> smsNotifications = Arrays.asList(sms1);
        SmsNotificationSender smsSender = new SmsNotificationSender();
        smsSender.send(smsNotifications);
        PushNotification push1 = new PushNotification(
                "Успешная регистрация!", "o.yanovich",
                "Спасибо за успешную регистрацию в сервисе!"
        );
        List<PushNotification> pushNotifications = Arrays.asList(push1);
        PushNotificationSender pushSender = new PushNotificationSender();
        pushSender.send(pushNotifications);

    }
}
