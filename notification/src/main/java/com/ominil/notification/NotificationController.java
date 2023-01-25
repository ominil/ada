package com.ominil.notification;


import com.ominil.clients.notification.NotificationClient;
import com.ominil.clients.notification.NotificationRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/notification")
@Slf4j
public class NotificationController implements NotificationClient {


    @Override
    @PostMapping("/send")
    public void sendNotification(NotificationRequest notificationRequest) {
        log.info("Notification message {}", notificationRequest.message());
    }

    @KafkaListener(topics = "auth-notification", groupId = "notification", containerFactory = "factory")
    public void stringNotification(NotificationRequest notificationRequest) {
        // todo send out email notification
        log.info("Listener Received {}", notificationRequest);
    }
}
