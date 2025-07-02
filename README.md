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

# StudentManagementSystem-OOPS


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


---- Student Details ----
Regular Student:
Name: Alice
Roll No: 101
Course: Computer Science
Fees: 25000.0
-------------------------
Distance Student:
Name: Bob
Roll No: 102
Course: Data Science
Fees: 15000.0
-------------------------
...
