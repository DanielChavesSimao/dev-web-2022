package devweb.mensalistas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MensalistasApplication {

	// private static final Logger log = LoggerFactory.getLogger(MensalistasApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MensalistasApplication.class, args);
	}

	/* @Bean
	public CommandLineRunner demo(JogadorRepository repository) {
		return (args) -> {
			// Cria uns jogadores
			repository.save(new Jogador("Daniel", "daniel@email.com", Date.valueOf("2000-01-10")));

			// Busca todos os jogadores
			log.info("Jogadores encontrados com findAll():");
			log.info("-------------------------------");
			for (Jogador jogador : repository.findAll()) {
				log.info(jogador.toString());
			}
			log.info("");

			// Encontra um jogador pelo cod_jogador
			Jogador jogador = repository.findById(2L);
			log.info("jogador found with findById(2L):");
			log.info("--------------------------------");
			log.info(jogador.toString());
			log.info("");

			// Busca jogadores pelo nome
			log.info("Jogador encontrado por findByNomeContaining('Daniel'):");
			log.info("--------------------------------------------");
			repository.findByNomeContaining("Daniel").forEach(daniel -> {
				log.info(daniel.toString());
			});
			log.info("");
		};
	} */
}
