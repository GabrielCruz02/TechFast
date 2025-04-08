### 1. **Introdução**

### **Objetivo**

Este aplicativo tem como objetivo facilitar o gerenciamento de pedidos de peças dentro de uma assistência técnica. Ele
permitirá que os funcionários realizem solicitações de peças, enquanto os gerentes poderão visualizar, aprovar ou
rejeitar os pedidos. Além disso, o sistema acompanhará o status de cada solicitação, garantindo mais controle e
organização no fluxo de trabalho.

nome da aplicação: TechFast

### **Público-Alvo**

O sistema será utilizado por dois tipos de usuários:

- **Gerentes:** Responsáveis por aprovar ou rejeitar os pedidos, além de monitorar o estoque e as solicitações
  pendentes.
- **Funcionários:** Poderão registrar solicitações de peças e acompanhar o status de seus pedidos.

### **Tecnologias Utilizadas**

- **Java** – Linguagem principal para desenvolvimento da aplicação.
- **JavaFX** – Biblioteca para construção da interface gráfica.
- **SQLite** – Banco de dados leve e eficiente para armazenar os pedidos e usuários.
- **(Opcional) Hibernate ou JPA** – Para facilitar a comunicação entre a aplicação e o banco de dados.

### 2. **Requisitos**

### **Requisitos Funcionais**

O sistema deve permitir:

- Registro de funcionários com diferentes níveis de acesso (**Gerente** e **Funcionário**).
- Registro de pedidos de peças, incluindo:
    - Ordem de serviço associada.
    - Nome da peça solicitada.
    - Valor do reparo do equipamento que receberá a peça.
- Exibição de todos os pedidos em uma tabela, destacando:
    - Pedidos **aceitos**.
    - Pedidos **pendentes de visualização**.
- Abertura de um pedido para análise, onde ele poderá ser **aceito ou negado** (**ação permitida apenas para gerentes
  **).
- **Autenticação de usuários** (login com controle de acesso baseado no nível do usuário).

### **Requisitos Não Funcionais**

- A aplicação deve ser **leve** e ter **baixo consumo de recursos**.
- A interface deve ser **simples e intuitiva**, utilizando **poucos botões** para facilitar a usabilidade.
- A interface gráfica será desenvolvida com **JavaFX e estilizada com CSS** para melhor experiência visual.
- **Registro de logs** para capturar ações do sistema, como:
    - Criação de pedidos.
    - Aceitação/rejeição de pedidos.
    - Login de usuários.

### **Ambiente de Desenvolvimento**

- **IDE:** IntelliJ IDEA
- **Linguagem:** Java 24
- **Banco de dados:** SQLite (versão X, se aplicável)
- **Frameworks/Bibliotecas:**
    - **JavaFX** – Interface gráfica
    - **Scene Builder** – Construção de UI
    - **SLF4J + Logback** – Registro de logs
    - **Maven** – Gerenciamento de dependências
    - **Java JWT (ou outra solução de autenticação)** – Para controle de acesso

### 3. **Arquitetura do Sistema**

### **Modelo Arquitetural**

O sistema seguirá o padrão **MVC (Model-View-Controller)** para garantir organização, manutenibilidade e separação de
responsabilidades:

- **Model (Modelo):** Gerencia os dados e a lógica de negócios (ex.: classes para Pedido, Usuário, Banco de Dados).
- **View (Visão):** Responsável pela interface gráfica, utilizando JavaFX para exibição das telas.
- **Controller (Controlador):** Gerencia a comunicação entre Model e View, processando interações do usuário.

### **Diagrama de Arquitetura**

```
+------------------+      +------------------+      +------------------+
|     View        | <--> |    Controller    | <--> |     Model        |
| (Telas JavaFX)  |      | (Lógica de Fluxo)|      | (Banco de Dados) |
+------------------+      +------------------+      +------------------+
```

### **Componentes do Sistema**

1. **Model**
    - **Pedido.java** → Representa um pedido de peça.
    - **Usuario.java** → Representa um usuário (Gerente ou Funcionário).
    - **BancoDeDados.java** → Gerencia a conexão com o SQLite.
2. **View**
    - **LoginView.fxml** → Tela de login.
    - **PedidoView.fxml** → Tela de pedidos.
    - **DashboardView.fxml** → Tela principal.
