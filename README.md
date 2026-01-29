# OOPS Banner App

## Overview

The **OOPS Banner App** is a Java console-based learning project designed to demonstrate **Object-Oriented Programming (OOP) concepts** step by step. The application starts with a simple console print of the word **OOPS** and gradually evolves into rendering **OOPS as a banner** using spaces and `*` characters.

The project is structured into multiple **Use Cases (UCs)**, where each use case introduces better design, modularity, and stronger OOP practices.

---

## Learning Objectives

* Understand basic Java console output
* Learn structured programming using functions
* Apply core OOP concepts (classes, objects, encapsulation)
* Use Java Collections (`HashMap`)
* Practice clean code and incremental refactoring
* Learn Git and GitHub workflow

---

## Use Case Progression

### UC1 – Print OOPS

* Print `OOPS` directly using `System.out.println`
* Focus: Basic Java syntax

### UC2 – Banner Using Print Statements

* Display `OOPS` in banner format using `*` and spaces
* Focus: Formatting output

### UC3 – Banner Using Single Function

* Move banner printing logic into a single method
* Focus: Functions and reusability

### UC4 – Banner Using String Array and Loop

* Store each character pattern in a string array
* Render using loops for proper spacing and alignment
* Focus: Arrays and loops

### UC5 – Store Character Pattern in a Class

* Create a dedicated class to store banner character data
* Separate data from rendering logic
* Focus: Encapsulation

### UC6 – Render Banner Using Objects

* Use objects of character classes to print banner
* Focus: Object interaction

### UC7 – Modular Banner Rendering

* Centralized rendering logic
* Cleaner and reusable code structure
* Focus: Modular design

### UC8 – Advanced OOP with HashMap

* Store character patterns in a `HashMap<Character, String[]>`
* Dynamically render banner for any supported text
* Focus: Collections and scalability

---

## Project Structure

```
OOPSBannerApp/
├── src/
│   └── Main.java
├── .gitignore
└── README.md
```

---

## Technologies Used

* Java (JDK 8+)
* Git
* GitHub
* Eclipse / IntelliJ

---

## How to Run

1. Clone the repository

```bash
git clone <repository-url>
```

2. Navigate to the project directory

```bash
cd OOPSBannerApp
```

3. Compile and run

```bash
javac Main.java
java Main
```

---

## Git Workflow Followed

* `main` – stable code
* `dev` – active development
* `feature/OPPSBannerApp-UC*` – individual use cases

Sample commands:

```bash
git status
git add .
git commit -m "[Bharati] Added:UC4 - Render OOPS banner using string array and loops"
git push origin feature/OPPSBannerApp-UC4
```

---

## Key Concepts Covered

* Functions and methods
* Classes and objects
* Encapsulation
* Collections (`HashMap`)
* Looping and formatting
* Clean code practices
* Git branching strategy

---

## Author

**Bharati Patra**

---
