package devweb.mensalistas.model;

import javax.persistence.*;

@Entity
@Table(name="pagamento")
public class Pagamento {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long cod_pagamento;

    @Column(name="ano")
    private short ano;

    @Column(name="mes")
    private byte mes;

    @Column(name="valor")
    private float valor;

    @Column(name="cod_jogador")
    private long cod_jogador;
    
    public Pagamento(){}

    public Pagamento(long cod_pagamento, short ano, byte mes, float valor, long cod_jogador) {
        this.cod_pagamento = cod_pagamento;
        this.ano = ano;
        this.mes = mes;
        this.valor = valor;
        this.cod_jogador = cod_jogador;
    }

    public long getCod_pagamento() {
        return cod_pagamento;
    }

    public void setCod_pagamento(long cod_pagamento) {
        this.cod_pagamento = cod_pagamento;
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

    public long getCod_jogador() {
        return cod_jogador;
    }

    public void setCod_jogador(long cod_jogador) {
        this.cod_jogador = cod_jogador;
    }

    
}