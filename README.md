# 🚀 Build your first CRUD API - To-Do List

This is my first professional Backend CRUD API built during the FlyRank Backend Foundation program. I built this to master the request-response loop and handle data operations logic manually.

## 📌 Project Overview
This project manages a to-do list in-memory. It demonstrates the ability to Create, Read, Update, and Delete tasks while following strictly defined API specifications.

## 🛠️ Tech Stack
- **Language:** JavaScript (Node.js)
- **Framework:** Express.js
- **Middleware:** `express.json()` for parsing body data
- **Documentation:** Swagger UI (`swagger-ui-express`)

## 📋 Endpoints Logic
I have implemented the following logic for the API:

| Method | Endpoint | Description | Expected Status |
| :--- | :--- | :--- | :--- |
| **GET** | `/` | Describe API name and version | `200 OK` |
| **GET** | `/health` | Check if server is alive | `200 OK` |
| **GET** | `/task` | Returns list of all tasks | `200 OK` |
| **GET** | `/task/:id` | Returns a specific task by ID | `200` or `404` |
| **POST** | `/user-task` | Creates a new task | `201 Created` |
| **PUT** | `/modified-task/:id` | Replaces/updates a task | `200` or `404` |
| **DELETE** | `/task/:id` | Removes a task permanently | `204 Success` |

## 🏗️ Installation & Setup

Follow these steps to run the project on your local machine:

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Sakshi13-05/BackendFoundation.git

2. **Navigate to the correct folder:**
   ```bash
   cd BuildApi

3. **Install all necessary packages:**
   ```bash
   npm install express swagger-ui-express

4. **Start the API server**
   ```bash
   node server.js

## 🧪 Testing with curl (Proof of Logic)

To verify the endpoints, run these commands in your terminal:

1. **Create a task::**
   ```bash
   curl -i -X POST http://localhost:3000/user-task -H "Content-Type: application/json" -d "          {\"title\":\"Learn Backend Logic\"}"

2. **Update a task (Example task ID 2):**
   ```bash
   curl -i -X PUT http://localhost:3000/modified-task/2 -H "Content-Type: application/json" -d "{\"done\": true}"

3. **Delete a task::**
   ```bash
   curl -i -X DELETE http://localhost:3000/task/1
