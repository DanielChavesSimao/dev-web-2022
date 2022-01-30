# Trabalho SpingBoot DevWeb 2022
- Entrega: código fonte com descrição da API em repositório GitHub 
- Equipe: até 3 integrantes 
- Capa deve conter o nome dos integrantes 
- Somente um membro da equipe deve enviar a atividade no Classroom 
- Prazo máximo: 03/02/2022

# API
| Rota | GET | POST | PUT | DELETE |
| ----------- | ----------- | ----------- | ----------- | ----------- |
| `/jogador` | Busca todos os jogadores. | Cria um novo jogador. | Atualiza jogadores em massa. | Apaga todos os jogadores. |
| `/jogador/:cod_jogador` | Recupera os dados do jogador com id=`:cod_jogador`. | Erro. |  Atualiza o jogador escolhido. | Remove o jogador escolhido. |
| `/pagamento` | Busca todos os pagamentos. | Cria um novo pagamento. | Atualiza pagamentos em massa. | Apaga todos os pagamentos. |
| `/pagamento/:cod_jogador` | Recupera os pagamentos do jogador com id=`:cod_jogador`. | Erro. |  Atualiza os pagamentos do jogador escolhido. | Remove os pagamentos do jogador escolhido. |