package HW7;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UrlScanner {
    public static Map<String, Integer> readFromFile() {
        int counter = 0;
        Map<String, Integer> webUrl = new HashMap<>();
        File myObj = new File("F:\\Users\\Администратор\\Desktop\\urls.txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            String tempUrl[] = data.split("/");
            String url = tempUrl[0];
            if (webUrl.containsKey(url)){
                webUrl.put(url, webUrl.get(url) + 1);
            } else {
                webUrl.put(url, 1);
            }
        }
        return webUrl;
    }
}
