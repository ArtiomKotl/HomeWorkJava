package HomeWork002;
// 3) Дана json-строка (можно сохранить в файл и читать из файла)
// [
//{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}
//]
//Написать метод(ы), который распарсит json и, используя StringBuilder,
//создаст строки вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//


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
                StringBuilder builder = new StringBuilder("Студент ");
                builder.append(jsonObject.get("фамилия"))
                        .append(" получил оценку ")
                        .append(jsonObject.get("оценка"))
                        .append(" по предмету ")
                        .append(jsonObject.get("предмет"));
                System.out.println(builder);
            }

        } catch (Exception e) {
            System.out.println ( "Parsing error " + e );
            throw new RuntimeException ( e );
        }

    }

}
