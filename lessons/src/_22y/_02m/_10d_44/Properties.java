package _22y._02m._10d_44;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Properties {
    public String dbms;
    public String jarFile;
    public String dbName;
    public String userName;
    public String password;
    public String urlString;

    private String driver;
    private String serverName;
    private int portNumber;
    private java.util.Properties prop;
    private void setProperties(String fileName) throws IOException {
        this.prop = new java.util.Properties();
        FileInputStream fis = new FileInputStream(fileName);
        this.prop.loadFromXML(fis);
        /*
        <?xml version="1.0" encofding="UTF-8"?>
<!DOCTYPE properties SYSTEM "http://java.sun.com/dtd/properties.dtd">
<properties>

  <entry key="dbms">mysql</entry>
  <entry key="driver">com.mysql.cj.jdbc.Driver</entry>
  <entry key="database_name">testdb</entry>
  <entry key="user_name">root</entry>
  <entry key="password">root</entry>
  <entry key="server_name">localhost</entry>
  <entry key="port_number">3306</entry>


</properties>
*/

/*
        FileInputStream fis = null;
        fis = new FileInputStream(CONFIG_FILE_PATH);
        configFile.load(fis);
        */
/*
#komentář
dbms = mysql
server_name = vydb1.spsmb.cz
*/
        this.dbms = this.prop.getProperty("dbms");
        this.serverName = this.prop.getProperty("server_name");
        /*
        this.jarFile = this.prop.getProperty("jar_file");
        this.driver = this.prop.getProperty("driver");
        this.dbName = this.prop.getProperty("database_name");
        this.userName = this.prop.getProperty("user_name");
        this.password = this.prop.getProperty("password");

        this.portNumber = Integer.parseInt(this.prop.getProperty("port_number"));
*/
        System.out.println("Set the following properties:");
        System.out.println("dbms: " + dbms);
        System.out.println("serverName: " + serverName);
        /*
        System.out.println("driver: " + driver);
        System.out.println("dbName: " + dbName);
        System.out.println("userName: " + userName);
        System.out.println("portNumber: " + portNumber);
         */

    }
}
