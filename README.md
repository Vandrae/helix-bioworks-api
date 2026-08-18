# Helix Bioworks API

> *Evolution, Engineered.*

A corporate bioengineering order management REST API built with Spring Boot and MySQL. Helix Bioworks simulates a backend platform for a fictional biotech company, exposing endpoints to browse, manage, and process bioengineered organism orders.

---

## Table of Contents

- [About](#about)
- [The Company](#the-company)
- [The Genomes](#the-genomes)
- [Tech Stack](#tech-stack)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [API Endpoints](#api-endpoints)
- [Contributing](#contributing)

---

## About

Helix Bioworks API is a Spring Boot REST API backed by a MySQL database. The project models an order management workflow for a fictional bioengineering corporation. It demonstrates real-world backend development patterns including JPA entity relationships, Spring Data repositories, layered architecture (controller → service → repository), and secure credential management.

This project is an evolution of the original [Helix Bioworks console application](https://github.com/Vandrae/helix-bioworks), migrated to a full Spring Boot backend intended for eventual mobile app integration.

---

## The Company

**Helix Bioworks** — *Evolution, Engineered.* **Currency:** Credits (`⬡ X.XX CR`)

A cutting-edge corporate bioengineering firm operating in a morally grey sci-fi setting. Cold, clinical, and unsettling in tone — think Weyland-Yutani meets genetic arms race. Clients commission custom organisms built to specification. The company processes orders without ethical commentary. The paperwork is always filed correctly.

### The Setting

Helix Bioworks operates in a world where genetic engineering has outpaced regulation. The firm serves anyone with the right license tier and enough Credits. Military contractors, private security firms, research institutions, wealthy civilians, and crime syndicates all use the same ordering system. The receipt looks the same regardless of what the organism will be used for.

---

## The Genomes

### 🧠 Primate Base
Closest to human neurology. Disturbingly intelligent. Even a minimally augmented primate splice will watch you. Study you. Most requested by pharmaceutical labs and wealthy civilians.

### 🪲 Insectoid Base
Not one creature — a colony architecture compressed into a single body. Distributed nervous system means damage that would kill anything else just slows these down. Ideal for bulk orders, agriculture, industrial labor, swarm deployment.

### 🦎 Reptilian Base
Cold-blooded in every sense. Ambush predators by default. They don't chase, they wait. The baseline for most black market orders.

### 🦅 Avian Base
Hollow bones, binocular vision, spatial awareness that makes them nearly impossible to surprise. Disturbingly fast. Razor keratin on wing edges before any augmentation is added.

### 🐟 Aquatic Base
Built for pressure, darkness, and silence. The lateral line organ detects movement through vibration in air as well as water. They always know you're in the room.

### ☠️ Apex Predator Base
Spliced from multiple predator lineages — big cat musculature, shark sensory array, Komodo immune system. **No civilian license. Military and licensed security only.** Helix Bioworks is not liable.

---

## Tech Stack

| Layer      | Technology                  |
|------------|-----------------------------|
| Language   | Java 17                     |
| Framework  | Spring Boot 4.1             |
| ORM        | Spring Data JPA / Hibernate |
| Database   | MySQL 9.7                   |
| Build Tool | Maven                       |

---

## Getting Started

### Prerequisites

- [Java 17+](https://adoptium.net/) — check with `java -version`
- [MySQL 8+](https://dev.mysql.com/downloads/) — check with `mysql --version`
- [Maven 3.6+](https://maven.apache.org/install.html) — check with `mvn -version`

### Setup

**1. Clone the repository**
```bash
git clone https://github.com/Vandrae/helix-bioworks-api.git
cd helix-bioworks-api
```

**2. Create the database**

Open MySQL Workbench and run:
```sql
CREATE DATABASE helix;
```

The seed file at `src/main/resources/data.sql` runs automatically on startup and loads all 59 signature organisms across 6 genome types.

**3. Set environment variables**

Add the following to your IntelliJ run configuration under **Edit Configurations → Environment Variables**, or set them in your shell:
```
DB_USERNAME=your_mysql_username
DB_PASSWORD=your_mysql_password
```

**4. Run the app**
```bash
./mvnw spring-boot:run
```

The API will start on `http://localhost:8080`.

---

## Project Structure

```
helix-bioworks-api/
├── src/
│   └── main/
│       ├── java/com/pluralsight/helix/
│       │   ├── controller/         # REST controllers
│       │   ├── service/            # Business logic
│       │   ├── repository/         # Spring Data JPA repositories
│       │   ├── organism/           # JPA entity classes
│       │   ├── order/              # Order-related classes
│       │   └── HelixApplication.java
│       └── resources/
│           ├── application.properties
│           └── data.sql            # Seed data — 59 organisms, INSERT IGNORE safe
├── pom.xml
└── README.md
```

---

## API Endpoints

> Base URL: `http://localhost:8080`

| Method | Endpoint                                        | Description                                        |
|--------|-------------------------------------------------|----------------------------------------------------|
| GET    | `/organisms`                                    | Get all organisms                                  |
| GET    | `/organisms/{id}`                               | Get a single organism by ID                        |
| GET    | `/organisms/genome/{genome}`                    | Filter by genome type                              |
| GET    | `/organisms/size/{scale}`                       | Filter by scale class                              |
| GET    | `/organisms/offensive-adaptation/{name}`        | Find organisms with a specific offensive adaptation|
| GET    | `/organisms/defensive-adaptation/{name}`        | Find organisms with a specific defensive adaptation|
| GET    | `/organisms/standard-adaptation/{name}`         | Find organisms with a specific standard mod        |
| GET    | `/organisms/behavioral-adaptation/{name}`       | Find organisms with a specific behavior            |

### Example Requests

```
GET /organisms/genome/REPTILIAN
GET /organisms/size/CLASS_IV
GET /organisms/offensive-adaptation/Venom Glands
GET /organisms/defensive-adaptation/Toxin Immunity
GET /organisms/standard-adaptation/Pack Tactics
GET /organisms/behavioral-adaptation/Territorial
```

### Valid Genome Values
`REPTILIAN` `AVIAN` `PRIMATE` `AQUATIC` `INSECTOID` `APEX`

### Valid Scale Values
`CLASS_I` `CLASS_II` `CLASS_III` `CLASS_IV`

