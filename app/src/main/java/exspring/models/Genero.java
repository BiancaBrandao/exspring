package exspring.models;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistece.GeneratedValue;
import javax.persistece.GenerationType;

@Entity
@Table(name="generos")
public class Genero {
    @Id
    @GeneratedValue(strategy=GenerationType.Identiny)
    private int id;
    private String nome;

    public void setId(int id) {
        this.id = id;
    }    

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}