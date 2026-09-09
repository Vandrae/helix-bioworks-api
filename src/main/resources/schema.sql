-- =============================================
-- HELIX BIOWORKS - Schema
-- Uses CREATE TABLE IF NOT EXISTS
-- Safe to run on empty or populated database
-- =============================================

CREATE TABLE IF NOT EXISTS organisms (
    id                 INT AUTO_INCREMENT PRIMARY KEY,
    name               VARCHAR(100) NOT NULL,
    genome             VARCHAR(50)  NOT NULL,
    scale              VARCHAR(50)  NOT NULL,
    accelerated_growth BOOLEAN      NOT NULL DEFAULT FALSE
);

CREATE TABLE IF NOT EXISTS defensive_adaptations (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    organism_id INT          NOT NULL,
    name        VARCHAR(100) NOT NULL,
    cost        DOUBLE       NOT NULL DEFAULT 0,
    is_extra    BOOLEAN      NOT NULL DEFAULT FALSE,
    FOREIGN KEY (organism_id) REFERENCES organisms(id)
);

CREATE TABLE IF NOT EXISTS offensive_adaptations (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    organism_id INT          NOT NULL,
    name        VARCHAR(100) NOT NULL,
    cost        DOUBLE       NOT NULL DEFAULT 0,
    is_extra    BOOLEAN      NOT NULL DEFAULT FALSE,
    FOREIGN KEY (organism_id) REFERENCES organisms(id)
);

CREATE TABLE IF NOT EXISTS standard_mods (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    organism_id INT          NOT NULL,
    name        VARCHAR(100) NOT NULL,
    FOREIGN KEY (organism_id) REFERENCES organisms(id)
);

CREATE TABLE IF NOT EXISTS behaviors (
    id          INT AUTO_INCREMENT PRIMARY KEY,
    organism_id INT          NOT NULL,
    name        VARCHAR(100) NOT NULL,
    FOREIGN KEY (organism_id) REFERENCES organisms(id)
);
