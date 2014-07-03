package co.gov.fna.vivienda.co.gov.fna.vivienda.servicios;

import android.os.AsyncTask;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

import co.gov.fna.vivienda.co.gov.fna.vivienda.utilidades.FactoryVivienda;
import co.gov.fna.vivienda.modelo.entidades.Vivienda;

/**
 * Created by usuario on 1/07/14.
 */
public class GetRestServices extends AsyncTask<String,String, String> {

    //esta es la url del servicio web
    private String url;
    private String TAG_RESPONSE_OK="its_ok";
    private String TAG_RESPONSE_ERROR="something_go_wrong";

    public GetRestServices(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    @Override
    protected String doInBackground(String... strings) {
        HttpClient cliente= new DefaultHttpClient();
        HttpGet del = new HttpGet(url);

        String stringResp;
        try{
            HttpResponse resp= cliente.execute(del);
            HttpEntity entity= resp.getEntity();
            stringResp = EntityUtils.toString(entity);
            JSONObject respJSON= new JSONObject(stringResp);
            JSONArray arregloJSON = respJSON.getJSONArray("d");
            FactoryVivienda factory = FactoryVivienda.getInstance();
            List<Vivienda> lista= factory.getViviendasRest(arregloJSON);



        }catch(Exception e){

            return TAG_RESPONSE_ERROR;

        }
        return TAG_RESPONSE_OK;

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
    }
}
