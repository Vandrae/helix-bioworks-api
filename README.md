# helix-bioworks-api
a continuation of https://github.com/Vandrae/helix-bioworks
## Getting Started

### Prerequisites
- Java 17+
- MySQL 8+
- Maven

### Setup

1. Clone the repo

2. Create the database
   Open MySQL Workbench and run:
   src/main/resources/schema.sql

3. Set environment variables
   Copy .env.example to .env and fill in your MySQL credentials:
   DB_USERNAME=your_username
   DB_PASSWORD=your_password

4. Run the app
   ./mvnw spring-boot:run
