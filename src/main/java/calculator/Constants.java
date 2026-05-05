package calculator;

public class Constants {
    public static final String GOODBYE_MESSAGE = "До свидания!";
    public static final String ERROR_DIV_ZERO = "Ошибка: деление на ноль!";
    public static final String ERROR_INVALID_OPERATOR = "Неверный оператор!";
    public static final String ERROR_FORMAT = "Ошибка: неверный формат. Используйте: <число> <оператор> <число>";
    public static final String UNKNOWN_COMMAND = "Ошибка: неизвестная команда!";
    public static final String HELP_MESSAGE = """
        Доступные команды:
        <число> <оператор> <число>

        Операторы:
        +  сложение
        -  вычитание
        *  умножение
        /  деление
        % остаток от деления

        Дополнительные команды:
        history  — показать историю
        last     — повторить последнюю операцию
        clear    — очистить историю
        exit     — выход
        """;
}
