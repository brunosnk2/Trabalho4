/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 0070149
 */
public class PessoaService {
    private List<Pessoa> db = new LinkedList<>();
    
    
    public PessoaService(){
            db.add(new Pessoa(1L, "Bruno"));
            db.add(new Pessoa(2L, "Marcos"));
            db.add(new Pessoa(3L, "Viviane"));
            db.add(new Pessoa(4L, "Susane"));
            
        }
    
    public List<Pessoa> getPessoas() {
		return db;
	}

	// Busca um livro pelo id
	public Pessoa getPessoa(Long id) {
            for (Pessoa pessoa : db) {
               if(pessoa.getId().equals(id)) 
                   return pessoa;
            }
	    return null;   
	}

	// Deleta o livro pelo id
	public boolean delete(Long id) {
	    for (Pessoa pessoa : db) {
               if(pessoa.getId().equals(id)) {
                   db.remove(pessoa);
                   return true;
               }
            }
	    return false;   
	}

	// Salva ou atualiza o Livro
	public boolean save(Pessoa pessoa) {
		return db.add(pessoa);
	}

	// Busca o livro pelo nome
	public List<Pessoa> findByNome(String nome) {
            List<Pessoa> aux = new LinkedList<>();
            for (Pessoa pessoa : db) {
               if(pessoa.getNome().equals(nome)) 
                   aux.add(pessoa);
            }
	    return aux;   
	}

	
    
    
}
