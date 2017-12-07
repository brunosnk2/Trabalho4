
package ifrs.pw2.rest;

import javax.ws.rs.*;

@Path ("/hello")
public class HelloResource {
    @GET
    public String get(){
        return "HTTP GET";
    }
    @POST
    public String post(){
        return "HTTP POST";
    }
    @PUT
    public String put(){
        return "HTTP PUT";
    }
    @DELETE
    public String delete(){
        return "HTTP DELETE";
    }
}
