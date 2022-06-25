import java.util.logging.*;
public class Main {
    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger(Main.class.getName()); // создаем логгиер и ук. имя класса в скобках

        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "Тестовое логирование");
        logger.info("Тестовое логирование2");
    }
}