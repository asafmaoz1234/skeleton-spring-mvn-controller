# Spring Boot REST API Skeleton Controller

Welcome to the **Spring Boot REST API Skeleton Controller**—your go-to starter kit for rapidly developing Spring-based RESTful services.<br>
This compact repository is designed to save you valuable setup time by providing fully implemented Spring Boot endpoints, ready to roll.

## Features

- **Comprehensive Endpoints**: Pre-configured `SampleController` with GET, POST, PUT, and DELETE endpoints.
- **Dependency Injection**: Controller with autowired models for seamless integration.
- **Data Transfer Objects**: Includes payload classes for POST/PUT requests and response classes.
- **Unit Testing**: Sample unit tests using JUnit and Mockito to ensure code reliability.
- **API Documentation**: OpenAPI Specification (`oas.yaml`) included for maintaining API documentation.
- **Manual Testing**: Postman collection available in the `resources` directory for quick manual testing setup.

## Getting Started

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/asafmaoz1234/spring-rest-api-skeleton-controller.git
   ```
2. **Navigate to the Project Directory**:
   ```bash
   cd spring-rest-api-skeleton-controller
    ```
3. **Run the Application**: 
   ```bash
   ./mvnw clean install
   ./mvnw spring-boot:run
   ```

4. **Access the Application**:
      The application will be running at http://localhost:8080. 
      Use the provided Postman collection for testing endpoints.
## Project Structure
   * **src/main/java**: Contains the Java source code, including controllers, models, and services.
   * **src/main/resources**: Houses the Postman collection and oas.yaml for API documentation.
   * **src/test**: Includes unit tests demonstrating the use of JUnit and Mockito.
## Customization
   * **Endpoints**: Modify or add new endpoints in the SampleController as per your application's requirements.
   * **Models**: Update the model classes to reflect your data structures.
   * **Testing**: Extend the unit tests to cover new functionality.
   * **Documentation**: Keep the oas.yaml file updated to reflect any API changes.
## License
   This project is licensed under the MIT License.

Say goodbye to the hassle of starting from scratch—your Spring Boot journey begins here. Happy coding! 🚀
