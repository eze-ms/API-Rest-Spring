# 📄 Proyecto Spring Boot con MongoDB

## 📄 Descripción
Este proyecto es una API REST desarrollada con **Spring Boot**, que permite gestionar frutas en una base de datos **MongoDB**. Implementa operaciones CRUD y un manejo centralizado de excepciones.

### **Características principales**
- API REST para la gestión de frutas.  
- Persistencia en base de datos **MongoDB** (NoSQL).  
- Implementación de **Spring Data MongoDB** en lugar de JPA.  
- Manejo centralizado de excepciones con `GlobalExceptionHandler`.  
- Excepciones personalizadas:
- `FrutaNotFoundException`: Se lanza cuando una fruta no existe (`404 Not Found`).
- `FrutaAlreadyExistsException`: Se lanza si se intenta crear una fruta duplicada (`400 Bad Request`).
- `ErrorMessage`: Estructura estándar para devolver errores en la API.

---

## **🛠 Funcionalidad**
La API permite:
- **Crear** una fruta (`POST /fruta/add`).
- **Obtener todas** las frutas (`GET /fruta/getAll`).
- **Buscar** una fruta por ID (`GET /fruta/getOne/{id}`).
- **Actualizar** una fruta (`PUT /fruta/update/{id}`).
- **Eliminar** una fruta (`DELETE /fruta/delete/{id}`).
- **Manejo de excepciones**:
    - `FrutaNotFoundException` → Devuelve `404 Not Found` si la fruta no existe.
    - `FrutaAlreadyExistsException` → Devuelve `400 Bad Request` si la fruta ya está registrada.

---

## **💻 Tecnologías Utilizadas**
- **Spring Boot** (Framework principal).
- **Spring Web** (Para construir la API REST).
- **Spring Data MongoDB** (Para acceso a la base de datos NoSQL).
- **MongoDB** (Base de datos NoSQL).
- **Spring Boot DevTools** (Para desarrollo en caliente).

---

## **📋 Requisitos**
- **Java 17 o superior**
- **Maven**
- **MySQL instalado y corriendo**

---

## **🛠️ Instalación**
1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/eze-ms/API-Rest-Spring/tree/main/S04T02N03%20MongoDB
   ```

2. **Configurar la conexión a MongoDB en application.properties**
 ```sh
  spring.data.mongodb.uri=mongodb://localhost:27017/fruta_db
   ```
---

## **▶️ Ejecución**
- **Iniciar la aplicación:**
    ```sh
    mvn spring-boot:run
   ```
---

© 2025. Proyecto desarrollado por Ezequiel Macchi Seoane