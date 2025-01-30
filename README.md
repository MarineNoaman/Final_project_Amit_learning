# Final Project - Amit Learning

## Project Overview

This project is designed to automate the process of purchasing two products from a website using Java, Selenium WebDriver, TestNG, and Cucumber (BDD). The objective is to validate the key user flows such as logging in, adding products to the cart, and completing a purchase, while ensuring the application works as expected. The automation scripts are developed with behavior-driven testing to ensure functionality in a clear and understandable way.

## Technologies and Tools Used

- **Programming Language**: Java
- **Automation Framework**: Selenium WebDriver
- **Test Framework**: TestNG
- **BDD Framework**: Cucumber (for feature and scenario creation)
- **Reporting**: Extent Reports, Allure Reports (for detailed test execution feedback)

## Project Structure

- **Feature Files**: Contain the BDD scenarios written in Gherkin language.
- **Step Definitions**: Map the steps from the feature files to actual code that interacts with the web application.
- **TestNG Configurations**: Set up the environment for running the tests and generating reports.
- **Page Object Model**: Encapsulates the web elements and actions within the page.

## Key Feature: Valid Purchasing of 2 Products

### Scenario: User can purchase 2 products

This scenario simulates the entire process of a user logging into the application, adding two products to the cart, and completing the purchase.

#### Steps:
1. **Login**:
   - Click on the "Login" button.
   - Enter the username and password.
   - Click "Login" to access the account.
   
2. **Add Products to Cart**:
   - Select "Laptops" from the categories on the homepage.
   - Choose Product 1 and add it to the cart.
   - Go back to the homepage and select Product 2.
   - Add Product 2 to the cart.

3. **Proceed to Checkout**:
   - Navigate to the cart and click "Place Order".
   - Fill in the required details such as Name, Country, City, and Credit Card Information.
   - Confirm the purchase by clicking "Purchase".

4. **Confirmation**:
   - After the purchase, the user should see a success message confirming the order.

## How to Run the Tests

### Prerequisites

1. **Java** (JDK 23 or above) must be installed on your machine.
2. **Maven** must be installed for managing project dependencies.
3. **Selenium WebDriver**: Ensure that the appropriate driver (e.g., ChromeDriver for Google Chrome) is installed and set up in your system.

### Steps to Run the Project

1. Clone the repository to your local machine.
2. Open a terminal and navigate to the project folder.
3. Run the following command to install dependencies via Maven:
   ```bash
   mvn clean install
   ```

4. Execute the tests using:
   ```bash
   mvn test
   ```

   This command will trigger the execution of the tests defined in the feature files and run them through the Cucumber-TestNG integration.

### Generate Test Reports

Once the tests have been executed, you can generate and view the reports using:

```bash
mvn allure:serve
```

This will display the test results in an easily readable format via a browser.

## Dependencies

The following dependencies are included in the project:

```xml
<dependencies>
    <!-- Selenium for browser automation -->
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.27.0</version>
    </dependency>

    <!-- TestNG for running tests -->
    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.10.2</version>
        <scope>test</scope>
    </dependency>

    <!-- Cucumber Java for Behavior-Driven Development -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-java</artifactId>
        <version>7.20.1</version>
    </dependency>

    <!-- Cucumber TestNG Integration -->
    <dependency>
        <groupId>io.cucumber</groupId>
        <artifactId>cucumber-testng</artifactId>
        <version>7.20.1</version>
    </dependency>

    <!-- Extent Reports for Test Reporting -->
    <dependency>
        <groupId>tech.grasshopper</groupId>
        <artifactId>extentreports-cucumber7-adapter</artifactId>
        <version>1.14.0</version>
    </dependency>
</dependencies>
```

## Notes

- This project uses **Behavior-Driven Development (BDD)** principles with **Cucumber**, which makes it easy to define scenarios in natural language and execute them as tests.
- **TestNG** is used to run and manage the test cases while generating execution reports.
- The tests are designed to simulate a real user interacting with the application, ensuring all core functionalities work as expected.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

---

Feel free to contribute or use this as a reference for learning and automating test cases!
