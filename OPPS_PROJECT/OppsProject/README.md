# 🎓 Student Management System – Java OOP Mini Project

A simple Java project demonstrating all **core OOP principles**:  
✅ Encapsulation • ✅ Inheritance • ✅ Polymorphism • ✅ Abstraction • ✅ Interfaces

---

## 📌 Features

- Displays student details (Name, Roll No, Course, Fees)
- Differentiates between Regular and Distance Students
- Implements abstraction using an abstract `Student` class
- Uses interface `Payable` to calculate fees
- Fully automated — no user input required

---

## 📁 Project Structure


---

## 🧠 OOP Concepts Covered

| Concept         | Used In                                                                 |
|----------------|--------------------------------------------------------------------------|
| **Encapsulation** | Private fields with public getters in `Student` class                   |
| **Inheritance**   | `RegularStudent` and `DistanceStudent` extend `Student`                |
| **Polymorphism**  | Overridden `displayDetails()` and `calculateFees()` methods            |
| **Abstraction**   | `Student` is an abstract class with abstract method                    |
| **Interfaces**    | `Payable` interface implemented by `Student` for fee calculation       |

---

## 💻 How to Run

1. Clone or download the repository.

2. Compile the Java files:

   ```bash
   javac *.java
