package co.gov.fna.vivienda.co.gov.fna.vivienda.utilidades;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.Vivienda;

/**
 * Created by usuario on 2/07/14.
 */
public class FactoryVivienda implements IFactoryVivienda {

    private static FactoryVivienda instance;
    private FactoryVivienda(){

    }

    public static  FactoryVivienda getInstance(){
        if(instance==null){
            instance = new FactoryVivienda();
        }
        return instance;
    }


    @Override
    public List<Vivienda> getViviendasRest(JSONArray arreglo) {

        if(arreglo==null||arreglo.length()==0){
            return null; //el tamaño de la lista es 0 deberemos vericar donde la solicitamos su tamaño
        }
        List<Vivienda> lista = new ArrayList<Vivienda>();
        JSONObject object;
        try{
            for (int i = 0; i <arreglo.length() ; i++) {
                object = arreglo.getJSONObject(i);
                Vivienda v = new Vivienda();
                v.setAcabado(object.getString("acabados"));
                v.setAreaDesde(object.getString("areadesde"));
                v.setAreHasta(object.getString("areahasta"));
                v.setBarrio(object.getString("barrio"));
                v.setCantidadDeInmueblesDisponibles(object.getString("cantidadde_inmuebles_disponibles"));
                v.setCaracteristicasProyecto("caracteristicasproyecto");
                v.setCiudad(object.getString("ciudad"));
                lista.add(v);

            }


        }catch(JSONException e){
            return null;
        }


        return lista;
    }
}
