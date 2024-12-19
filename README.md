# API de Clientes

Esta é uma aplicação simples para gerenciamento de clientes, utilizando Spring Boot com JPA, Flyway para migração de banco de dados e testes unitários com Spring Boot Test.

## Estrutura do Projeto

- **Model**: Entidade `Cliente`
- **Repository**: Interface de acesso ao banco de dados utilizando JPA
- **Service**: Camada de serviço com a lógica de negócio
- **Controller**: Controladores REST para expor os endpoints
- **Flyway Migration**: Script para criação da tabela `cliente`
- **Testes Unitários**: Testes básicos para a camada de serviço

## Requisitos

- Java 11 ou superior
- MySQL (ou outro banco de dados relacional)
- Flyway para migrações de banco de dados
- Spring Boot para o backend

## Configuração do Banco de Dados

Adicione a configuração do banco de dados no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/meubanco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha

spring.jpa.hibernate.ddl-auto=validate
spring.flyway.enabled=true
spring.flyway.baseline-on-migrate=true
