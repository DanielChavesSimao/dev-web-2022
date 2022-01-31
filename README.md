# Trabalho SpingBoot DevWeb 2022
- Entrega: código fonte com descrição da API em repositório GitHub 
- Equipe: até 3 integrantes 
- Capa deve conter o nome dos integrantes 
- Somente um membro da equipe deve enviar a atividade no Classroom 
- Prazo máximo: 03/02/2022

# API
| Rota | GET | POST | PUT | DELETE |
| ----------- | ----------- | ----------- | ----------- | ----------- |
| `/jogadores` | Busca todos os jogadores. | Cria um novo jogador. | Atualiza jogadores em massa. | Apaga todos os jogadores. |
| `/jogadores/{cod_jogador}` | Recupera os dados do jogador escolhido. | Erro. |  Atualiza o jogador escolhido. | Remove o jogador escolhido. |
| `/jogadores/{cod_jogador}/pagamentos` | Recupera os pagamentos do jogador escolhido. | Cria um pagamento para o jogador escolhido. |  Atualiza em massa os pagamentos do jogador escolhido. | Remove os pagamentos jogador escolhido. |
| `/pagamentos` | Busca todos os pagamentos. | Cria um novo pagamento. | Atualiza pagamentos em massa. | Apaga todos os pagamentos. |