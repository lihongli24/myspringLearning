package com.li.myspringlearning;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:/custom.properties")
@ConfigurationProperties("user")
public class PropertySourceConfig {

    private String userName;

    private Integer age;


    /**
     * get userName value
     *
     * @return userName value
     */
    public String getUserName() {
        return userName;
    }

    /**
     * set userName value
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * get age value
     *
     * @return age value
     */
    public Integer getAge() {
        return age;
    }

    /**
     * set age value
     */
    public void setAge(Integer age) {
        this.age = age;
    }
}
