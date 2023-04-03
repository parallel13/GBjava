import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String jsonString = " { \"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}," +
                "{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"4\",\"предмет\":\"Физика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"3\",\"предмет\":\"Физика\"}," +
                "{\"фамилия\":\"Краснов\",\"оценка\":\"2\",\"предмет\":\"Физика\"}";
        parseJsonString(jsonString);
        String s1= parseJsonString(jsonString);
        String filePath = "file.txt";
        wrightToFile(s1, filePath);

    }

    static String parseJsonString(String jsonString) {
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
        return result.toString();
    }


    static void wrightToFile(String s, String filePath) {
        try {
            Logger logger = Logger.getAnonymousLogger();
            FileHandler fileHandler = new FileHandler("log.txt", true);
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            try (FileWriter writer = new FileWriter(filePath, false)) {
                writer.write(s);
                writer.flush();
                logger.log(Level.INFO, "запись успешно проведена");
            } catch (Exception e) {
                e.printStackTrace();
                logger.log(Level.WARNING, e.getMessage());
            }
            fileHandler.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
