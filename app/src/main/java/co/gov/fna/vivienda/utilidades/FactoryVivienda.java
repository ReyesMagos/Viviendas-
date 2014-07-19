package co.gov.fna.vivienda.utilidades;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

import co.gov.fna.vivienda.modelo.entidades.Ubicacion;
import co.gov.fna.vivienda.modelo.entidades.Vivienda;

/**
 * Created by usuario on 2/07/14.
 */
public class FactoryVivienda implements IFactoryVivienda {

    private static FactoryVivienda instance;
    private List<Vivienda> listaViviendas;

    private FactoryVivienda() {

    }

    public static FactoryVivienda getInstance() {
        if (instance == null) {
            instance = new FactoryVivienda();
        }
        return instance;
    }


    @Override
    public List<Vivienda> getViviendasRest() {
        return listaViviendas;
    }


    @Override
    public void fillViviendas(JSONArray arreglo, String[] arrayPropertiesNames) {

        if (arreglo == null || arreglo.length() == 0) {
            return;
        }

        listaViviendas = new ArrayList<Vivienda>();
        JSONObject object;
        try {
            for (int i = 0; i < arreglo.length(); i++) {

                object = arreglo.getJSONObject(i);
                Vivienda v = new Vivienda();
                int j = 0;
                v.setAcabado(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setAplicaSubsidio(object.getString(arrayPropertiesNames[j]));
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
                v.setCreditoFna(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setCiudad(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setCuotaInicial(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setCuotaMensual(object.getString(arrayPropertiesNames[j]));
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
                v.setEstadoObra(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setFechaDeEntrega(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setEstrato(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setHoraDeAtencionDesde(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setDiaDeAtencionHasta(object.getString(arrayPropertiesNames[j]));
                j++;
                List<String> l = new ArrayList<String>();
                l.add(object.getString(arrayPropertiesNames[j]));
                j++;
                l.add(object.getString(arrayPropertiesNames[j]));
                j++;
                l.add(object.getString(arrayPropertiesNames[j]));
                j++;
                l.add(object.getString(arrayPropertiesNames[j]));
                j++;
                l.add(object.getString(arrayPropertiesNames[j]));
                j++;
                l.add(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setUrlImagenes(l);

                //Latitud
                Double x = Double.parseDouble(object.getString(arrayPropertiesNames[j]));
                Double y = 12.2;
                Ubicacion u = new Ubicacion(x, y);
                //acaba
                j++;
                v.setLocalidadoZona(object.getString(arrayPropertiesNames[j]));
                j++;
                //longitud
                y = Double.parseDouble(object.getString(arrayPropertiesNames[j]));
                u.setLonguitud(y);
                v.setUbicacion(u);
                //Aca acaba
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
                v.setTipoInmuebleOfrecido(object.getString(arrayPropertiesNames[j]));
                j++;
                v.setValorInmueble(object.getString(arrayPropertiesNames[j]));
                listaViviendas.add(v);

            }



        } catch (JSONException e) {
            return;
        }

    }
}
