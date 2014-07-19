package co.gov.fna.vivienda.controlador;

import com.example.usuario.tryww.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

<<<<<<< HEAD:app/src/main/java/co/gov/fna/vivienda/controlador/Controlador.java
import co.gov.fna.vivienda.presentacion.actividades.Time;
=======
import co.gov.fna.vivienda.presentacion.actividades.TimelineActivity;
>>>>>>> Propiedades-Viviendas-:app/src/main/java/co/gov/fna/vivienda/controlador/ControladorTimelineActivity.java
import co.gov.fna.vivienda.servicios.GetRestServices;
import co.gov.fna.vivienda.utilidades.FactoryVivienda;

/**
 * Created by usuario on 18/07/14.
 */
public class ControladorTimelineActivity {

    private boolean isGoingForViviendasSet;
<<<<<<< HEAD:app/src/main/java/co/gov/fna/vivienda/controlador/Controlador.java
    private Time activity;
    private String[] urlSet;

    public Controlador(Time actividad){
=======
    private TimelineActivity activity;
    private String[] urlSet;

    public ControladorTimelineActivity(TimelineActivity actividad){
>>>>>>> Propiedades-Viviendas-:app/src/main/java/co/gov/fna/vivienda/controlador/ControladorTimelineActivity.java
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
                    new GetRestServices(getUrlSet()[0],getActivity());
        }else{
            services =
                    new GetRestServices(getUrlSet()[1],getActivity());
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

<<<<<<< HEAD:app/src/main/java/co/gov/fna/vivienda/controlador/Controlador.java
    public Time getActivity() {
        return activity;
    }

    public void setActivity(Time activity) {
=======
    public TimelineActivity getActivity() {
        return activity;
    }

    public void setActivity(TimelineActivity activity) {
>>>>>>> Propiedades-Viviendas-:app/src/main/java/co/gov/fna/vivienda/controlador/ControladorTimelineActivity.java
        this.activity = activity;
    }

    public String[] getUrlSet() {
        return urlSet;
    }

    public void setUrlSet(String[] urlSet) {
        this.urlSet = urlSet;
    }
}

