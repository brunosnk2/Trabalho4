package ifrs.pw2.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Livro implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String autor;
    private String titulo;

    public Livro(){}
    public Livro(Long id, String autor, String titulo) {
        this.id = id;
        this.autor = autor;
        this.titulo = titulo;
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livro{" + "id=" + id + ", autor=" + autor + ", titulo=" + titulo + '}';
    }

}
