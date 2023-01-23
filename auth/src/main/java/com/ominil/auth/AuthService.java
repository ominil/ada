package com.ominil.auth;


import com.ominil.clients.notification.NotificationClient;
import com.ominil.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AuthService {

    private final NotificationClient notificationClient;


    public void register() {
        // todo register user

        NotificationRequest notificationRequest = NotificationRequest.builder()
                .message("Register user")
                .build();

        // todo make async request with kafka client
        notificationClient.sendNotification(notificationRequest);


    }
}
