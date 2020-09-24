package camundadenzel.config;

import camundadenzel.component.VKBot;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

@Configuration
public class VKBotConfig {

    @Bean
    public VKBot getVKBot(@Value("${telegram.token}") String token,
                          @Value("${telegram.name}") String name,
                          @Value("${telegram.chatid}") Long chatid) throws TelegramApiRequestException {
        ApiContextInitializer.init();
        final var telegramBotsApi = new TelegramBotsApi();
        final var vkBot = new VKBot(token, name, chatid);
        telegramBotsApi.registerBot(vkBot);
        return vkBot;
    }
}
