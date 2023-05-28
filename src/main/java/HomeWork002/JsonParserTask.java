package HomeWork002;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


import java.io.FileReader;



public class JsonParserTask {

    public static void main(String[] args) {
        try ( FileReader reader = new FileReader ( "jsontest.json" ) ) {
            Object obj = new JSONParser ().parse ( reader );
            JSONArray array = (JSONArray) obj;
            for (Object it : array) {
                JSONObject jsonObject = (JSONObject) it;
                String builder = "Студент " + jsonObject.get ( "фамилия" ) +
                        " получил оценку " +
                        jsonObject.get ( "оценка" ) +
                        " по предмету " +
                        jsonObject.get ( "предмет" );
                System.out.println( builder );
            }

        } catch (Exception e) {
            System.out.println ( "Parsing error " + e );
            throw new RuntimeException ( e );
        }

    }

}
