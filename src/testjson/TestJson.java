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

        String json = "{'country' : 'Nigeria' , 'weather' : 'Weather condition for today: Cloudy'}";
        String coord = "{'lon' : longitude 8.675277 , 'lat' :latitude 9.081999}";
        String weather = "{'main' : 'Cloud' , 'description' : 'overcast clouds' , 'icon' : '04N'}";
        String main = "{'humidity' : The average daily relative humidity for November is around 82% , 'pressure' : pressure is 1013 in Pascal , 'temp_min' : '20 degree Celcius Maximum temperature' , 'temp_max' : '35 degree Celcius maximum temperature'}";
       

        try {
            JSONObject jsonObject = new JSONObject(json);
            JSONObject jsonObject1 = new JSONObject (coord);
            JSONObject jsonObject2 = new JSONObject (weather);
            JSONObject jsonObject3 = new JSONObject (main);
            
            System.out.println(jsonObject.getString("country"));
            System.out.println(jsonObject1.getString ("lon"));
            System.out.println(jsonObject1.getString ("lat"));
            System.out.println(jsonObject.getString("weather"));
            System.out.println(jsonObject2.getString ("description"));
            System.out.println(jsonObject3.getString ("humidity"));
            System.out.println(jsonObject3.getString ("pressure"));
            System.out.println(jsonObject3.getString ("temp_min"));
            System.out.println(jsonObject3.getString ("temp_max"));
            
           
           // if(jsonObject.has("temp_max"))
                 //System.out.println(jsonObject.getString("temp_max"));
           // else
              //  System.out.println(jsonObject.optString("maxTemperature", " Maximum temperature Not  Available"));

        } catch (JSONException e) {
            e.printStackTrace();
        };

    }

}
