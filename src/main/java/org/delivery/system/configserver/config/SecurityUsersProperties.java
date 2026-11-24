package org.delivery.system.configserver.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "config-server.security")
public record SecurityUsersProperties(Map<String, UserEntry> users) {
    public record UserEntry(String password, List<String> roles) {}
}