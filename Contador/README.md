# 🔢 Contador de Parâmetros

Este projeto em Java solicita dois números inteiros como entrada e exibe uma contagem incremental a partir do primeiro número até a diferença entre os dois, validando antes da exibir a contagem se o segundo número é maior que o primeiro.

## 🛠 Tecnologias Utilizadas

- Java
- Scanner para entrada de dados
- Tratamento de exceções personalizado

## ⚙️ Funcionalidades

- Solicitação e validação de dois números inteiros
- Verificação se o segundo número é maior que o primeiro
- Impressão dos números no intervalo entre os dois valores fornecidos
- Tratamento de exceções personalizadas

## 🚀 Como Executar

1. Certifique-se de ter o Java instalado em sua máquina.
2. Compile os arquivos Java:
   ```sh
   javac Contador.java AppContador.java ParametrosInvalidosException.java
   ```
3. Execute o programa:
   ```sh
   java AppContador
   ```
4. Siga as instruções no terminal para inserir os números.

## 📜 Estrutura do Código

- `Contador`: Classe principal que gerencia a entrada de dados, validação e impressão da contagem.
- `AppContador`: Classe que inicializa o programa e instancia o contador.
- `ParametrosInvalidosException`: Exceção personalizada para validação dos parâmetros.

## 🔍 Tratamento de Erros

- Caso o usuário não digite um número válido, uma mensagem de erro será exibida e ele deverá tentar novamente.
- Se o segundo número informado for menor ou igual ao primeiro, a exceção `ParametrosInvalidosException` será lançada com uma mensagem informativa.

## 🖥️ Exemplo de Entrada e Saída

**Entrada:**
```
Digite o 1º parâmetro: 20
Digite o 2º parâmetro: 25
```

**Saída:**
```
Imprimindo o número 1
Imprimindo o número 2
Imprimindo o número 3
Imprimindo o número 4
Imprimindo o número 5
```

## 👨‍💻 Autor

Este projeto foi desenvolvido por Anderson Oliveira para fins de aprendizado em Java e boas práticas de programação.

