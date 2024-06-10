package exam;

public class Exams {
    public static String[] disciplines = {
            "Элементы высшей математики",
            "Технологии разработки ПО",
            "Основы проектирования БД",
            "Программный модуль 02"
    };
    public static Exam[] exams = {
            new Exam(disciplines[0], "10.06.2024"),
            new Exam(disciplines[1], "11.06.2024"),
            new Exam(disciplines[2], "12.06.2024"),
            new Exam(disciplines[3], "13.06.2024")
    };
}
