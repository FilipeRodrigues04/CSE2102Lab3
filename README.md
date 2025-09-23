# CSE2102 Lab 2 - Pizza Factory

## Overview

In this project we learned how to implement a Pizza Factory using the Factory design pattern in Java.  
It includes multiple pizza types (Cheese, Greek, Pepperoni, GlutenFree, Vegan, Brazilian) and demonstrates the **Liskov Substitution Principle**, since each Pizza subclass can be used interchangeably where a Pizza is expected.

## Features

- Pizza interface with methods: `prepare()`, `bake()`, `cut()`, `box()`
- Concrete Pizza classes implementing these methods
- PizzaFactory class for creating pizzas
- PizzaStore class using the factory
- JUnit4 unit tests for each pizza type

## Tools Used

- Java
- JUnit 4.13.2
- Hamcrest 1.3
- VS Code
- Github
- ChatGPT

## How to Compile & Run

```bash
# Compile all Java files
javac -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" *.java

# Run unit tests
java -cp ".:junit-4.13.2.jar:hamcrest-core-1.3.jar" org.junit.runner.JUnitCore PizzaTest
```
