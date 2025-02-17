package goitpackage;

import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, String> data = new HashMap<>();
        data.put("name", "Yana");
        data.put("lastName", "Zukulis");

        Gson gson = new Gson();
        String jsonOutput = gson.toJson(data);

        System.out.println(jsonOutput);
    }
}

