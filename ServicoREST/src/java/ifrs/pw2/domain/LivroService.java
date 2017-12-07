package ifrs.pw2.domain;

import java.util.LinkedList;
import java.util.List;

public class LivroService {
	private List<Livro> db = new LinkedList<>();

        
        public LivroService(){
            db.add(new Livro(1L, "Fulano", "Java8"));
            db.add(new Livro(2L, "Fulano", "Java6"));
            db.add(new Livro(3L, "Fulano", "Java7"));
            db.add(new Livro(4L, "Beltrano", "JSF"));
            db.add(new Livro(5L, "Beltrano", "Primefaces"));
            db.add(new Livro(6L, "Beltrano", "Spring"));
        }
	// Lista todos os livro do banco de dados
	public List<Livro> getLivros() {
		return db;
	}

	// Busca um livro pelo id
	public Livro getLivro(Long id) {
            for (Livro livro : db) {
               if(livro.getId().equals(id)) 
                   return livro;
            }
	    return null;   
	}

	// Deleta o livro pelo id
	public boolean delete(Long id) {
	    for (Livro livro : db) {
               if(livro.getId().equals(id)) {
                   db.remove(livro);
                   return true;
               }
            }
	    return false;   
	}

	// Salva ou atualiza o Livro
	public boolean save(Livro livro) {
		return db.add(livro);
	}

	// Busca o livro pelo nome
	public List<Livro> findByAutor(String autor) {
            List<Livro> aux = new LinkedList<>();
            for (Livro livro : db) {
               if(livro.getAutor().equals(autor)) 
                   aux.add(livro);
            }
	    return aux;   
	}

	public List<Livro> findByTitulo(String titulo) {
            List<Livro> aux = new LinkedList<>();
            for (Livro livro : db) {
               if(livro.getTitulo().equals(titulo)) 
                   aux.add(livro);
            }
	    return aux;   
	}
}
