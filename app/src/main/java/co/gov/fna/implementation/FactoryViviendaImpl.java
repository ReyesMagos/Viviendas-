package co.gov.fna.implementation;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.gov.fna.interfaces.IFactoryVivienda;
import co.gov.fna.entidades.Vivienda;

/**
 * Created by usuario on 2/07/14.
 */
public class FactoryViviendaImpl implements IFactoryVivienda {

    private static FactoryViviendaImpl instance;
    private List<Vivienda> listaViviendas;
    private FactoryViviendaImpl(){

    }

    public static FactoryViviendaImpl getInstance(){
        if(instance==null){
            instance = new FactoryViviendaImpl();
        }
        return instance;
    }


    @Override
    public List<Vivienda> getViviendasRest() {
        return listaViviendas;
    }




    @Override
    public void fillViviendas(JSONArray arreglo, String[] arrayPropertiesNames) {

        if(arreglo==null||arreglo.length()==0){
            return;
        }

        listaViviendas= new ArrayList<Vivienda>();
        JSONObject object;
        try{
            for (int i = 0; i <arreglo.length() ; i++) {

                object = arreglo.getJSONObject(i);
                Vivienda v = new Vivienda();
                int j = 0;
                v.setAcabado(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setAreaDesde(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setAreHasta(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setBarrio(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setCantidadDeInmueblesDisponibles(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setCaracteristicasProyecto(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setClaseDEVivienda(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setCiudad(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDepartamento(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDiaDeAtencionDesde(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDiaDeAtencionHasta(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDireccionProyecto(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDireccionSalaDeVentas(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDireccionSedePrincipalConstructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setEmailConstructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setHoraDeAtencionDesde(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDiaDeAtencionHasta(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setLocalidadoZona(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setNitConstructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setNombreContactoConstructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setNombreContatoSalaDeVentas(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setNombreConstructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setNombreProyecto(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setNombreRepresentanteLegalConstructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setPrecioDesde(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setPrecioHasta(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setTelefonoCelularSalaDeVentas(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setTelefonoContactContructora(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setTelefonoFijoSalaDeVentas(object.getString(arrayPropertiesNames[j]));
                j++;





            }


        }catch(JSONException e){
            return;
        }

    }
}
