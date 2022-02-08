package devweb.mensalistas.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.ManyToOne;

@Entity
@Table(name="pagamento")
public class Pagamento implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long codPagamento;

    @Column(name="ano")
    private short ano;

    @Column(name="mes")
    private byte mes;

    @Column(name="valor")
    private float valor;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonBackReference
    private Jogador jogador;
    
    public long getCodPagamento() {
        return codPagamento;
    }

    public void setCodPagamento(long codPagamento) {
        this.codPagamento = codPagamento;
    }

    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }

    public Pagamento(){}

    public Pagamento(long codPagamento, short ano, byte mes, float valor) {
        this.codPagamento = codPagamento;
        this.ano = ano;
        this.mes = mes;
        this.valor = valor;
    }

    public short getAno() {
        return ano;
    }

    public void setAno(short ano) {
        this.ano = ano;
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        this.mes = mes;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento [ano=" + ano + ", codPagamento=" + codPagamento + ", jogador=" + jogador + ", mes=" + mes
                + ", valor=" + valor + "]";
    }

    
}