package devweb.mensalistas.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jogador")
public class Jogador implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long cod_jogador;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private String email;

    @Column(name = "data_nasc")
    private Date data_nasc;

    protected Jogador() {
    }

    public Jogador(String nome, String email, Date data_nasc) {
        this.nome = nome;
        this.email = email;
        this.data_nasc = data_nasc;
    }

    public long getCod_jogador() {
        return cod_jogador;
    }

    public void setCod_jogador(long cod_jogador) {
        this.cod_jogador = cod_jogador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    @Override
    public String toString() {
        return "Jogador [cod_jogador=" + cod_jogador + ", data_nasc=" + data_nasc + ", email=" + email + ", nome="
                + nome + "]";
    }
}