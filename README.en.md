[Português](README.md) | [English](README.en.md)

# GameMania Automated Test — SENAI

A browser UI automation exercise using **Java**, **Selenium WebDriver**, **JUnit 4**, and **Maven**, associated with the GameMania project.

## What the test does

The `src/test/java/TesteGameMania.java` file contains a test that:
1. Launches Google Chrome through ChromeDriver.
2. Opens `https://ellievi.github.io/GameMania/#computadores`.
3. Clicks the element with ID `computadores`.
4. Clicks the element with ID `nxt-btn`.

## Technologies

- Java
- Selenium WebDriver 3.141.59
- JUnit 4.12
- Maven
- ChromeDriver

## Project structure

```text
pom.xml
src/test/java/TesteGameMania.java
```

## Running the test

Install Java, Maven, Google Chrome, and a compatible ChromeDriver. The original Java code hardcodes a ChromeDriver path from an older Windows computer in `System.setProperty("webdriver.chrome.driver", ...)`. Update that path for your current environment before running `mvn test`.

**Note:** the test was not executed during this cleanup. Its behavior also depends on the external page remaining available and its element IDs remaining unchanged.

## Preservation

The Java source file and `pom.xml` were kept unchanged. Only compiled artifacts and local Eclipse configuration were removed from the current repository tree, and documentation plus a `.gitignore` were added.
