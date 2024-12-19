# API de Clientes

## Descrição
Este projeto implementa uma API RESTful para gerenciar dados de clientes. A API permite criar, atualizar, listar e excluir clientes. Este exemplo utiliza o Spring Boot, JPA (Hibernate), Flyway para migração de banco de dados e cURL para testar os endpoints.

## Estrutura do Projeto
- **src/main**: Contém a lógica de negócios, incluindo os controladores, serviços e repositórios.
- **src/test**: Contém o teste.
- **V1__criar_tabela_cliente.sql**: Script Flyway para criar a tabela `cliente` no banco de dados.
  
## Tecnologias Usadas
- Spring Boot
- Spring Data JPA
- Flyway
- H2 (Banco de dados em memória para desenvolvimento)
- JUnit (Para testes unitários)

## Como Rodar o Projeto Localmente
1. **Clone o repositório:**
   Utilize o comando abaixo para clonar o repositório para sua máquina local:

   git clone https://github.com/SEU_USUARIO/Springbot.git

   Ou via SSH:

   git clone git@github.com:SEU_USUARIO/Springbot.git

2. **Abra o projeto em sua IDE preferida.** Você pode usar o IntelliJ IDEA, Eclipse, ou qualquer IDE que suporte Spring Boot.

3. **Configuração do Banco de Dados:** No arquivo `src/main/resources/application.properties`, configure o banco de dados de sua escolha. Por exemplo, se você estiver usando MySQL:

   spring.datasource.url=jdbc:mysql://localhost:3306/meubanco
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.jpa.hibernate.ddl-auto=validate
   spring.flyway.enabled=true

4. **Rodando a aplicação:** Após configurar, basta rodar a aplicação com o comando:

   mvn spring-boot:run

## Testando a API com cURL
Aqui estão alguns exemplos de como testar os endpoints da API utilizando cURL:

1. **Listar todos os clientes**

   curl -X GET http://localhost:8080/clientes

2. **Buscar cliente por ID**  
   Substitua `{id}` pelo ID do cliente que deseja buscar.

   curl -X GET http://localhost:8080/clientes/{id}

3. **Criar um novo cliente**

   curl -X POST http://localhost:8080/clientes -H "Content-Type: application/json" -d '{"nome":"Cliente","email":"cliente@exemplo.com","telefone":"999999999"}'

4. **Atualizar cliente**  
   Substitua `{id}` pelo ID do cliente que deseja atualizar.

   curl -X PUT http://localhost:8080/clientes/{id} -H "Content-Type: application/json" -d '{"nome":"Cliente Atualizado","email":"cliente@exemplo.com","telefone":"888888888"}'

5. **Deletar cliente**  
   Substitua `{id}` pelo ID do cliente que deseja excluir.

   curl -X DELETE http://localhost:8080/clientes/{id}

## Estrutura de Arquivos

Springbot/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/
│   │   │   │   ├── seu_usuario/
│   │   │   │   │   ├── Cliente.java
│   │   │   │   │   ├── ClienteController.java
│   │   │   │   │   ├── ClienteService.java
│   │   │   │   │   ├── ClienteRepository.java
│   │   │   │   │   └── V1__criar_tabela_cliente.sql
│   ├── test/
│   │   └── ClienteServiceTests.java
└── README.md

## API Endpoints
1. **Listar todos os clientes**  
   `GET /clientes`  
   Retorna uma lista de todos os clientes.

2. **Buscar cliente por ID**  
   `GET /clientes/{id}`  
   Retorna os detalhes do cliente com o ID fornecido.

3. **Criar um novo cliente**  
   `POST /clientes`  
   Cria um novo cliente com os dados fornecidos.

4. **Atualizar cliente**  
   `PUT /clientes/{id}`  
   Atualiza os dados de um cliente existente com o ID fornecido.

5. **Deletar cliente**  
   `DELETE /clientes/{id}`  
   Deleta um cliente com o ID fornecido.
