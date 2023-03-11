package Properties;

import java.util.logging.Logger;

import static org.apache.commons.lang3.ObjectUtils.isEmpty;

public class Configurations {
    private static final Logger LOG = Logger.getLogger(Configurations.class.getName());
    public static String baseUrls = System.getProperty("URL", "http://localhost:8080");

   /* public static String getProperty (String key)
    {
        return props.getProperty(key);
    }
}*/

    public static String reportsUrl = getReportsUrl();

    static String getReportsUrl() {
        String reportsUrl = System.getProperty("selenide.reportsUrl");
        if (isEmpty(reportsUrl)) {
            reportsUrl = getJenkinsReportsUrl();
            if (isEmpty(reportsUrl)) {
                LOG.config("Variable selenide.reportsUrl not found");
            }
        } else {
            LOG.config("Using variable selenide.reportsUrl=" + reportsUrl);
        }
        return reportsUrl;
    }

    private static String getJenkinsReportsUrl() {
        String build_url = System.getProperty("URL");
        if (!isEmpty(build_url)) {
            LOG.config("Using Jenkins BUILD_URL: " + build_url);
            return build_url + "artifact/";
        }
        else {
            LOG.config("No BUILD_URL variable found. It's not Jenkins.");
            return null;
        }
    }


}