3. **Controller**
    - **LoginController.java** → Gerencia autenticação.
    - **PedidoController.java** → Controla criação e exibição de pedidos.
    - **DashboardController.java** → Organiza a navegação do sistema.

### **Fluxo de Dados**

1. O usuário acessa a **View (tela JavaFX)** e interage com os botões.
2. A **Controller** recebe a ação, processa os dados e chama o **Model**.
3. O **Model** acessa o banco de dados (SQLite) para armazenar ou recuperar informações.
4. O resultado retorna para a **View**, que exibe as informações atualizadas ao usuário.

![arquitetura_sistema.png](attachment:2f5f380f-c8d0-4523-b676-beae08811e28:arquitetura_sistema.png)

### 4. **Interface do Usuário**

### **Estilo Visual**

A interface será projetada para ser **moderna, agradável e intuitiva**, utilizando um design **limpo e atualizado**. As
cores predominantes serão:

- **Branco**: Fundo principal para uma aparência clara e profissional.
- **Laranja**: Destaques, botões e elementos interativos para chamar a atenção.

### **Elementos de Design**

- Layout responsivo para diferentes resoluções de tela.
- Ícones minimalistas para facilitar a navegação.
- Botões arredondados para um visual mais moderno.
- Feedback visual em ações (ex.: botão mudar de cor ao passar o mouse).
- Fonte limpa e legível (ex.: **Roboto, Open Sans ou Inter**).

### **Telas Principais**

1. **Tela de Login**
    - Campos para usuário e senha.
    - Botão de login destacado em **laranja**.
2. **Tela de Dashboard**
    - Exibição dos pedidos pendentes e aprovados.
    - Filtros para busca rápida.
    - Botões de ação para gerenciar pedidos.
3. **Tela de Cadastro de Pedidos**
    - Campos para inserir ordem de serviço, nome da peça e valor do reparo.
    - Botão de envio destacado em **laranja**.
4. **Tela de Gerenciamento de Usuários (Apenas para Gerentes)**
    - Cadastro e edição de funcionários.
    - Controle de permissões.

### **Tecnologias para UI**

- **JavaFX** com FXML para estruturar as telas.
- **CSS para estilização** (definição de cores, fontes e espaçamentos).
- **Scene Builder** para facilitar o desenvolvimento do layout.

### 5. **Plano de Implementação**

### **Etapas de Desenvolvimento**

1. **Fase de Preparação e Planejamento**
    - **Tarefa 1**: Definir a estrutura inicial do projeto no IntelliJ IDEA.
    - **Tarefa 2**: Criar o banco de dados SQLite e definir a estrutura das tabelas.
    - **Tarefa 3**: Configurar o repositório de código (se necessário, como GitHub ou GitLab).
2. **Desenvolvimento da Interface de Usuário**
    - **Tarefa 1**: Criar as telas principais: Login, Dashboard, Registro de Pedidos, e Gerenciamento de Usuários.
    - **Tarefa 2**: Aplicar o estilo visual (cores branco e laranja).
    - **Tarefa 3**: Testar usabilidade e responsividade das telas.
3. **Desenvolvimento da Lógica de Negócios**
    - **Tarefa 1**: Implementar o gerenciamento de usuários (login, níveis de acesso).
    - **Tarefa 2**: Implementar o sistema de pedidos (registro, visualização, aprovação/rejeição).
    - **Tarefa 3**: Implementar o registro de logs (ações do sistema, mudanças no status de pedidos, etc.).
4. **Integração e Testes**
    - **Tarefa 1**: Integrar as funcionalidades de UI com a lógica de negócios.
    - **Tarefa 2**: Testar o fluxo do sistema (login, gerenciamento de pedidos, etc.).
    - **Tarefa 3**: Realizar testes de usabilidade com usuários reais (se possível).
5. **Documentação e Preparação para Deploy**
    - **Tarefa 1**: Documentar as funcionalidades do sistema.
    - **Tarefa 2**: Preparar o código e banco de dados para deployment.
    - **Tarefa 3**: Testar em diferentes ambientes (sistemas operacionais, etc.).

### **Cronograma de Desenvolvimento**

