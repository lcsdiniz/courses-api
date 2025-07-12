# Courses API
[![Author](https://img.shields.io/badge/author-lcsdiniz-6DB33F)](https://www.linkedin.com/in/lcsdiniz/)
[![Languages](https://img.shields.io/github/languages/count/lcsdiniz/courses-api?color=6DB33F)](#)
[![Stars](https://img.shields.io/github/stars/lcsdiniz/courses-api?color=6DB33F)](#)

---

## ℹ️ Sobre

Este projeto é uma API REST desenvolvida com Spring Boot para gerenciamento de cursos e suas aulas.
Permite operações completas de CRUD em cursos, com uma modelagem simples e clara.

Os cursos são classificados por categorias, utilizando enums para garantir integridade e padronização dos dados.
Além disso, o projeto adota o uso de DTOs (Data Transfer Objects) para desacoplar as entidades internas da aplicação dos dados expostos nas requisições e respostas da API, promovendo uma arquitetura mais limpa e segura.

---

## 🛠 Tecnologias

- Java 22  
- Spring Boot  
- Spring Data JPA  
- PostgreSQL  
- Docker & Docker Compose  

---

## 🚀 Como rodar

### Pré-requisitos

- Docker e Docker Compose instalados  
- Java 22 (se for rodar local sem Docker)

### Passos

```bash
# Clone o repositório
git clone https://github.com/lcsdiniz/courses-api.git

# Entre na pasta do projeto
cd courses-api

# Crie um arquivo .env baseado no .env.example e preencha-o com as variáveis necessárias

# Suba o banco e a aplicação com Docker Compose
docker-compose up --build
