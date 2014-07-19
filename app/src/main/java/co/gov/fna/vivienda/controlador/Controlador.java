package co.gov.fna.vivienda.controlador;

import com.example.usuario.tryww.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.Vivienda;
import co.gov.fna.vivienda.presentacion.actividades.MyActivity;
import co.gov.fna.vivienda.servicios.GetRestServices;
import co.gov.fna.vivienda.utilidades.FactoryVivienda;

/**
 * Created by usuario on 18/07/14.
 */
public class Controlador {

    private boolean isGoingForViviendasSet;
    private MyActivity activity;
    private String[] urlSet;

    public Controlador(MyActivity actividad){
        this.activity= actividad;
        this.urlSet= actividad.getResources().getStringArray(R.array.urlset);

    }

    public void procesaRespuestaRestFul(JSONObject objeto){
        if(isGoingForViviendasSet){
            try{
                String[] viviendaPropertysNames = activity.getResources().getStringArray(R.array.viviendas_properties_names);
                JSONArray arregloJSON = objeto.getJSONArray("d");
                FactoryVivienda factory = FactoryVivienda.getInstance();
                factory.fillViviendas(arregloJSON, viviendaPropertysNames);
            }catch(JSONException e){

            }

        }
    }

    public void getRestFullServices(){
        GetRestServices services;
        if(isGoingForViviendasSet) {
             services =
                    new GetRestServices(getUrlSet()[0]);
        }else{
            services =
                    new GetRestServices(getUrlSet()[1]);
        }
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

    public String[] getUrlSet() {
        return urlSet;
    }

    public void setUrlSet(String[] urlSet) {
        this.urlSet = urlSet;
    }
}


