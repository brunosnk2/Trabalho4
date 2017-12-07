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
 * @author Bruno
 */
public class SensorService {
    
    private List<Sensor> db = new LinkedList<>();
    
    public SensorService(){
            db.add(new Sensor(1L, "Temperatura", "100º"));
            db.add(new Sensor(2L, "Umidade", "100%"));
            db.add(new Sensor(2L, "Chuva", "Intensa"));
            db.add(new Sensor(2L, "Quantidade de chuva", "100mm"));
            db.add(new Sensor(2L, "Velocidade do Vento", "500Km/h 270 nós"));
            
            
            
            
            
        }
    
    public List<Sensor> getSensores() {
		return db;
	}

	// Busca um livro pelo id
	public Sensor getSensor(Long id) {
            for (Sensor sensor : db) {
               if(sensor.getId().equals(id)) 
                   return sensor;
            }
	    return null;   
	}

	// Deleta o livro pelo id
	public boolean delete(Long id) {
	    for (Sensor sensor : db) {
               if(sensor.getId().equals(id)) {
                   db.remove(sensor);
                   return true;
               }
            }
	    return false;   
	}

	// Salva ou atualiza o Livro
	public boolean save(Sensor sensor) {
		return db.add(sensor);
	}

	// Busca o livro pelo nome
	public List<Sensor> findByNome(String nome) {
            List<Sensor> aux = new LinkedList<>();
            for (Sensor sensor : db) {
               if(sensor.getNome().equals(nome)) 
                   aux.add(sensor);
            }
	    return aux;   
	}

    
}
