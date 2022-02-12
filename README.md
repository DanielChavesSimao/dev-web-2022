# Trabalho SpingBoot DevWeb 2022
- Entrega: código fonte com descrição da API em repositório GitHub 
- Equipe: até 3 integrantes 
- Capa deve conter o nome dos integrantes 
- Somente um membro da equipe deve enviar a atividade no Classroom 
- Prazo máximo: 10/02/2022

# API
| Rota | GET | POST | PUT | DELETE |
| ----------- | ----------- | ----------- | ----------- | ----------- |
| `/jogadores` | ✅Busca todos os jogadores, ou filtra por nome (`?nome=Nome`). | ✅Cria um novo jogador. | ❌ | ✅Apaga todos os jogadores. |
| `/jogadores/{cod_jogador}` | ✅Recupera os dados do jogador escolhido. | ❌ | ✅Atualiza o jogador escolhido. | ✅Remove o jogador escolhido. |
| `/jogadores/{cod_jogador}/pagamentos` | ✅Recupera os pagamentos do jogador escolhido. | ✅Cria um pagamento para o jogador escolhido. | ❌ | ✅Remove os pagamentos do jogador escolhido. |
| `/jogadores/{cod_jogador}/pagamentos/{cod_pagamento}` | ❌ | ❌ | ❌ | ❌ |
| `/pagamentos` | ✅Busca todos os pagamentos. | ❌ | ❌ | ✅Apaga todos os pagamentos. |
| `/pagamentos/{cod_pagamento}` | ❌ | ❌ | ✅Atualiza o pagamento. | ✅Deleta o pagamento. |