/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import com.google.gson.Gson;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Will
 */
@Path("Pato")
public class Pato {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Pato
     */
    public Pato() {
    }

    /**
     * Retrieves representation of an instance of ws.Pato
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("Marinheiro/{Agora}")
    public String getJson(@PathParam("Agora") String Agora){
        if(Agora !="Agora vai"){
            return Agora;
        }
        else{
            return "ta funcionado";
        }
    }

    /**
     * PUT method for updating or creating an instance of Pato
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
