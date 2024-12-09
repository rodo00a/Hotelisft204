# hotel_isft_204

Proyecto: <b> "Sistema de registracion de reservas p/ hoteles" </b> <br> 
Catedra: <b>PROGRAMACION ORIENTADA A OBJETOS ( JAVA )</b> <br>
Titular de catedra: Esteban Santini <br>
Periodo: Segundo cuatrimestre 2024 + Final <br>
Autores: ( por orden alfabetico ) <br>
- Aquino Diego Angel <br>
- Asaro Matias Alberto
<br>
## Documentación Técnica - Proyecto Hotelisft204

#### Última actualización: 28 de Octubre 2024

## 1. Información General del Proyecto

- **Nombre del Proyecto**: Hotelisft204
- **Versión**: 1.0-SNAPSHOT
- **Grupo**: com.AquinoAsaro
- **Java Version**: 21
- **Tipo de Proyecto**: Maven
- **Nombre BD**: Hotelisft204

## 2. Tecnologías y Versiones

### 2.1 Java Persistence API (JPA)

- **Versión JPA**: 2.2
- **Implementación**: EclipseLink 2.7.12
- **Proveedor de Persistencia**: `org.eclipse.persistence.jpa.PersistenceProvider`

### 2.2 Base de Datos

- **Sistema de Gestión**: MariaDB
- **Driver**: `org.mariadb.jdbc.Driver`
- **Versión del Cliente**: 3.3.0
- **Versión de MySQL**: 8.0.33

### 2.3 Dependencias Principales

```xml
<!-- MariaDB Driver -->
<dependency>
    <groupId>org.mariadb.jdbc</groupId>
    <artifactId>mariadb-java-client</artifactId>
    <version>3.3.0</version>
</dependency>

<!-- EclipseLink Core -->
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.core</artifactId>
    <version>2.7.12</version>
</dependency>

<!-- EclipseLink JPA -->
<dependency>
    <groupId>org.eclipse.persistence</groupId>
    <artifactId>org.eclipse.persistence.jpa</artifactId>
    <version>2.7.12</version>
</dependency>
```

## 3. Entidades y Relaciones

### 3.1 Habitacion
- **Atributos:**
  - `id`: Identificador único de la habitación
  - `numero`: Número de la habitación
  - `camasSingle`: Cantidad de camas individuales
  - `camasDobles`: Cantidad de camas dobles
  - `precio`: Precio por noche
  - `estado`: Estado de la habitación (disponible/no disponible)
- **Relaciones:**
  - Tiene una relación de uno a muchos (`@OneToMany`) con la entidad `Reserva`

### 3.2 Pasajero
- **Atributos:**
  - `id`: Identificador único del pasajero
  - `apellido`: Apellido del pasajero
  - `nombre`: Nombre del pasajero
  - `documento`: Documento de identidad
  - `telefono`: Número de teléfono
  - `correoElectronico`: Correo electrónico
- **Relaciones:**
  - Tiene una relación de uno a muchos (`@OneToMany`) con la entidad `Reserva`

### 3.3 Reserva
- **Atributos:**
  - `id`: Identificador único de la reserva
  - `fechaIngreso`: Fecha de ingreso
  - `fechaSalida`: Fecha de salida
  - `montoSenia`: Monto de la seña
  - `estado`: Estado de la reserva (activa/cancelada)
- **Relaciones:**
  - Tiene una relación de muchos a uno (`@ManyToOne`) con la entidad `Pasajero`
  - Tiene una relación de muchos a uno (`@ManyToOne`) con la entidad `Habitacion`

## 4. Diagramas

### 4.1 Diagrama de Clases

```plaintext
+-------------------+          +-----------------------------+
|    Habitacion     |          |          Pasajero           |
+-------------------+          +-----------------------------+
| - id: int         |          | - id: int                   |
| - numero: int     |          | - apellido: String          |
| - camasSingle: int|          | - nombre: String            |
| - camasDobles: int|          | - documento: double         |
| - precio: double  |          | - telefono: double          |
| - estado: boolean |          | - correoElectronico: String |
+-------------------+          +-----------------------------+
| + isDisponible()  |                       | 
+-------------------+                       | 1
         |                                  | 
         | 1                                | 
         |                                  | 
         |                                  | 
         | *                                | 
+-----------------------+                   | 
|        Reserva        |                   |  
+-----------------------+                   |  
| - id: int             |                   | 
| - fechaIngreso: Date  |                   |  
| - fechaSalida: Date   |                   |  
| - montoSenia: double  |-------------------|         
| - estado: boolean     | *         
+-----------------------+         
| + calcularCostoTotal()|     
| + validarFechas()     |     
+-----------------------+         
```

