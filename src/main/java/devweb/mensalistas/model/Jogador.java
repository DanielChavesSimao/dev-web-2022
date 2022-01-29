package devweb.mensalistas.model;

@Entity
@Table(name="jogador")
public class Jogador {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long cod_jogador;

    @Column(name="nome")
    private String nome;

    @Column(name="email")
    private String email;

    @Column(name="data_nasc")
    private Date data_nasc;
    
}