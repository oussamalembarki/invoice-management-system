# Invoice Management System

A full-stack invoice management application demonstrating seamless integration between a Java Spring Boot backend, Angular frontend, and H2 in-memory database.

## Project Overview

This system enables users to:
- View a list of all invoices
- Create new test invoices
- Delete existing invoices

Data persists in an H2 in-memory database throughout the backend server's runtime.

## Tech Stack

| Layer | Technology |
|-------|------------|
| **Frontend** | Angular 19 (TypeScript, CSS, HTML) |
| **Backend** | Spring Boot (Java, Maven) |
| **Database** | H2 In-Memory Database |
| **API** | REST API with JSON |

## Architecture & Features

### Backend (Spring Boot)

- **Entities**: `Invoice` and `InvoiceItem` objects mapped to database tables
- **Repositories**: Spring Data JPA for automatic SQL query generation
- **Controllers**: REST endpoints at `/api/invoices` supporting:
  - `GET` - Retrieve all invoices
  - `POST` - Create new invoice
  - `DELETE` - Remove invoice by ID
- **CORS Configuration**: Enabled for Angular frontend (port 4200) to communicate with backend (port 8080)

### Frontend (Angular)

- **Services**: `InvoiceService` using `HttpClient` for API communication
- **Components**: `InvoiceListComponent` with card-based UI design
- **Reactive Updates**: Real-time list refresh after create/delete operations

## Project Structure
```
invoice-app/
├── invoice-app/         # Java Spring Boot Backend
│   ├── src/
│   ├── pom.xml
│   └── mvnw.cmd
└── invoice-frontend/    # Angular Frontend
    ├── src/
    ├── package.json
    └── angular.json
```

## How to Run Locally

### Prerequisites

- Java JDK 17 or higher
- Node.js & Angular CLI
- Maven

### Step 1: Start the Backend
```powershell
cd invoice-app
.\mvnw.cmd spring-boot:run
```

The API will be available at `http://localhost:8080`

### Step 2: Start the Frontend
```powershell
cd invoice-frontend
ng serve
```

Open your browser to `http://localhost:4200`

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/invoices` | Retrieve all invoices |
| POST | `/api/invoices` | Create a new invoice |
| DELETE | `/api/invoices/{id}` | Delete an invoice by ID |

## Learning Outcomes

Through this project, I gained hands-on experience with:
- Building RESTful APIs with Spring Boot
- Implementing frontend-backend communication via HTTP
- Managing database relationships with JPA
- Creating responsive Angular components
- Handling CORS in full-stack applications

## Notes

- The H2 database runs in-memory, so data is lost when the backend stops
- CORS is configured for development; adjust for production deployments
- Default ports: Backend (8080), Frontend (4200)

## Future Enhancements

- Add authentication and authorization
- Implement invoice editing functionality
- Integrate persistent database (PostgreSQL/MySQL)
- Add invoice PDF export feature
- Implement pagination for large datasets

---

**Developed to understand full-stack Java-Angular integration**