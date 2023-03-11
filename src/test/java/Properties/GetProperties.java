package Properties;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static com.sun.corba.se.impl.util.Utility.printStackTrace;


/*@SpringBootApplication
@ConfigurationPropertiesScan("src/test/java/resources/application.properties")*/
//@Component
public class GetProperties {

    /*public static void main(String[] args) {
                SpringApplication.run(Properties.Properties.class, args);
            }
        }*/
         /*@Value("${URL}")
        public String URLl;

        public String getURL() {
            System.out.println(URLl);
            return URLl;
        }
        public void setURL(String URLl) {
            this.URLl = URLl;
        }

            @Value("${login}")
            public String login;

            public String getlogin() {
                return login;
            }
            public void setlogin (String login) {
                this.login = login;
            }

            @Value("${password}")
            private String password;

            public String getpassword() {
                return password;
            }
            public void setpassword (String password) {
                this.password = password;
            }*/
     protected static FileInputStream fileInputStream;
    protected static Properties PROPERTIES;

    static {
        try {
            fileInputStream = new FileInputStream("src/test/resources/application.properties");
            PROPERTIES = new Properties();
            PROPERTIES.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
        public static String getProperty (String key)
        {
            return PROPERTIES.getProperty(key);
        }


  /*public static InputStream inputStream;
  public static Properties props;
    static {


    Properties props = new Properties();
    InputStream inputStream = GetProperties.class.getClassLoader().getResourceAsStream("application.properties");
props.get(inputStream);
    String url = props.getProperty("URL");
    }
    public static String getProperty (String key)
    {
        return props.getProperty(key);
    }*/
}