### 4.2 Explicación de Relaciones

- **Habitacion - Reserva:**
  - Relación: OneToMany (1:*)
  - Una habitación puede tener múltiples reservas
  - Cada reserva corresponde a una única habitación

- **Pasajero - Reserva:**
  - Relación: OneToMany (1:*)
  - Un pasajero puede tener múltiples reservas
  - Cada reserva corresponde a un único pasajero

- **Pasajero - Habitacion:**
  - Relación: Indirecta a través de Reserva
  - Un pasajero se relaciona con una habitación mediante una reserva

### 4.3 Diagrama de Casos de Uso

```plaintext
+---------------------+
|      Sistema        |
|  de Reservas de     |
|       Hotel         |
+---------------------+
         |
         |
         |
+---------------------+
|      Pasajero       |
+---------------------+
| - Hacer Reserva     |
| - Consultar Reserva |
| - Cancelar Reserva  |
+---------------------+
         |
         |
         |
+--------------------------+
|      Administrador       |
+--------------------------+
| - Gestionar Habitaciones |
| - Consultar Reservas     |
| - Modificar Reservas     |
+--------------------------+
```

## 5. Casos de Uso

### 5.1 Descripción de Casos de Uso
- **Hacer Reserva**: El pasajero puede realizar una reserva de habitación especificando las fechas de ingreso y salida
- **Consultar Reserva**: El pasajero puede consultar el estado de sus reservas
- **Cancelar Reserva**: El pasajero puede cancelar una reserva existente
- **Gestionar Habitaciones**: El administrador puede agregar, modificar o eliminar habitaciones en el sistema
- **Consultar Reservas**: El administrador puede ver todas las reservas

## 6. Software y Herramientas de Desarrollo

