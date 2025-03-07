# 📄 Proyecto Spring Boot con H2

## 📄 Descripción
Este proyecto es una API REST desarrollada con **Spring Boot**, que permite gestionar frutas en una base de datos **H2 en memoria**. Implementa operaciones CRUD y un manejo centralizado de excepciones.

### **Características principales**
- API REST para la gestión de frutas.  
- Persistencia en base de datos H2 en memoria.  
- Implementación de **JPA** para la capa de datos.  
- Manejo centralizado de excepciones con `GlobalExceptionHandler`.  
- Excepción personalizada `FrutaNotFoundException`.

---

## **🛠 Funcionalidad**
La API permite:
- **Crear** una fruta (`POST /fruta/add`).
- **Obtener todas** las frutas (`GET /fruta/getAll`).
- **Buscar** una fruta por ID (`GET /fruta/getOne/{id}`).
- **Actualizar** una fruta (`PUT /fruta/update/{id}`).
- **Eliminar** una fruta (`DELETE /fruta/delete/{id}`).
- **Manejo de excepciones**:
    - `FrutaNotFoundException`: Si la fruta no existe, devuelve `404 Not Found`.

---

## **💻 Tecnologías Utilizadas**
- **Spring Boot** (Framework principal).
- **Spring Web** (Para construir la API REST).
- **Spring Data JPA** (Para acceso a la base de datos).
- **H2 Database** (Base de datos en memoria).
- **Spring Boot DevTools** (Para desarrollo en caliente).

---

## **📋 Requisitos**
- **Java 17 o superior**
- **Maven**

---

## **🛠️ Instalación**
1. **Clonar el repositorio:**
   ```sh
   git clone https://github.com/tu-usuario/proyecto-h2.git
   cd proyecto-h2
   
---

## **▶️ Ejecución**
- **Iniciar la aplicación:**
    ```sh
    mvn spring-boot:run
   ```
---

© 2025. Proyecto desarrollado por Ezequiel Macchi Seoane

