package testjson;

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

        String json = "{'country' : 'Nigeria' , 'weather' : 'Cloudy' , 'minTemperature' : '28 degree celcius minimum temperature' , 'maxTemperature' : '33 degree celcius maximum temperature' }";
        try {
            JSONObject jsonObject = new JSONObject(json);
            System.out.println(jsonObject.getString("country"));
            System.out.println(jsonObject.getString("weather"));
            System.out.println(jsonObject.getString("minTemperature"));
            if(jsonObject.has("maxTemperature"))
                 System.out.println(jsonObject.getString("maxTemperature"));
            else
                System.out.println(jsonObject.optString("maxTemperature", " Maximum temperature Not  Available"));

        } catch (JSONException e) {
            e.printStackTrace();
        };

    }

}