| **Fase**                        | **Duração Estimada** | **Data de Início** | **Data de Término** |
|---------------------------------|----------------------|--------------------|---------------------|
| Planejamento e Estruturação     | 1 semana             | 01/04/2025         | 07/04/2025          |
| Desenvolvimento da UI           | 2 semanas            | 08/04/2025         | 21/04/2025          |
| Lógica de Negócios e Integração | 3 semanas            | 22/04/2025         | 12/05/2025          |
| Testes e Ajustes                | 2 semanas            | 13/05/2025         | 26/05/2025          |
| Documentação e Deploy           | 1 semana             | 27/05/2025         | 02/06/2025          |

### 6. **Gestão de Projetos**

### **Estrutura de Equipe**

Como o desenvolvimento será realizado individualmente, serei responsável por todas as fases do projeto, incluindo o
desenvolvimento, testes e acompanhamento do progresso.

### **Metodologia de Desenvolvimento**

A metodologia de gestão adotada será **Kanban**, focada em gerenciar as tarefas de forma visual e eficiente. O Kanban
ajudará a organizar o fluxo de trabalho, dividindo as tarefas em colunas como:

- **Backlog**: Tarefas que ainda precisam ser feitas.
- **Em Andamento**: Tarefas que estão sendo desenvolvidas no momento.
- **Concluído**: Tarefas que já foram finalizadas.

### **Ferramentas de Gestão**

- **Notion**: Usado para gestão de tarefas, controle de progresso e organização de anotações do projeto. O Notion será
  configurado com um quadro Kanban para gerenciar as tarefas de forma simples e clara.
- **GitHub**: Controle de versão do código-fonte, onde os commits serão realizados regularmente para manter o progresso
  do código documentado.

### **Monitoramento de Progresso**

O progresso será acompanhado através das seguintes práticas:

- **Revisão Semanal**: A cada semana, revisar as tarefas concluídas e ajustar as prioridades de acordo com o andamento
  do projeto.
- **Kanban no Notion**: O quadro de tarefas será atualizado continuamente, permitindo uma visão clara das atividades
  pendentes, em andamento e finalizadas.

### **Gestão de Riscos**

Identificação e mitigação de riscos durante o projeto:

- **Risco 1**: Atrasos no desenvolvimento devido à sobrecarga de tarefas.
    - **Mitigação**: Dividir o projeto em pequenas tarefas e prazos curtos para facilitar o acompanhamento.
- **Risco 2**: Problemas técnicos inesperados no processo de integração ou na base de dados.
    - **Mitigação**: Testar e validar cada parte do sistema à medida que for sendo desenvolvida.
- **Risco 3**: Falta de motivação ou perda de foco durante o processo.
    - **Mitigação**: Estabelecer metas claras e realizar revisões semanais para avaliar o progresso.

### **Entrega e Acompanhamento Pós-Lançamento**

Após a entrega do sistema, Gabriel realizará um acompanhamento contínuo durante **1 mês** para monitorar o desempenho e
coletar feedback. Durante este período, o foco será corrigir possíveis falhas e planejar melhorias.

### 7. **Testes**

### **Objetivo dos Testes**

O objetivo principal dos testes é garantir que o sistema funcione corretamente, sem erros, e que a experiência do
usuário seja satisfatória. Também é importante verificar se a lógica de negócios está bem implementada e se a interação
com o banco de dados está ocorrendo conforme esperado.

### **Tipos de Testes**

1. **Testes Unitários**
    - **Objetivo**: Testar individualmente as funções e métodos do sistema para garantir que cada parte do código
      execute corretamente.
    - **Ferramenta**: JUnit (para Java).
    - **Cobertura**: Testar funcionalidades críticas como cadastro de pedidos, login de usuários e manipulação de dados
      no banco de dados SQLite.
2. **Testes de Integração**
    - **Objetivo**: Verificar se as diferentes partes do sistema (interface, banco de dados e lógica de negócios)
      funcionam corretamente quando integradas.
    - **Exemplo**: Testar se a inserção de pedidos na interface está sendo corretamente armazenada no banco de dados e
      se a consulta de pedidos exibe as informações corretamente.
3. **Testes Funcionais**
    - **Objetivo**: Validar se o sistema atende aos requisitos funcionais descritos, como registro de usuários, criação
      de pedidos e aprovação de pedidos pelos gerentes.
    - **Ferramenta**: Manual, ou ferramentas de automação de testes como Selenium (se for necessário realizar testes em
      uma interface mais complexa).
    - **Cobertura**: Testar os fluxos principais da aplicação, como login, criação de pedidos, e aprovação de pedidos
      por gerentes.
