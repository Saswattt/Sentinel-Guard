🛡️ Sentinel Guard: Real-Time System Health Monitor
Sentinel Guard is a professional-grade dashboard designed to provide real-time visibility into distributed service health. It aggregates system logs, monitors uptime, and provides actionable insights for developers and SREs to maintain 100% system availability.

🚀 Key Features
Real-Time Monitoring: Automated polling of health logs via a dedicated HealthService.

Intelligent Filtering: Instantly filter logs by service name or status (Healthy, Warning, Critical).

System Health Heuristics: A smart "System Status" indicator that evaluates the most recent logs to determine overall stability.

Actionable Logs: Direct "Resolve" and "Delete" functionality to manage incident lifecycles.

Responsive UI: A clean, professional interface built with Angular and optimized for high-density data viewing.

🛠️ Technical Stack
Frontend: Angular (Standalone Components, RxJS for stream handling)

Styling: CSS3 / Bootstrap-Subtle (for clean status badging)

Backend: Java (API Services)

Database: Apache Derby (Persistent log storage)

Architecture: RESTful API integration with interval-based polling.

📂 Project Structure
Plaintext
Sentinel-Guard/
├── Frontend/           # Angular Application
│   ├── src/app/        # Core Logic
│   └── components/     # Standalone UI Components (Dashboard)
├── Backend/            # Java API Services
└── Docs/               # Technical Documentation
⚙️ Installation & Setup
Clone the Repository:

Bash
git clone https://github.com/YOUR_USERNAME/Sentinel-Guard.git
cd Sentinel-Guard/Frontend
Install Dependencies:

Bash
npm install
Run the Application:

Bash
ng serve
Navigate to http://localhost:4200/ to view the dashboard.

👤 Author
Saswat Kumar Sahoo Software Developer & Professional Scrum Master Specializing in Angular, Java, and Agile Project Management.

To create this file via terminal:
Run this command in your project folder to generate the file immediately:

Bash
cat <<EOF > README.md
# 🛡️ Sentinel Guard

**Sentinel Guard** is a professional-grade dashboard designed to provide real-time visibility into distributed service health.

### 🚀 Key Features
* **Real-Time Monitoring:** Automated polling of health logs.
* **Intelligent Filtering:** Filter by service name or status (Healthy, Warning, Critical).
* **System Health Heuristics:** Smart indicator for overall stability.

### 🛠️ Technical Stack
* **Frontend:** Angular (Standalone Components, RxJS)
* **Backend:** Java
* **Database:** Apache Derby

### ⚙️ Installation
1. \`npm install\`
2. \`ng serve\`

---
**Author: Saswat Kumar Sahoo**
EOF