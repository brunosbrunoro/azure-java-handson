package br.com.bruno.handsonazure;

import javax.ws.rs.*;

/**
 * Created by bruno on 09/05/17.
 */
@Path("/app")
public class AppResources {

    @GET
    public String somar(@QueryParam("valor1") String valor1,@QueryParam("valor2") String valor2) {
        Double val1 = Double.parseDouble(valor1);
        Double val2 = Double.parseDouble(valor2);

        Double resultado = val1+val2;

        return "Somar Resultado - "+resultado;
    }
}
