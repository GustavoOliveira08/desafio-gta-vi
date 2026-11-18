# 🎮 GTA VI API - Gerenciamento de Recursos

Uma API RESTful desenvolvida em **Java** com **Spring Boot** para o gerenciamento completo (CRUD) de elementos do universo de **Grand Theft Auto VI**, incluindo **Armas**, **Missões**, **Personagens** e **Veículos**.

---

## 🎯 Objetivo do Desafio

O objetivo principal deste projeto foi construir uma API funcional aplicando os principais verbos HTTP para manipulação de dados em um banco de dados relacional:
- **Buscar** registros cadastrados (`GET`)
- **Adicionar** novos registros (`POST`)
- **Editar** registros existentes (`PUT`)
- **Deletar** registros (`DELETE`)

---

## 🚀 Tecnologias Utilizadas

* **Java** (Linguagem principal)
* **Spring Boot** (Framework para criação da API REST)
* **Spring Web** (Mapeamento de rotas e requisições HTTP)
* **Spring Data JPA** (Persistência de dados e abstração de repositórios)
* **Hibernate** (ORM - Mapeamento Objeto-Relacional)

---

## 🏗️ Arquitetura do Projeto

O projeto segue o padrão de camadas do Spring Boot, dividido em:
* **`entities`**: Classes modelo mapeadas como tabelas no banco de dados (`Armas`, `Missao`, `Personagem`, `Veiculos`).
* **`repository`**: Interfaces que estendem `JpaRepository`, fornecendo métodos prontos de acesso ao banco.
* **`controller`**: Controladores REST responsáveis por expor os endpoints e gerenciar as requisições HTTP.

---

## 📌 Endpoints da API

Abaixo estão documentadas todas as rotas disponíveis na aplicação:

### 🔫 1. Armas (`/api/armas`)
Gerencia o arsenal disponível no jogo.

| Método | Endpoint | Descrição | Corpo da Requisição (JSON) |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/armas` | Lista todas as armas cadastradas | *Não requer* |
| `POST` | `/api/armas` | Cadastra uma nova arma | `{"nome": "...", "categoria": "...", "fabricante": "...", "imagem": "...", "descricao": "..."}` |
| `PUT` | `/api/armas/{id}` | Atualiza os dados de uma arma pelo ID | `{"nome": "...", "categoria": "...", "fabricante": "...", "imagem": "...", "descricao": "..."}` |
| `DELETE` | `/api/armas/{id}` | Remove uma arma pelo ID | *Não requer* |

---

### 🎯 2. Missões (`/api/missoes`)
Gerencia as missões, locais e níveis de dificuldade.

| Método | Endpoint | Descrição | Corpo da Requisição (JSON) |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/missoes` | Lista todas as missões cadastradas | *Não requer* |
| `POST` | `/api/missoes` | Cria uma nova missão | `{"nome": "...", "local": "...", "dificuldade": "...", "imagem": "...", "descricao": "..."}` |
| `PUT` | `/api/missoes/{id}` | Atualiza uma missão existente pelo ID | `{"nome": "...", "local": "...", "dificuldade": "...", "imagem": "...", "descricao": "..."}` |
| `DELETE` | `/api/missoes/{id}` | Deleta uma missão pelo ID | *Não requer* |

---

### 🧑 3. Personagens (`/api/personagens`)
Gerencia os protagonistas, NPCs e demais personagens.

| Método | Endpoint | Descrição | Corpo da Requisição (JSON) |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/personagens` | Lista todos os personagens cadastrados | *Não requer* |
| `POST` | `/api/personagens` | Adiciona um novo personagem | `{"nome": "...", "apelido": "...", "categoria": "...", "imagem": "...", "descricao": "..."}` |
| `PUT` | `/api/personagens/{id}` | Atualiza os dados de um personagem pelo ID | `{"nome": "...", "apelido": "...", "categoria": "...", "imagem": "...", "descricao": "..."}` |
| `DELETE` | `/api/personagens/{id}` | Remove um personagem pelo ID | *Não requer* |

---

### 🚗 4. Veículos (`/api/veiculos`)
Gerencia os carros, motos e demais veículos do jogo.

| Método | Endpoint | Descrição | Corpo da Requisição (JSON) |
| :--- | :--- | :--- | :--- |
| `GET` | `/api/veiculos` | Lista todos os veículos cadastrados | *Não requer* |
| `POST` | `/api/veiculos` | Cadastra um novo veículo | `{"nome": "...", "marca": "...", "tipo": "...", "imagem": "...", "descricao": "..."}` |
| `PUT` | `/api/veiculos/{id}` | Atualiza os dados de um veículo pelo ID | `{"nome": "...", "marca": "...", "tipo": "...", "imagem": "...", "descricao": "..."}` |
| `DELETE` | `/api/veiculos/{id}` | Remove um veículo pelo ID | *Não requer* |

---

## 🧪 Exemplo de Uso (JSON)

Exemplo de payload para realizar um **POST** ou **PUT** na rota `/api/personagens`:

```json
{
  "nome": "Lucia",
  "apelido": "Protagonista",
  "categoria": "Principal",
  "imagem": "https://exemplo.com/imagem-lucia.jpg",
  "descricao": "Uma das protagonistas centrais da história em Vice City."
}
```

---

## ✅ Evidências de Funcionamento

Todas as operações (`GET`, `POST`, `PUT` e `DELETE`) foram testadas e validadas, garantindo a persistência e atualização correta dos dados no banco.

*(Espaço reservado para adicionar os prints dos testes no Postman/Insomnia ou do Front-end)*