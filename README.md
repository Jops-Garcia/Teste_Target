# Desafio de Programação

Este repositório contém a solução de um conjunto de atividades de programação usando **Java** e gerenciadas pelo **Maven**.

## 📋 Descrição das Atividades

### 1. Soma Sequencial
Implementei um programa que calcula a soma dos números de 1 a 13 utilizando uma estrutura de repetição.

### 2. Sequência de Fibonacci
O programa verifica se um número informado pertence à sequência de Fibonacci.

### 3. Análise de Faturamento
A aplicação realiza a análise de um arquivo JSON contendo o faturamento diário:
- Calcula o menor e maior valor de faturamento diário.
- Determina o número de dias em que o faturamento foi superior à média mensal.

### 4. Percentual de Faturamento por Estado
Dado o faturamento mensal de uma distribuidora por estado, o programa calcula o percentual de representação de cada estado.

### 5. Inversão de String
Um programa que inverte os caracteres de uma string sem usar funções prontas.

---

## 🚀 Como Executar

### Pré-requisitos:
- **Java 8+**
- **Maven** instalado no sistema
- Editor de código ou terminal para rodar os comandos

### Passos para Configuração:

1. Clone o repositório

2. Compile o projeto:
   ```bash
   mvn clean compile
   ```

3. Para executar a aplicação principal:
   ```bash
   mvn exec:java
   ```

4. Para criar um JAR executável:
   ```bash
   mvn clean package
   java -jar target/desafio-1.0-SNAPSHOT.jar
   ```

5. Para executar os testes:
   ```bash
   mvn test
   ```

---

## 📂 Estrutura do Projeto

```plaintext
.
├── src
│   ├── main
│   │   ├── java
│   │   │   ├── com
│   │   │   │   ├── example
│   │   │   │   │   ├── Main.java                        # Classe principal
│   │   │   │   │   ├── ChecarFibonacci.java             # Verifica números de Fibonacci
│   │   │   │   │   ├── FaturamentoDistribuidora.java    # Analisa o faturamento diário
│   │   │   │   │   ├── PercentualFaturamento.java       # Calcula percentuais por estado
│   │   │   │   │   ├── InverterString.java              # Inversão de strings
│   └── test                                            
│       └── java
│           ├── com
│           │   ├── example
│           │   │   ├── Tests.java                 # Testes
├── pom.xml                                        # Configuração Maven
```

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Maven** como gerenciador de dependências e build
- **JUnit 5** para testes unitários
---
