package co.gov.fna.controller;

import com.example.usuario.tryww.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import co.gov.fna.activity.MyActivity;
import co.gov.fna.servicios.GetRestServices;
import co.gov.fna.implementation.FactoryViviendaImpl;

/**
 * Created by usuario on 18/07/14.
 */
public class ControladorVivienda {

    private boolean isGoingForViviendasSet;
    private MyActivity activity;

    public void procesaRespuestaRestFul(JSONObject objeto){
        if(isGoingForViviendasSet){
            try{
                String[] viviendaPropertysNames = activity.getResources().getStringArray(R.array.viviendas_properties_names);
                JSONArray arregloJSON = objeto.getJSONArray("d");
                FactoryViviendaImpl factory = FactoryViviendaImpl.getInstance();
                factory.fillViviendas(arregloJSON, viviendaPropertysNames);
            }catch(JSONException e){

            }

        }
    }

    public void getRestFullServices(){
        GetRestServices services =
                new GetRestServices("http://servicedatosabiertoscolombia.cloudapp.net/v1/Fondo_Nacional_Ahorro/bdfnaviviendafinal?$format=json");
        this.isGoingForViviendasSet=true;
        services.execute();

    }

    public boolean isGoingForViviendasSet() {
        return isGoingForViviendasSet;
    }

    public void setGoingForViviendasSet(boolean isGoingForViviendasSet) {
        this.isGoingForViviendasSet = isGoingForViviendasSet;
    }

    public MyActivity getActivity() {
        return activity;
    }

    public void setActivity(MyActivity activity) {
        this.activity = activity;
    }
}


