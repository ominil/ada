package com.ominil.clients.notification;

import lombok.AllArgsConstructor;
import lombok.Builder;

@Builder
public record NotificationRequest (
        Long userID,
        String message
) {}
