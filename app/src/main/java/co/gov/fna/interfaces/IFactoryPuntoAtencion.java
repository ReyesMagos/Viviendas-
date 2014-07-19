package co.gov.fna.interfaces;

import org.json.JSONArray;

import co.gov.fna.entidades.PuntoAtencion;
import java.util.List;

/**
 * Created by Alexis-PC on 19/07/2014.
 */
public interface IFactoryPuntoAtencion {

    List<PuntoAtencion> getPuntoAtencionRest();

    public void fillPuntoAtencion(JSONArray arreglo, String [] arrayPropertiesNames);
}
