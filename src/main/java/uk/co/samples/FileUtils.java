package uk.co.samples;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Read application properties.
 *
 * @author Julio Cesar Bolaños Palacios
 * @version 1.0
 * @since 02/03/2017
 */
public class FileUtils {

    private static final String CONNECTION_PROPERTIES = "/connection.properties";
    private static Properties config;
    private static InputStream is = null;

    static {
        if (config == null) {
            config = new Properties();
            is = FileUtils.class.getResourceAsStream(CONNECTION_PROPERTIES);
        }
    }

    public static Properties getConfig() {
        try {
            config.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        return config;
    }

    public String getValue(String key) {
        return getConfig().getProperty(key);
    }
}

