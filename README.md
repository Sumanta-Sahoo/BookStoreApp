# Book Management Store

## Overview

Welcome to the Book Management Store, a web application designed to perform CRUD (Create, Read, Update, Delete) operations for managing books. This application leverages Spring Boot for the backend, React and Bootstrap for the frontend, and MySQL for database management. The project adheres to well-established design patterns to ensure scalability and maintainability.

## Features

- **Add Books**: Add new books to the inventory with details such as title, author, genre, and price.
- **Search Books**: Search for books by title, author, genre, or other criteria.
- **Update Books**: Edit and update book details.
- **Delete Books**: Remove books from the inventory.
- **Responsive Design**: User-friendly interface with Bootstrap, ensuring responsiveness across devices.

## Technologies Used

- **Backend**: 
  - Spring Boot
  - Java
  - RESTful APIs

- **Frontend**: 
  - React
  - Bootstrap

- **Database**: 
  - MySQL

## Project Structure

- **Backend (Spring Boot)**:
  - `src/main/java/com/bookstore/` - Contains all the Java source files.
  - `src/main/resources/` - Configuration files and static resources.

- **Frontend (React & Bootstrap)**:
  - `src/` - Contains all React components and styling files.
  - `public/` - Public assets.

- **Database**:
  - MySQL scripts and connection configuration.

## Design Patterns

- **Model-View-Controller (MVC)**: Ensures separation of concerns and facilitates organized code.
- **Repository Pattern**: Encapsulates the logic for accessing data sources, promoting testability and flexibility.

## Getting Started

### Prerequisites

- **Java 11+**
- **Node.js**
- **MySQL**
- **Maven**

### Installation

1. **Clone the Repository**:
   ```sh
   git clone https://github.com/your-username/book-management-store.git
   ```

2. **Backend Setup**:
   - Navigate to the backend directory:
     ```sh
     cd book-management-store/backend
     ```
   - Build the project using Maven:
     ```sh
     mvn clean install
     ```
   - Run the Spring Boot application:
     ```sh
     mvn spring-boot:run
     ```

3. **Frontend Setup**:
   - Navigate to the frontend directory:
     ```sh
     cd book-management-store/frontend
     ```
   - Install dependencies:
     ```sh
     npm install
     ```
   - Start the React development server:
     ```sh
     npm start
     ```

4. **Database Setup**:
   - Create a MySQL database named `bookstore`.
   - Import the provided SQL script to set up the necessary tables.
   - Update the database configuration in `application.properties`.

## Usage

1. **Access the Application**:
   - Open your browser and navigate to `http://localhost:3000` to access the frontend.
   - Use `http://localhost:8080` for backend API access.

2. **Perform CRUD Operations**:
   - **Add Books**: Use the provided form to add new books.
   - **Search Books**: Utilize the search functionality to find books.
   - **Update Books**: Edit existing book details.
   - **Delete Books**: Remove books from the inventory.

## Contribution

Contributions are welcome! Please create a pull request or open an issue to discuss any changes or improvements.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Contact

For any questions or support, please contact sumantasahoo138@gmail.com.

---

Thank you for using the Book Management Store! We hope it helps you manage your book inventory efficiently.
