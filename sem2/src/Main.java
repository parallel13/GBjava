// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String jsonString = " { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        parseJsonString(jsonString);

    }

    static void parseJsonString(String jsonString) {
        StringBuilder result = new StringBuilder();
        jsonString = jsonString.substring(1, jsonString.length() - 1);
        String[] objects = jsonString.split("},");

        for (String object : objects) {
            object = object.replace("{", "").replace("}", "");
            String[] properites = object.split(",");

            String surname = properites[0].split(":")[1].replace("\"", "");
            String grsade = properites[1].split(":")[1].replace("\"", "");
            String subject = properites[2].split(":")[1].replace("\"", "");

            result.append("Студент ").append(surname).append(" получил ").append(grsade).append(" по предмету ").append(subject).append("\n");
        }
        System.out.println(result);
    }
}
