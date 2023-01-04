package com.example.fkentity.fk;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.stereotype.Component;
import org.springframework.web.WebApplicationInitializer;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

@Setter
@Component
@ConfigurationProperties(prefix = "test.os")
public class EnvConfig {

    private String window;
    private String linux;
    private String path;

    @PostConstruct
    public void init() {
        System.out.println(System.getProperty("os.name"));
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            path = window;
        } else {
            path = linux;
        }
    }

    public String path() {
        return path;
    }
}
