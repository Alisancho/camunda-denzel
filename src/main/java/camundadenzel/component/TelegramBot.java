package camundadenzel.component;

import org.jetbrains.annotations.NotNull;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;

import java.util.Objects;

public class TelegramBot extends TelegramLongPollingBot {
    private final String token;
    private final String name;
    private final Long chat_id;

    public TelegramBot(@NotNull String token,
                       @NotNull String name,
                       @NotNull Long chat_id) {
        this.token = token;
        this.name = name;
        this.chat_id = chat_id;

        sendMessage("START_SERVER");
    }


    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage() != null && update.getMessage().hasText() && Objects.equals(update.getMessage().getChatId(), this.chat_id)) {
            try {
                // получение сообщений
                // update.getMessage().getText()
            } catch (Throwable ignored) {

            }
        }
    }

    @Override
    public String getBotUsername() {
        return name;
    }

    @Override
    public String getBotToken() {
        return token;
    }

    public void sendMessage(String mess) {
        SendMessage sendMessage = new SendMessage(chat_id, mess);
        try {
            execute(sendMessage);
        } catch (Throwable ignored) {
        }
    }
}