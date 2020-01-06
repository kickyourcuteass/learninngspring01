package com.learning.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource(locations = {"classpath:spring/app-context-xml.xml"})
public class AppXmlConfig {
}