### 6.1 Entorno de Desarrollo Integrado (IDE)
- **NetBeans 22**
  - IDE principal para el desarrollo del proyecto
  - Características utilizadas:
    - Soporte nativo para Maven
    - Integración con JPA
    - Herramientas de depuración
    - Generador de código para entidades JPA
  - [Tutoriales oficiales de NetBeans](https://netbeans.apache.org/tutorial/main/kb/)

### 6.2 Gestión de Base de Datos
- **HeidiSQL 12**
  - Cliente SQL para MariaDB
  - Características utilizadas:
    - Interfaz gráfica para gestión de bases de datos
    - Editor SQL con resaltado de sintaxis
    - Exportación e importación de datos
  - [Documentación oficial de HeidiSQL](https://www.heidisql.com/help.php)

### 6.3 Documentación Oficial

#### Java Documentation
- [Java SE 21 Documentation](https://docs.oracle.com/en/java/javase/21/)
- Guías y tutoriales
- API Reference
- Notas de la versión

#### Maven
- [Apache Maven Documentation](https://maven.apache.org/guides/)
- Versión: 3.9.5
- Guías:
  - [Getting Started](https://maven.apache.org/guides/getting-started/)
  - [Maven Quick Reference](https://maven.apache.org/guides/MavenQuickReferenceCard.pdf)
  - [POM Reference](https://maven.apache.org/pom.html)
- Gestión de dependencias
- Plugins
- Configuración

#### JPA (Java Persistence API)
- [javax.persistence](https://docs.oracle.com/javaee/7/api/javax/persistence/package-summary.html)
- Versión: 2.2
- Implementación: EclipseLink 2.7.12
- Especificaciones y API
- Guías de uso
- Anotaciones disponibles
- Configuración de persistence.xml

#### MariaDB
- [MariaDB Documentation](https://mariadb.org/documentation/)
- Guía de instalación y configuración
- Referencias SQL
- Optimización y rendimiento

### 6.4 Java Swing GUI Builder (En desarrollo)
- Editor visual de interfaces gráficas
- Características principales:
  - Diseñador drag-and-drop
  - Paleta de componentes Swing
  - Gestión automática de layouts
  - Generación de código Java
  - Propiedades y eventos de componentes
- [Documentación oficial del Form Editor](https://netbeans.apache.org/tutorial/main/kb/docs/java/quickstart-gui/)

##  SCRIPT para la base de datos (generado a modo de ejemplo) :
```plaintext
-- Los precios de las habitaciones quedaron establecidos según la cantidad de camas:

--    1 cama single = $15,000
--    2 camas singles = $25,000
--    3 camas singles = $35,000
--    1 cama doble = $25,000
--    Combinaciones (ejemplos):
--    3 singles + 1 doble = $45,000
--    2 singles + 1 doble = $35,000
--    1 single + 1 doble = $30,000
--    Habitación sin camas = $10,000


CREATE DATABASE IF NOT EXISTS hotelisft204;

USE hotelisft204;

CREATE TABLE IF NOT EXISTS Pasajero (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    apellido VARCHAR(100),
    documento INT UNIQUE,
    telefono INT,
    correoElectronico VARCHAR(100)
);

INSERT INTO Pasajero (nombre, apellido, documento, telefono, correoElectronico) VALUES
('Diego', 'Aquino', 28456123, 223584761, 'diego.aquino@gmail.com'),
('Maria', 'Gomez', 31789456, 011478523, 'maria.gomez@hotmail.com'),
('Juan', 'Pérez', 29654321, 223695847, 'juan.perez@yahoo.com'),
('Ana', 'Lopez', 33987654, 011589632, 'ana.lopez@outlook.com'),
('Pedro', 'Martinez', 30147852, 223147852, 'pedro.martinez@gmail.com'),
('Lucia', 'Fernandez', 32951847, 011963852, 'lucia.fernandez@yahoo.com'),
('Carlos', 'Sanchez', 27369852, 223741852, 'carlos.sanchez@hotmail.com'),
('Laura', 'Rodriguez', 34159753, 011852963, 'laura.rodriguez@gmail.com'),
('Javier', 'Hernandez', 28753951, 223159753, 'javier.hernandez@outlook.com'),
('Sofia', 'Cruz', 33852741, 011741852, 'sofia.cruz@yahoo.com');

CREATE TABLE IF NOT EXISTS Habitacion (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT UNIQUE,
    precio DECIMAL(10,2),
    camasSingle INT CHECK (camasSingle >= 0 AND camasSingle <= 3),
    camasDobles INT CHECK (camasDobles >= 0 AND camasDobles <= 1),
    estado BOOLEAN
);

INSERT INTO Habitacion (numero, precio, camasSingle, camasDobles, estado) VALUES
(7, 15000.00, 1, 0, TRUE),    -- 1 single = 15000
(15, 25000.00, 2, 0, TRUE),   -- 2 singles = 25000
(23, 45000.00, 3, 1, TRUE),   -- 3 singles + 1 doble = 45000
(31, 25000.00, 0, 1, TRUE),   -- 1 doble = 25000
(38, 35000.00, 2, 1, TRUE),   -- 2 singles + 1 doble = 35000
(42, 30000.00, 1, 1, TRUE),   -- 1 single + 1 doble = 30000
(12, 35000.00, 3, 0, TRUE),   -- 3 singles = 35000
(27, 10000.00, 0, 0, TRUE),   -- sin camas (sala) = 10000
(45, 25000.00, 2, 0, TRUE),   -- 2 singles = 25000
(19, 15000.00, 1, 0, TRUE);   -- 1 single = 15000

CREATE TABLE IF NOT EXISTS Reserva (
    id INT AUTO_INCREMENT PRIMARY KEY,
    pasajero_id INT,
    habitacion_id INT,
    fechaIngreso DATETIME,
    fechaSalida DATETIME,
    montoSenia DECIMAL(10,2),
    estado BOOLEAN,
    FOREIGN KEY (pasajero_id) REFERENCES Pasajero(id),
    FOREIGN KEY (habitacion_id) REFERENCES Habitacion(id)
);

INSERT INTO Reserva (pasajero_id, habitacion_id, fechaIngreso, fechaSalida, montoSenia, estado) VALUES
(1, 1, '2024-01-05 14:00:00', '2024-01-08 10:00:00', 5800.00, TRUE),
(2, 2, '2024-01-10 15:00:00', '2024-01-15 10:00:00', 12500.00, TRUE),
(3, 3, '2024-01-20 13:00:00', '2024-01-25 10:00:00', 18900.00, TRUE),
(4, 4, '2024-02-01 14:00:00', '2024-02-05 10:00:00', 7300.00, TRUE),
(5, 5, '2024-02-10 15:00:00', '2024-02-15 10:00:00', 15600.00, TRUE),
(6, 6, '2024-02-20 13:00:00', '2024-02-25 10:00:00', 9800.00, TRUE),
(7, 7, '2024-03-01 14:00:00', '2024-03-05 10:00:00', 4200.00, TRUE),
(8, 8, '2024-03-10 15:00:00', '2024-03-15 10:00:00', 3500.00, TRUE),
(9, 9, '2024-03-20 13:00:00', '2024-03-25 10:00:00', 16700.00, TRUE),
(10, 10, '2024-04-01 14:00:00', '2024-04-05 10:00:00', 19500.00, TRUE);
```
