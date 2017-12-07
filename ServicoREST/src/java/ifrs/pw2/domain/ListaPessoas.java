package ifrs.pw2.domain;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name="pessoas")
public class ListaPessoas implements Serializable{
    private static final long serialVersionUID = 1L;
    private List<Pessoa> pessoas;
    
    @XmlElement(name="pessoa")
    public List<Pessoa> getPessoas(){
        return pessoas;
    }
    
    public void setPessoas(List<Pessoa> pessoas){
        this.pessoas = pessoas;
    }
    @Override
    public String toString(){
        return "ListaPessoas [pessoas "+pessoas + "]";
    }
}
