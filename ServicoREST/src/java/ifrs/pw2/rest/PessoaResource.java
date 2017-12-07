/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.rest;

import com.google.gson.Gson;
import ifrs.pw2.domain.ListaPessoas;
import ifrs.pw2.domain.Pessoa;
import ifrs.pw2.domain.PessoaService;
import ifrs.pw2.domain.Response;
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
 * @author 0070149
 */
@Path("/pessoas")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class PessoaResource {
    private PessoaService pessoaService = new PessoaService();
    
    @GET
	public String get() {
		/*List<Pessoa> pessoas = pessoaService.getPessoas();
                Gson gson = new Gson();        
                return gson.toJson(pessoas); */
                
                List<Pessoa> pessoas = pessoaService.getPessoas();
                ListaPessoas lista = new ListaPessoas();
                lista.setPessoas(pessoas);
                Gson gson = new Gson();
                //String json = gson.toJson(lista);
                return gson.toJson(pessoas);
		//return pessoas;
	}
    
    

	@GET
	@Path("{id}")
	public Pessoa get(@PathParam("id") long id) {
		Pessoa pessoa = pessoaService.getPessoa(id);
		return pessoa;
	}

	@GET
	@Path("/nome/{nome}")
	public List<Pessoa> getByNome(@PathParam("nome") String nome) {
		List<Pessoa> pessoas = pessoaService.findByNome(nome);
		return pessoas;
	}

	

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		pessoaService.delete(id);
		return Response.Ok("Pessoa deletado com sucesso");
	}

	@POST
	public Response post(Pessoa pessoa) {
		pessoaService.save(pessoa);
		return Response.Ok("Pessoa salvo com sucesso");
	}

	@PUT
	public Response put(Pessoa pessoa) {
		pessoaService.save(pessoa);
		return Response.Ok("Pessoa atualizado com sucesso");
	}
    
    
    
    
}
