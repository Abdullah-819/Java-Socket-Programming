This repository showcases practical implementations of **client-server architecture** using Java sockets. It covers both **connection-oriented (TCP)** and **connectionless (UDP)** communication models along with advanced use cases.

---

## ✨ Features

- 🔗 TCP Client-Server Communication
- 📡 UDP Datagram Communication
- 💬 Multi-Client Chat Server
- 📁 File Transfer System
- ⚡ Real-time Data Exchange
- 🧠 Clean and modular code structure

---

## 🗂️ Project Structure


Socket-Programming-Java/
│
├── TCP/
│ ├── TCPServer.java
│ └── TCPClient.java
│
├── UDP/
│ ├── UDPServer.java
│ └── UDPClient.java
│
├── ChatApp/
│ └── ChatServer.java
│
├── FileTransfer/
│ ├── FileServer.java
│ └── FileClient.java
│
└── README.md


---

## ⚙️ Technologies Used

- Java (Core)
- Java Networking (java.net package)
- I/O Streams (java.io)

---

## ▶️ How to Run

### 1. Compile

javac *.java


### 2. Run Server

java TCPServer


### 3. Run Client

java TCPClient


> ⚠️ Make sure server runs before client

---

## 🧪 Modules Explained

### 🔹 TCP Communication
Reliable connection-based communication using `Socket` and `ServerSocket`.

### 🔹 UDP Communication
Fast, connectionless communication using `DatagramSocket`.

### 🔹 Chat Server
Handles multiple clients using threads and broadcasts messages.

### 🔹 File Transfer
Transfers files between server and client using byte streams.

---

## 🎯 Learning Outcomes

- Understanding of socket programming fundamentals
- Implementation of client-server models
- Handling multiple clients with threads
- Data transmission over networks
- Practical networking in Java

---

## 📸 Future Enhancements

- GUI-based chat application (JavaFX/Swing)
- Secure communication (AES encryption)
- WebSocket integration
- REST API integration

---

## 🤝 Contributing

Contributions are welcome. Fork the repository and submit a pull request.

---

## 📄 License

This project is open-source and available under the MIT License.

---

## 👨‍💻 Author

**Abdullah Rana**

---

⭐ If you found this useful, consider giving it a star!
