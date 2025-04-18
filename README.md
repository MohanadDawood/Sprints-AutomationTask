# Sprints Automation Task

This repository contains an automation project using **Selenium**, **TestNG**, and **Cucumber** for Behavior-Driven Development (BDD) to test sprint management applications.

## Features

- **Selenium WebDriver** for automated UI testing
- **TestNG** for test management and reporting
- **Cucumber** for BDD testing
- **Page Object Model (POM)** for maintainable test scripts

## Technologies Used

- **Java 11+**
- **Selenium WebDriver**
- **TestNG**
- **Cucumber**
- **Maven**
- **Log4j**

## Prerequisites

- **JDK 11+**
- **Maven**
- **Git**

### Setup Instructions

1. Clone the repository:

   ```bash
   git clone https://github.com/MohanadDawood/Sprints-AutomationTask.git
   ```

2. Navigate to the project directory:

   ```bash
   cd Sprints-AutomationTask
   ```

3. Install dependencies:

   ```bash
   mvn install
   ```

4. Run the tests:

   ```bash
   mvn test
   ```

## Project Structure

- **`src/main/java`**: Source code (e.g., page objects, drivers).
- **`src/test/java`**: Test classes and step definitions.
- **`testng.xml`**: TestNG configuration file.
- **`pom.xml`**: Maven dependency file.

## Reporting and Logs

- **Cucumber integrated Reports**: Located in the `target` directory.

## Contributing

1. Fork the repository.
2. Create a new branch.
3. Implement your changes and commit.
4. Push to your forked repository.
5. Submit a pull request.

Ensure that all tests pass before submitting a pull request.

## License

MIT License.
