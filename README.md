# CRUD-Alunos
Este é um projeto simples em Java que simula o cadastro e a exibição de informações de alunos utilizando conceitos de **Programação Orientada a Objetos (POO)**.

## 📌 Funcionalidades

- Criação de objetos da classe `Aluno`
- Armazenamento dos dados: nome, idade, curso e CPF
- Validação de idade (entre 5 e 19 anos)
- Exibição total ou parcial dos dados de cada aluno
- Menu interativo com entrada do usuário via terminal

## 💻 Tecnologias utilizadas

- Java SE (Java Standard Edition)
- Scanner (`java.util.Scanner`) para entrada de dados via console

## 📁 Estrutura do Projeto
├── Aluno.java // Classe que representa um aluno

└── teste.java // Classe principal com o método main

### 📄 Aluno.java

Contém os atributos privados e os métodos públicos para configurar (`set`) e exibir os dados de cada aluno.

**Atributos:**
- `String Cadastropssoafisica` → CPF
- `String Nome`
- `int Idade`
- `String Curso`

**Métodos principais:**
- `SetCpf(String cpf)`
- `SetNome(String nome)`
- `SetIdade(int idade)` *(com validação)*
- `SetCurso(String curso)`
- `exibirDados()` → exibe todos os dados do aluno
- Métodos individuais: `exibirNome()`, `exibirIdade()`, `exibirCurso()`, `exibirCPF()`

### 📄 teste.java

Classe com o método `main`, responsável por:

1. Criar dois objetos `Aluno`
2. Preencher seus dados
3. Ler entrada do usuário para escolher qual aluno consultar
4. Exibir os dados conforme a opção escolhida

## ✅ Como Executar

1. Compile os arquivos Java:
javac Aluno.java teste.java
2. Execute os arquivos Java:
java teste
3. Siga as instruções no terminal:
Digite o número do aluno
Escolha o que deseja exibir

Desenvolvido por Gustavo Henrique Estudante de Engenharia.
