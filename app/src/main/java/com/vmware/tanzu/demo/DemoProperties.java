package com.vmware.tanzu.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.beans.ConstructorProperties;

@ConfigurationProperties("app")
public record DemoProperties(String message) {
}
