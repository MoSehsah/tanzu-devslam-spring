package com.vmware.tanzu.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app")
public record DemoProperties(String message) {
}
