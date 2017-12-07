/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Pessoa implements Serializable {
     private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String cidade;
    private String descricao;

     public Pessoa(){}
    
    public Pessoa(Long id, String nome, String cidade, String descricao) {
        this.id = id;
        this.nome = nome;
        this.cidade = cidade;
        this.descricao = descricao;
    }

    public Pessoa(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "id=" + id + ", nome=" + nome + '}';
    }
      

     /* public enum Status {
        OK, INSERIR, ATUALIZAR, EXCLUIR
    }*/

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
