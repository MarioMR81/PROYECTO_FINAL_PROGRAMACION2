package com.webapp.webapp.services;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.webapp.webapp.models.Noticia;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class APINewYorkTimes {

    public static List<Noticia> getNoticias() {
        List<Noticia> noticias = new ArrayList<>();
        String aliceJson = "null";
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.nytimes.com/svc/topstories/v2/world.json?api-key=Hcd7M0oPmJdXzw4nJhscdaL1Y0HYw9yP")
                .get()
                .build();

        try {
            Response response = client.newCall(request).execute();
            aliceJson = response.body().string();
            JSONObject Jobject = new JSONObject(aliceJson);
            JSONArray Jarray = Jobject.getJSONArray("results");

            for (int i = 0; i < Jarray.length(); i++) {
                JSONObject object     = Jarray.getJSONObject(i);
                Noticia noticia = new Noticia();
                if(!object.isNull("title") && !object.isNull("abstract") && !object.isNull("byline"))
                {
                    noticia.setTitle(object.getString("title"));
                    noticia.setAbstractt(object.getString("abstract"));
                    noticia.setByline(object.getString("byline"));
                }

                if(!object.isNull("multimedia"))
                {
                    JSONArray Jarray2 = object.getJSONArray("multimedia");
                    JSONObject object2     = Jarray2.getJSONObject(0);
                    noticia.setUrl(object2.getString("url"));
                }
                noticias.add(noticia);
            }
        } catch (IOException e) {
            //throw new RuntimeException(e);
        }
        return noticias;
    }

}
