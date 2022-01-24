
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropUtil {
    protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;
    static {
        try {
            fileInputStream = new FileInputStream("src/main/resources/conf.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {

        } }
    public static String getProperty(String key) {
        return PROPERTIES.getProperty(key); }
}
