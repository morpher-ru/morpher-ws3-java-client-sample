package ru.morpher.ws3.client.sample;

import ru.morpher.ws3.*;

public class UsageExample extends Log {

    public static void main(String[] argv) {
        Client client = new ClientBuilder()
            // Если вы используете "Морфер.Сервер" (http://morpher.ru/webservice/local/),
            // то вы можете указать в качестве url адрес вашего локального сервера.
            // Если вам нужен https, укажите https вместо http:
            .useUrl("http://ws3.morpher.ru")
            // Рекомендуется зарегистрироваться (http://morpher.ru/Register.aspx) и указать свой токен.
            // Данный токен нужен только для демонстрации функций работы с пользовательским словарем:
            .useToken("a8dab5fe-7a47-4c17-84ea-46facb7d19fe")
            // Создаем клиент с указанными параметрами:
            .build();

        try {
            RussianDemo.demo(client.russian());
            UkrainianDemo.demo(client.ukrainian());

            log("Остаток запросов на сегодня: " + client.queriesLeftForToday());
            log("");
        } catch (java.io.IOException e) {
            log("Ошибка коммуникации: " + e.getMessage());
        } catch (AccessDeniedException e) {
            log("Ошибка доступа: " + e.getMessage());
        }
    }
}
