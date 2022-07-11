package io.java.JSON;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonEncode {
    public static void main(String[] args) throws JSONException {
        JSONObject object = new JSONObject();
        // TO add / build json
        object.put("name", "Gohul");
        object.put("PhoneNo", 100);
        object.put("Graduate", true);

        System.out.println(object);



    }
}
