![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-Repository-black?style=for-the-badge&logo=github)
![Status](https://img.shields.io/badge/status-Completo-brightgreen?style=for-the-badge)
![Estrutura de Dados](https://img.shields.io/badge/Estrutura%20de%20Dados-Lista%20Sequencial-blue?style=for-the-badge)

# 🎵 ED — Gerenciador de Playlist em Java

Este projeto apresenta a implementação de uma **Playlist Musical** utilizando **Lista Sequencial (array)** em Java.

A estrutura foi desenvolvida manualmente, sem o uso de coleções prontas como `ArrayList`, com o objetivo de aplicar conceitos fundamentais de **Estrutura de Dados**.

---

# 🧠 Estrutura do Projeto

## 📌 Interface (TAD)
Arquivo: `PlayListMusicalTAD.java`

Define o contrato da estrutura:

- Inserção
- Remoção
- Busca
- Atualização
- Consulta
- Controle de capacidade

---

## ⚙️ Implementação
Arquivo: `PlayListMusical.java`

Responsável pela implementação da playlist.

### 🔹 Estrutura Interna:
- `int[] idsMusicas`
- `int quantidadeMusicas`

---

## 🖥️ Aplicação (Menu)
Arquivo: `main.java`

Permite interação via terminal e contém testes automáticos.

---

# 🚀 Funcionalidades

## ➕ Inserção
- `addFirst(int id)`
- `addLast(int id)`
- `insertAT(int pos, int id)`
- `addSorted(int id)`

## ➖ Remoção
- `removeFirst()`
- `removeLast()`
- `removeAt(int pos)`
- `remove(int id)`

## 🔍 Busca
- `find(int id)`
- `get(int pos)`
- `count()`

## 🔄 Atualização
- `set(int pos, int id)`

## 🧹 Controle
- `isEmpty()`
- `isFull()`
- `display()`

---

# 🧠 Conceitos Aplicados

- Lista Sequencial (array)
- Tipo Abstrato de Dados (TAD)
- Manipulação de índices
- Estruturas de dados básicas
- Encapsulamento
- Organização em camadas

---

# ⚙️ Tecnologias

- Java (JDK 17+)
- IntelliJ IDEA
- Git
- GitHub

---

# ▶️ Como Executar

1. Clonar o repositório:

git clone https://github.com/SEU-USUARIO/PlaylistJava.git

2. Entrar na pasta:

cd PlaylistJava

3. Compilar:

javac TAD/*.java

4. Executar:

java TAD.main

---

# 🎯 Objetivo

Projeto acadêmico com foco em:

- Lógica de programação
- Estruturas de dados
- Manipulação de arrays
- Organização de código

---

# 💡 Diferenciais

- Implementação manual (sem ArrayList)
- Uso de TAD
- Menu interativo
- Testes automáticos
- Tratamento de erros

---

# 👨‍💻 Autor

Carlos Sales
