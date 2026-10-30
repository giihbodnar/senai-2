[Português](README.md) | [English](README.en.md)

# Teste automatizado GameMania — SENAI

Exercício de automação de interface com **Java**, **Selenium WebDriver**, **JUnit 4** e **Maven**, relacionado ao projeto GameMania.

## O que o teste faz

O arquivo `src/test/java/TesteGameMania.java` contém um teste que:
1. Inicializa o Google Chrome pelo ChromeDriver.
2. Abre `https://ellievi.github.io/GameMania/#computadores`.
3. Clica no elemento com ID `computadores`.
4. Clica no elemento com ID `nxt-btn`.

## Tecnologias

- Java
- Selenium WebDriver 3.141.59
- JUnit 4.12
- Maven
- ChromeDriver

## Estrutura

```text
pom.xml
src/test/java/TesteGameMania.java
```

## Como executar

Instale Java, Maven, Google Chrome e uma versão compatível do ChromeDriver. No código original, o caminho do ChromeDriver está configurado diretamente para um computador Windows antigo, em `System.setProperty("webdriver.chrome.driver", ...)`. É necessário adaptar esse caminho ao ambiente atual antes de executar `mvn test`.

**Importante:** o teste não foi executado durante esta organização. Seu funcionamento depende também da disponibilidade da página e dos IDs dos elementos.

## Preservação

O arquivo Java e o `pom.xml` foram mantidos sem alterações. Apenas arquivos compilados e configurações locais do Eclipse foram retirados da versão atual, e foram adicionados documentação e `.gitignore`.
