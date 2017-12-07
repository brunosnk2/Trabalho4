
package ifrs.pw2.rest;
import ifrs.pw2.domain.Livro;
import ifrs.pw2.domain.LivroService;
import ifrs.pw2.domain.Response;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.*;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/livros")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class LivroResource {
	private LivroService livroService = new LivroService();

	@GET
	public List<Livro> get() {
		List<Livro> livros = livroService.getLivros();
		return livros;
	}

	@GET
	@Path("{id}")
	public Livro get(@PathParam("id") long id) {
		Livro livro = livroService.getLivro(id);
		return livro;
	}

	@GET
	@Path("/titulo/{titulo}")
	public List<Livro> getByTitulo(@PathParam("titulo") String titulo) {
		List<Livro> livros = livroService.findByTitulo(titulo);
		return livros;
	}

	@GET
	@Path("/autor/{autor}")
	public List<Livro> getByAutor(@PathParam("autor") String autor) {
		List<Livro> livros = livroService.findByAutor(autor);
		return livros;
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") long id) {
		livroService.delete(id);
		return Response.Ok("Livro deletado com sucesso");
	}

	@POST
	public Response post(Livro livro) {
		livroService.save(livro);
		return Response.Ok("Livro salvo com sucesso");
	}

	@PUT
	public Response put(Livro livro) {
		livroService.save(livro);
		return Response.Ok("Livro atualizado com sucesso");
	}
}