4. **Testes de Usabilidade**
    - **Objetivo**: Verificar se a interface do usuário é intuitiva e agradável, com o objetivo de proporcionar uma boa
      experiência ao usuário.
    - **Método**: Testes manuais com feedback de usuários reais ou simulação de uso.
    - **Cobertura**: Testar o fluxo de navegação entre telas, clareza nos botões e elementos da interface, e tempo de
      resposta das ações.
5. **Testes de Performance**
    - **Objetivo**: Verificar se o sistema funciona de maneira eficiente, mesmo quando há maior carga de dados ou
      simultaneidade de usuários.
    - **Ferramenta**: JMeter ou ferramentas de monitoramento de performance.
    - **Cobertura**: Testar o desempenho de consultas ao banco de dados, tempo de resposta do sistema e carregamento das
      telas.

### **Plano de Testes**

1. **Fase Inicial**:
    - Realizar testes unitários e de integração à medida que o código for sendo desenvolvido, para garantir que cada
      parte do sistema esteja funcionando corretamente.
2. **Fase de Validação**:
    - Realizar testes funcionais para validar se os requisitos do sistema estão sendo atendidos e se o sistema como um
      todo está funcionando corretamente.
3. **Fase de Usabilidade**:
    - Realizar testes de usabilidade com a interface final, realizando ajustes conforme necessário para garantir uma boa
      experiência ao usuário.
4. **Fase Final**:
    - Realizar testes de performance para garantir que o sistema seja eficiente e estável antes do lançamento final.

### **Gerenciamento de Testes**

Durante o desenvolvimento, todos os testes realizados serão registrados e documentados no Notion, permitindo o
acompanhamento de quais testes foram feitos, quais estão pendentes e os resultados dos testes realizados.

-------------------------------------------------------------------------------------------------------------------------

### **Banco de dados**

📌 **Estrutura da Tabela `funcionario`**:

```sql
CREATE TABLE funcionario (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome VARCHAR(20) NOT NULL,
    cargo VARCHAR(20) CHECK (cargo IN ('Funcionário', 'Gerente')) NOT NULL,
    usuario VARCHAR(50) UNIQUE NOT NULL,
    senha VARCHAR(50) NOT NULL
);
```

- “id” chave primaria, tipo inteiro, autoincremetavel.
- “nome” nome do funcionario.
- “cargo”  armazenado como um **ENUM** para evitar valores inconsistentes.
- “usuario” utilizado para login.
- “senha” guardar hashes de senhas.

📌  **Estrutura da Tabela `pedidos:`**

```sql
CREATE TABLE pedidos (
id INTEGER PRIMARY KEY AUTO_INCREMENT,
ordem_servico TEXT UNIQUE NOT NULL,
nome_peca TEXT NOT NULL,
valor_reparo REAL NOT NULL,
status VARCHAR(20) CHECK(status IN ('Pendente', 'Aprovado', 'Negado')) DEFAULT 'Pendente',
data_criacao TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
funcionario_id INTEGER NOT NULL,
FOREIGN KEY (funcionario_id) REFERENCES funcionario(id)
);
```

- “id” chave primaria, tipo inteiro, autoincremetavel.
- “ordem_servico” identificador unico.
- “nome_peca” nome da peca solicitada no pedido.
- “valor_reparo” valor do reparo completo do equipamento que receberá a peça.
- “status” Status do pedido armazenado como um **ENUM** para evitar valores inconsistentes.
- campo de **data de criação** para registrar quando o pedido foi feito.
- ”funcionario_id “ Relaciono o pedido ao funcionário que o criou atraves da chave estrangeira “funcionario_id” que fara referencia ao “funcionario_id” chave primaria da tabela funcionario.

📌 **Estrutura da Tabela `log`**:

```sql
CREATE TABLE log_atividades (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    funcionario_id INTEGER NOT NULL,
    acao VARCHAR(50) NOT NULL,
    data TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (funcionario_id) REFERENCES funcionario(id)
);
```

**Uso:** Pode armazenar ações como `"Pedido #123 aprovado por Gerente João"`.






### **Acompanhamento de Erros e Correções**

Caso algum erro seja identificado durante os testes, ele será registrado como uma tarefa no quadro Kanban do Notion, com
uma descrição do erro e prioridade para correção.
