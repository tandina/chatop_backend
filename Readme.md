# README
## Installation du projet Chatop
### Prérequis

- Java 17
- Maven
- PostgreSQL

### Étapes d'installation

1. Clonez le dépôt GitHub sur votre machine locale en utilisant la commande suivante : git clone https://github.com/tandina/chatop_backend

2. Naviguez jusqu'au répertoire du projet :

cd api

### Configuration de la base de données

1. Installez PostgreSQL si ce n'est pas déjà fait. 

2. Créez une base de données nommée postgres.

3. Assurez-vous que les informations de connexion à la base de données dans le fichier application.properties correspondent à votre configuration PostgreSQL. Par défaut, les paramètres sont les suivants :

spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=root
spring.datasource.driver-class-name=org.postgresql.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=false
spring.jpa.properties.hibernate.format_sql=true
logging.level.root=DEBUG

### Documentation API

La documentation de l'API est accessible à l'adresse http://localhost:8080/swagger-ui/