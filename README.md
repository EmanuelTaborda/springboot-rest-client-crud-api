# 👤 Client CRUD API — Spring Boot REST

Projeto desenvolvido em **Java com Spring Boot** com o objetivo de praticar a construção de uma **API RESTful**, organização em camadas, operações CRUD completas, tratamento de exceções e validações de dados.

A aplicação simula um cenário real de gerenciamento de clientes, permitindo operações básicas através de endpoints REST.

---

## 👨‍💻 Sobre o Projeto

A API permite gerenciar clientes contendo:

- Nome
- CPF
- Renda
- Data de nascimento
- Quantidade de filhos

Funcionalidades implementadas:

- Busca paginada de clientes
- Busca de cliente por ID
- Inserção de novo cliente
- Atualização de cliente existente
- Deleção de cliente

---

## 🧩 Modelo de Domínio

A entidade principal do sistema é:

### 📊 Client

![Diagrama Client](docs/Diagrama-client.png)

---

## 🏗️ Arquitetura

O projeto foi estruturado seguindo organização em camadas:

- **Controller**
    - Exposição dos endpoints REST
- **Service**
    - Regras de negócio e orquestração
- **Repository**
    - Acesso aos dados com Spring Data JPA
- **DTO**
    - Transferência de dados entre camadas
- **Exception Handling**
    - Tratamento global de erros

Essa separação permite baixo acoplamento e melhor organização do código.

---

## 🚀 Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web (REST API)
- Spring Data JPA
- Hibernate
- Bean Validation (Jakarta Validation)
- Banco H2 (ambiente de testes)
- Maven

---

## 🧠 Conceitos Praticados

- Desenvolvimento de API RESTful
- CRUD completo
- Paginação e ordenação
- DTO pattern
- Tratamento global de exceções
- Validações com annotations:
    - Nome não pode ser vazio
    - Data de nascimento não pode ser futura (@PastOrPresent)
- Status HTTP apropriados:
    - 200 OK
    - 404 Not Found
    - 422 Unprocessable Entity

---

## 🧪 Seeding de Dados

O projeto realiza carga inicial de dados com clientes fictícios para facilitar testes e validação da API.

---


