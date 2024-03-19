package com.example.chatexample;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: Gilang Whisperer
 * Created on 19/03/2024
 */

@Configuration
public class TelegramBotConfig {


    @Bean
    @ConfigurationProperties(prefix = "telegram.bot")
        public TelegramBotConfigProperties telegramBotConfigProperties(){
            return new TelegramBotConfigProperties();
        }


}
