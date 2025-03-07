API REST con Spring Boot (H2, MySQL, MongoDB)

📄 Descripción
Este repositorio contiene tres versiones de una API REST que gestiona frutas mediante operaciones CRUD, con persistencia en H2 (memoria), MySQL y MongoDB. Implementa validaciones, excepciones personalizadas y un GlobalExceptionHandler para manejar errores de forma centralizada.

🛠 Instalación y Ejecución
1️⃣ Clonar el repositorio:
git clone https://github.com/tu-usuario/API-Rest-Spring.git && cd API-Rest-Spring

2️⃣ Elegir la versión:
cd S04T02N01 (H2), cd S04T02N02 (MySQL), cd S04T02N03 (MongoDB)

3️⃣ Configurar la BD si es necesario (application.properties).

4️⃣ Ejecutar:
mvn spring-boot:run

📌 Endpoints principales
GET /fruta/getAll → Obtener todas las frutas
GET /fruta/getOne/{id} → Obtener fruta por ID
POST /fruta/add → Añadir fruta
PUT /fruta/update/{id} → Actualizar fruta
DELETE /fruta/delete/{id} → Eliminar fruta

📋 Tecnologías
Spring Boot · Spring Web · Spring Data JPA/MongoDB · H2 · MySQL · MongoDB

© 2025. Proyecto desarrollado por Ezequiel Macchi Seoane
