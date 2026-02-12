# API de Gestión de Estudiantes

Proyecto desarrollado para el examen evaluativo #1 de Plataformas de Programación Empresarial.

Esta API permite registrar y consultar estudiantes, aplicando arquitectura por capas, GitOps y CI/CD.

---

## Tecnologías utilizadas

- Java 17
- Spring Boot
- Gradle (Groovy)
- GitHub
- GitHub Actions

---

## 1 Instrucciones de ejecución

### Clonar el repositorio

git clone https://github.com/Sebastian-Orcasita/estudiantes-api.git
cd estudiantes-api

### 2 Ejecutar la aplicación

Windows:
gradlew bootRun

Linux/Mac:
./gradlew bootRun

La API quedará disponible en:

http://localhost:8080

Endpoint principal:
http://localhost:8080/estudiantes

---

## Endpoints disponibles

### Crear estudiante
POST /estudiantes

Ejemplo de JSON:

{
  "id": "1",
  "nombre": "Sebastian",
  "carrera": "Ingeniería de Sistemas"
}

Retorna 201 Created si el registro es exitoso.

---

### Listar estudiantes
GET /estudiantes

Retorna todos los estudiantes registrados.

---

## Cómo probar la API

Se recomienda utilizar herramientas como:

- Postman
- Insomnia
- curl (línea de comandos)

Ejemplo usando Postman:

1. Método: POST
2. URL: http://localhost:8080/estudiantes
3. Body → raw → JSON:

{
  "id": "1",
  "nombre": "Sebastian",
  "carrera": "Ingeniería de Sistemas"
}

Luego se puede consultar con:

GET http://localhost:8080/estudiantes

---

## Arquitectura del proyecto

Se utilizó arquitectura por capas (equivalente a MVC):

- controller → Manejo de endpoints REST
- service → Lógica de negocio
- repository → Persistencia en memoria
- model → Entidad Estudiante

---

## Estrategia de Git utilizada

Se aplicó Trunk-Based Development:

- Rama principal: main
- Desarrollo realizado en ramas feature/*
- Integración de cambios mediante Pull Requests
- No se realizaron pushes directos a main

Esto simula un flujo profesional de GitOps.

---

## Pipeline de Integración Continua (CI)

Se configuró GitHub Actions para:

- Compilar el proyecto automáticamente
- Ejecutar el build en cada Push y Pull Request
- Verificar que el proyecto funcione en un entorno limpio
- Generar automáticamente un GitHub Release al hacer merge a main

Archivo del workflow:

.github/workflows/ci.yml

---

## Autor

Sebastian Orcasita  
000531950
Ingeniería de Sistemas
