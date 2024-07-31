## Perguntas e Respostas

*1. O cliente adquiriu um novo modelo de máquina de cartão de crédito e ela aceita as bandeiras Visa, Master, Elo, Amex e Hiper e executa duas operações para cada bandeira: débito e crédito. Quantos testes serão necessários para validação dessa máquina e qual técnica a ser utilizada?*

Para validar a nova máquina de cartão de crédito, considerando que ela suporta 5 bandeiras (Visa, Master, Elo, Amex e Hiper) e realiza 2 operações para cada bandeira (débito e crédito), serão necessários um total de 10 testes (5 bandeiras x 2 operações). A técnica recomendada para isso é a técnica de Partição de Equivalência e Teste de Limite. A partição de equivalência ajuda a reduzir o número de testes, garantindo que cada grupo de entradas válidas e inválidas seja testado pelo menos uma vez. O teste de limites verifica se o sistema lida corretamente com valores nas bordas das condições de entrada.

*2. A bandeira Visa disponibilizou um novo range de BINS no mercado que possui seis dígitos 232425 a 232460. Quais os testes deverão ser feitos desse range de BINS para confirmar que está funcionando?*

Para testar o range de BINS 232425 a 232460, é importante validar tanto o início quanto o final do range, além de alguns valores intermediários e limites próximos. A resposta correta seria:

d) 232424, 232425, 232459, 232460, 232461

Isso inclui testes para valores antes do range (232424), dentro do range (232425, 232459, 232460) e após o range (232461) para garantir que o sistema reconheça corretamente os valores válidos e inválidos.

*3. Cite uma abordagem de desenvolvimento ágil e explique-a, responda em suas palavras.*

Uma abordagem ágil é o Scrum. O Scrum é um framework que organiza o trabalho em ciclos curtos chamados de "sprints", geralmente com duração de 2 a 4 semanas. Em cada sprint, uma equipe multidisciplinar trabalha para entregar um incremento de produto funcional. O Scrum envolve reuniões diárias para revisar o progresso, reuniões de planejamento para definir o que será feito e reuniões de revisão para demonstrar o trabalho concluído. É uma abordagem colaborativa que promove flexibilidade e adaptação contínua às mudanças nos requisitos.

*4. O que é CI/CD?*

CI/CD é um conjunto de práticas de desenvolvimento de software que visa melhorar a qualidade e a velocidade do desenvolvimento. CI significa Integração Contínua, que se refere ao processo de integrar e testar o código continuamente durante o desenvolvimento para detectar problemas rapidamente. CD significa Entrega Contínua ou Deploy Contínuo, que automatiza a entrega e o deployment do código para ambientes de produção ou de teste, garantindo que o software esteja sempre em um estado de pronto para produção.

*5. O que é TDD, BDD e ATDD e quando são aplicadas?*

- TDD (Test-Driven Development) é uma prática onde os testes são escritos antes do código funcional. O ciclo é: escrever um teste que falha, escrever o código para passar o teste, e depois refatorar. É aplicável para garantir que o código atenda aos requisitos especificados e para promover um design mais limpo e menos acoplado.

- BDD (Behavior-Driven Development) é uma abordagem que incentiva a colaboração entre desenvolvedores, QA e partes interessadas para definir o comportamento do software através de exemplos concretos. Utiliza uma linguagem comum (como Gherkin) para descrever os comportamentos esperados. É aplicável para alinhar o entendimento do sistema entre todos os membros da equipe.

- ATDD (Acceptance Test-Driven Development) é uma prática onde os testes de aceitação são definidos antes do desenvolvimento. Envolve criar testes de aceitação que definem os critérios de sucesso e garantir que o código desenvolvido atenda a esses critérios. É aplicável para validar que o sistema atende aos requisitos do cliente.

*6. Cite uma heurística de testes utilizada para testes de front e de back e explique-as.*

- Front-End: A heurística "Testar Usabilidade" envolve avaliar a interface do usuário para garantir que ela seja intuitiva e fácil de usar. Isso inclui verificar se os elementos da interface estão visíveis, se os textos são legíveis e se a navegação é clara.

- Back-End: A heurística "Testar Funcionalidade" envolve verificar se o sistema realiza as operações e cálculos corretamente. Isso pode incluir testar a lógica de negócios, validação de dados e interação com o banco de dados.

*7. Cite ferramentas de testes automatizados para Desktop, Web, APIs e Mobile.*

- Desktop: sikuli 
- Web: Selenium WebDriver, Cypress, capybara , robotFramework.
- APIs: Rest-Assured, httparty ,restsharp, cypress.
- Mobile: Appium
