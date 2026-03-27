# AI-Call-Sentiment-Analyzer

# AI Call Sentiment Analyzer

## 📌 Project Description

AI Call Sentiment Analyzer is a full-stack application that processes customer call recordings, analyzes sentiment (Positive/Negative), and visualizes insights through an interactive dashboard. The system enables businesses to monitor customer interactions and evaluate agent performance effectively.

---

## ⚙️ Tech Stack

### Backend

* Java (Spring Boot)
* Spring Security (JWT Authentication)
* Spring Data JPA
* MySQL Database

### Frontend

* React.js
* Bootstrap
* Recharts (for data visualization)

### Tools & Others

* Maven
* Postman
* Git & GitHub

---

## 🚀 Features

* 🔐 User Authentication (Login with JWT)
* 📤 Upload Call Audio (.wav files)
* 🤖 Sentiment Analysis (Positive / Negative classification)
* 📊 Dashboard with:

  * Pie Chart (Sentiment Distribution)
  * Bar Chart (Agent Performance)
* 🗄️ Data storage in MySQL
* 🔄 Real-time dashboard updates after upload

---

## 📷 Screenshots

### 🔑 Login Page

*Add screenshot here*

### 📊 Dashboard

*Add screenshot here*

### 📤 Upload Page

*Add screenshot here*

---

## ▶️ How to Run

### 1️⃣ Clone the Repository

```
git clone https://github.com/your-username/ai-call-sentiment-analyzer.git
cd ai-call-sentiment-analyzer
```

---

### 2️⃣ Backend Setup (Spring Boot)

```
cd backend
mvn clean install
mvn spring-boot:run
```

Backend runs at:

```
http://localhost:8080
```

---

### 3️⃣ Database Setup (MySQL)

* Create database:

```
CREATE DATABASE sentiment_db;
```

* Update `application.properties`:

```
spring.datasource.url=jdbc:mysql://localhost:3306/sentiment_db
spring.datasource.username=your_username
spring.datasource.password=your_password
```

---

### 4️⃣ Frontend Setup (React)

```
cd frontend
npm install
npm start
```

Frontend runs at:

```
http://localhost:3000
```

---

### 5️⃣ Usage

1. Login using credentials
2. Upload a call audio file (.wav)
3. View sentiment analytics on dashboard

---

## 🌟 Future Improvements

* 🎤 Real AI-based speech-to-text integration
* 🤖 Advanced ML sentiment model
* 📈 More analytics (average score, trends)
* ☁️ Cloud deployment (AWS / Azure)

---

## 👩‍💻 Author

Rutuja Mehare

---

## ⭐ If you like this project, give it a star on GitHub!
