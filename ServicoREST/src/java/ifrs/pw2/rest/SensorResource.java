/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.rest;

import com.google.gson.Gson;
import ifrs.pw2.domain.ListaSensores;
import ifrs.pw2.domain.Sensor;
import ifrs.pw2.domain.Response;
import ifrs.pw2.domain.SensorService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Bruno
 */
@Path("/sensores")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class SensorResource {
    
     private SensorService sensorService = new SensorService();
     
     @GET
	public String get() {
		List<Sensor> sensores = sensorService.getSensores();
                ListaSensores lista = new ListaSensores();
                lista.setSensores(sensores);
                Gson gson = new Gson();
                
                return gson.toJson(sensores);
		
	}
    
    
	@GET
	@Path("{id}")
	public Sensor get(@PathParam("id") long id) {
		Sensor sensor = sensorService.getSensor(id);
		return sensor;
	}

	@GET
	@Path("/nome/{nome}")
	public List<Sensor> getByNome(@PathParam("nome") String nome) {
		List<Sensor> sensores = sensorService.findByNome(nome);
		return sensores;
	}

	

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		sensorService.delete(id);
		return Response.Ok("Sensor deletado com sucesso");
	}

	@POST
	public Response post(Sensor sensor) {
		sensorService.save(sensor);
		return Response.Ok("Sensor salvo com sucesso");
	}

	@PUT
	public Response put(Sensor sensor) {
		sensorService.save(sensor);
		return Response.Ok("Sensor atualizado com sucesso");
	}
    
}
