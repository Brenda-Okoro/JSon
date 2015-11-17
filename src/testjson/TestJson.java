package testjson;

import org.json.me.JSONArray;
import org.json.me.JSONException;
import org.json.me.JSONObject;

/**
 *
 * @author brendy
 */
public class TestJson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String nestedJson = "{\"coord\":{\"lon\":139,\"lat\":35},\n" +
"\"sys\":{\"country\":\"Nigeria\",\"sunrise\":1369769524,\"sunset\":1369821049},\n" +
"\"weather\":[{\"id\":804,\"main\":\"clouds\",\"description\":\"overcast clouds\",\"icon\":\"04n\"}],\n" +
"\"main\":{\"temp\":289.5,\"humidity\":89,\"pressure\":1013,\"temp_min\":287.04,\"temp_max\":292.04},\n" +
"\"wind\":{\"speed\":7.31,\"deg\":187.002},\n" +
"\"rain\":{\"3h\":0},\n" +
"\"clouds\":{\"all\":92},\n" +
"\"dt\":1369824698,\n" +
"\"id\":1851632,\n" +
"\"name\":\"Shuzenji\",\n" +
"\"cod\":200}";
               
        try {
            JSONObject jsonObject = new JSONObject (nestedJson);
            
            JSONObject sys = jsonObject.getJSONObject("sys");
            JSONArray weather = jsonObject.getJSONArray("weather");
            JSONObject weather_one = weather.getJSONObject(0);
            JSONObject weather_two = weather.getJSONObject(0);
            JSONObject main = jsonObject.getJSONObject("main");
                         
            String level = (String) sys.get("country");
            String level1 = weather_one.getString("description");
            String level2 = (String) main.get("temp_min");
            String level3 = (String) main.get("temp_max");
            String level4 = weather_two.getString("icon");
           
            System.out.println(level);
            System.out.println(level1);
            System.out.println(level2);
            System.out.println(level3);
            System.out.println(level4);
         
        } catch (JSONException e) {
            e.printStackTrace();
        };

    }

}
