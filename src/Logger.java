package src;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;

public class Logger {
    public static void Hate() throws Exception {

        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Main.class.getName()); // ������� ������ � ��. ��� ������ � �������

        FileHandler fh = new FileHandler("log.txt", true);
        logger.addHandler(fh);

        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.log(Level.WARNING, "�������� �����������");
        logger.info("�������� ����������� 2");
        logger.warning("�������");
    }
}
