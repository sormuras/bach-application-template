# 📋 Modular Java Application Template

A canonical setup for a modular Java application using [Bach] as its build tool.

## Module `application`

Find sources of module `application` in the [application](application) directory.
The `application` module consists of two source files: a module declaration and a main program.
Here's their outline:

- [`application/module-info.java`](application/module-info.java)
  ```java
  module application {
    // ...
  }
  ```

- [`application/application/Main.java`](application/application/Main.java)
  ```java
  package application;
  class Main {
    // ...
  }
  ```

By convention, the name of the directory matches the name of the module.

## Configuration

A specific version of Bach is initialized in directory: [.bach](.bach)
This ensures this project is always buildable via calling `.bach/bin/bach[.bat] build`.

Sample [workflows](.github/workflows) running on GitHub Actions can be found in directory: [.github](.github)
Adopt them to your likings.

An exemplary configuration of IntelliJ's IDEA is provided in directory: [.idea](.idea)
Open this project with IDEA to build and run it on your machine.

[Bach]: https://github.com/sormuras/bach
