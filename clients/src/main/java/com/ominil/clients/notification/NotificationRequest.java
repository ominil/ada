package com.ominil.clients.notification;

import lombok.Builder;
import java.time.LocalDateTime;

@Builder
public record NotificationRequest (
        String username,
        String message,
        LocalDateTime createdAt
) {}
