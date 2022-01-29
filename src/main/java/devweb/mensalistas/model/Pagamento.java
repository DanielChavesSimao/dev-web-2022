package devweb.mensalistas.model;

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
    @ManyToOne
    private long cod_jogador;
    
}