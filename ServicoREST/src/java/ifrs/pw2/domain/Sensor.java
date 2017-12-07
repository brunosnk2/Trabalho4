/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bruno
 */
@XmlRootElement
public class Sensor implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private Long id;
    private String nome;
    private String valor;

    public Sensor() {}

    public Sensor(Long id, String nome, String valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Sensor(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

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

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Sensor{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + '}';
    }
    
    
    
    
    
}
