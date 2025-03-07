# 🚀 API REST con Spring Boot (H2, MySQL, MongoDB)

## 📄 Descripción  
Este repositorio contiene **tres versiones** de una API REST desarrollada con **Spring Boot**, que permite gestionar frutas mediante operaciones CRUD.  
Cada versión utiliza un sistema de persistencia diferente:  

✅ **H2** (Base de datos en memoria).  
✅ **MySQL** (Base de datos relacional).  
✅ **MongoDB** (Base de datos NoSQL).  

Todas las versiones incluyen:  
✔️ **Spring Boot y Spring Web** para construir la API.  
✔️ **Manejo de excepciones global con `GlobalExceptionHandler`**.  
✔️ **Excepciones personalizadas (`FrutaNotFoundException`, `FrutaAlreadyExistsException`)**.  
✔️ **Validaciones de datos** para garantizar integridad.  
✔️ **Arquitectura modular clara y mantenible**.  

---

## **📋 Requisitos**  
🔹 **Java 17 o superior**  
🔹 **Maven**  
🔹 **Para MySQL**: Tener MySQL instalado y en ejecución.  
🔹 **Para MongoDB**: Tener MongoDB instalado y en ejecución.  

---

## **🛠️ Instalación y Ejecución**  
1️⃣ **Clonar el repositorio:**  
   ```sh
   git clone https://github.com/tu-usuario/API-Rest-Spring.git
   cd API-Rest-Spring
