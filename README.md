# Helix Bioworks API
> *Evolution, Engineered.*

A corporate bioengineering order management system built in Java. Helix Bioworks simulates an internal ordering platform for a fictional biotech company, allowing users to browse, manage, and process bioengineering product orders through an interactive console interface.

---

## Table of Contents

- [About](#about)
- [The Company](#the-company)
- [The Genomes](#the-genomes)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Usage](#usage)
- [Contributing](#contributing)

---

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

## About

Helix Bioworks is a Java console application that models an order management workflow for a fictional bioengineering corporation. The project demonstrates object-oriented design principles including encapsulation, inheritance, and clean separation of concerns across data models, services, and a user-facing interface.

---

## The Company

**Helix Bioworks** — *Evolution, Engineered.*
**Currency:** Credits (`⬡ X.XX CR`)

A cutting-edge corporate bioengineering firm operating in a morally grey sci-fi setting. Cold, clinical, and unsettling in tone — think Weyland-Yutani meets genetic arms race. Clients commission custom organisms built to specification. The company processes orders without ethical commentary. The paperwork is always filed correctly.

### The Setting

Helix Bioworks operates in a world where genetic engineering has outpaced regulation. The firm serves anyone with the right license tier and enough Credits. Military contractors, private security firms, research institutions, wealthy civilians, and crime syndicates all use the same ordering system. The receipt looks the same regardless of what the organism will be used for.

---

## The Genomes

### 🧠 Primate Base
Closest to human neurology. Disturbingly intelligent. Even a minimally augmented primate splice will watch you. Study you. Clients who complain about eye contact are reminded they asked for this. Most requested by pharmaceutical labs and wealthy civilians. With heavy augmentation — something that used to be recognizable and no longer is.

### 🪲 Insectoid Base
Not one creature — a colony architecture compressed into a single body. Distributed nervous system means damage that would kill anything else just slows these down. No pain response in the conventional sense. Ideal for bulk orders, agriculture, industrial labor, swarm deployment. With acid augmentation — a walking chemical weapon that doesn't know it's dying.

### 🦎 Reptilian Base
Cold-blooded in every sense. Slower metabolism means they can go weeks without feeding — ideal for long-deployment scenarios. Ambush predators by default. They don't chase, they wait. The baseline for most black market orders. With chromatophore augmentation — invisible until it isn't.

### 🦅 Avian Base
The most structurally alien-looking of the terrestrial bases. Hollow bones, binocular vision, spatial awareness that makes them nearly impossible to surprise. Disturbingly fast. Razor keratin on wing edges before any augmentation is added. With bio-electric augmentation — it hits you before you hear it.

### 🐟 Aquatic Base
Built for pressure, darkness, and silence. The lateral line organ — borrowed from deep-sea fish DNA — detects movement through vibration in air as well as water. They always know you're in the room. Bioluminescent capability toggleable as a standard mod. With crushing appendages — something from a depth humans were never meant to reach.

### ☠️ Apex Predator Base
Spliced from multiple predator lineages — big cat musculature, shark sensory array, Komodo immune system. The alien mutations push it past anything that existed naturally. Threat assessment is hardwired — it categorizes everything as prey or not-prey. **No civilian license. Military and licensed security only.** Helix Bioworks is not liable.

---

## Features

- Browse and manage bioengineering product catalog
- Create, view, and process customer orders
- Console-driven interactive UI
- Clean OOP architecture with distinct model and logic layers

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17 |
| Framework | Spring Boot |
| Security | Spring Security + JWT |
| ORM | Spring Data JPA / Hibernate |
| Database | MySQL |

---

## Prerequisites

Make sure you have the following installed before running the project:

- [Java 17+](https://adoptium.net/) — check with `java -version`
- [Apache Maven 3.6+](https://maven.apache.org/install.html) — check with `mvn -version`

---

## Getting Started

**1. Clone the repository**

```bash
git clone https://github.com/Vandrae/helix-bioworks.git
cd helix-bioworks
```

**2. Build the project**

```bash
mvn compile
```

**3. Run the application**

```bash
mvn exec:java -Dexec.mainClass="com.pluralsight.Main"
```

Or run it directly from your IDE (IntelliJ IDEA, Eclipse, VS Code with Java extension) by opening the project as a Maven project and running `Main.java`.

---

## Project Structure

```
helix-bioworks/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── pluralsight/     # Application source files
├── target/                          # Compiled output (generated by Maven)
├── pom.xml                          # Maven project configuration
└── README.md
```

---

## Usage

Once launched, the application presents a menu-driven console interface. Follow the on-screen prompts to:

- View available bioengineering products
- Create and manage orders
- Review order summaries and totals

---

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you'd like to change.

1. Fork the repo
2. Create your feature branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m 'Add some feature'`
4. Push to the branch: `git push origin feature/your-feature`
5. Open a pull request

---

*Helix Bioworks — built as part of a Java development learning path.*

