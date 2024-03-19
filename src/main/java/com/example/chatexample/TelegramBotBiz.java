//package com.example.chatexample.biz;
//
//import com.example.chatexample.TelegramBotConfigProperties;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.telegram.telegrambots.bots.TelegramLongPollingBot;
//import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
//import org.telegram.telegrambots.meta.api.objects.Update;
//import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
//
//import java.util.List;
//
///**
// * @Author: Gilang Whisperer
// * Created on 19/03/2024
// */
//
//@Component
//public class TelegramBotBiz extends TelegramLongPollingBot {
//
//    @Autowired
//    private TelegramBotConfigProperties botConfig;
//
//
//    @Override
//    public String getBotUsername() {
//        return botConfig.getUsername();
//    }
//
//    @Override
//    public String getBotToken() {
//        return botConfig.getToken();
//    }
//    @Override
//    public void onUpdateReceived(Update update) {
//        if (update.hasMessage() && update.getMessage().hasText()) {
//            String chatId = update.getMessage().getChatId().toString();
//            String messageText = update.getMessage().getText();
//
//            SendMessage message = new SendMessage();
//            message.setChatId(chatId);
//            message.setText("You said: " + messageText);
//
//            try {
//                execute(message);
//            } catch (TelegramApiException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//}
