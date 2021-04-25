import org.json.JSONArray;
import org.json.JSONObject;

public class Parse {
    public static int[] data = new int[4];
    public static String[] names = new String[2];
    private static int round = 1;

    public static String parse(String responseBody){
        JSONArray country = new JSONArray(responseBody);

        JSONObject countryData = country.getJSONObject(0);

        String name = countryData.getString("name");
        int area = countryData.getInt("area");
        int population = countryData.getInt("population");

        if(round==1){
            names[0] = name;
            data[0] = area;
            data[1] = population;
            round=2;
        }

        names[1] = name;
        data[2] = area;
        data[3] = population;

        System.out.println("Nazwa kraju: "+name+", Powierzchnia: "+area+" km2, Populacja: "+population+" osób");

        return null;
    }
}
