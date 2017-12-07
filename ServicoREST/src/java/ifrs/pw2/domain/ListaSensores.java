/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifrs.pw2.domain;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Bruno
 */
@XmlRootElement (name="sensores")
public class ListaSensores implements Serializable {
     private static final long serialVersionUID = 1L;
     
     private List<Sensor> sensores;
     
     @XmlElement(name="sensores")
     public List<Sensor> getSensores(){
        return sensores;
    }
    
    public void setSensores(List<Sensor> sensores){
        this.sensores = sensores;
    }
    @Override
    public String toString(){
        return "ListaSensores [sensores "+sensores + "]";
    }
     
    
    
    
    
    
}
