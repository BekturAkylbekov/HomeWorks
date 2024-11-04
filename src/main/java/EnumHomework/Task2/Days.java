package EnumHomework.Task2;

public enum Days {
    MONDAY("Дүйшөмбү күнү жава окуйм"),
    TUESDAY("Шейшемби күнү англис тили сабагын окуйм"),
    WEDNESDAY("Шаршемби күнү математика окуйм"),
    THURSDAY("Бейшемби күнү физика окуйм"),
    FRIDAY("Жума күнү химия окуйм"),
    SATURDAY("Ишемби күнү тарых окуйм"),
    SUNDAY("Жекшемби күнү эс алам");

    public String getA() {
        return a;
    }

    private String a;

    Days(String a) {
        this.a = a;
    }
}
