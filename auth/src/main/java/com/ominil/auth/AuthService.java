package com.ominil.auth;


import com.ominil.auth.entity.UserRegistration;
import com.ominil.clients.notification.NotificationRequest;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class AuthService {

    private final KafkaTemplate<String, NotificationRequest> kafkaTemplate;

    public void register(UserRegistration userRegistration) {
        // todo register user

        NotificationRequest notificationRequest = NotificationRequest.builder()
                .username(userRegistration.username())
                .message("You succesfully created the account")
                .createdAt(LocalDateTime.now())
                .build();

        kafkaTemplate.send("auth-notification", notificationRequest);


    }
}
