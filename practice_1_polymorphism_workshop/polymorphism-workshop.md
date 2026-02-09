# Polymorphism Laboratory Practice

## University Information

**University:** Universidad del Cauca

**Faculty:** Facultad de Ingeniería Electrónica y Telecomunicaciones

**Program:** Ingeniería de Sistemas

**Course:** Laboratorio de Ingeniería de Software II

**Practice:** Polymorphism

**Last update:** February 4, 2026

---

## Objectives

* Review and reinforce the concept of polymorphism in Object-Oriented Programming (OOP).
* Apply polymorphism through an abstract class hierarchy.
* Implement and execute unit tests to validate program behavior.
* Use a GitHub repository to manage and deliver source code.

---

## Description

Polymorphism is one of the four fundamental pillars of Object-Oriented Programming, along with **Abstraction**, **Encapsulation**, and **Inheritance**. The term *polymorphism* comes from Greek and means *"many forms"*. In OOP, it refers to the ability of different objects to respond differently to the same method call.

In this practice, polymorphism is demonstrated through a hierarchy of geometric figures. Each figure shares a common interface defined by an abstract parent class, but each implements its own behavior for calculating area and perimeter.

---

## Class Hierarchy Design

At the core of the design is an abstract class named `ClsFigure`, which defines the common behavior for all geometric figures:

* `opCalculateArea()`
* `opCalculatePerimeter()`

These methods are declared as abstract, forcing all subclasses to provide their own implementations.

### Implemented Classes

* **ClsCircle**: Represents a circle defined by a radius.
* **ClsSquare**: Represents a square defined by the length of one side.
* **ClsTriangle**: Represents a triangle, supporting area calculation using base and height, and perimeter calculation using three sides.

This structure ensures a consistent contract while allowing each figure to define its specific logic.

---

## Polymorphism in Action

Thanks to polymorphism, objects of different subclasses can be treated uniformly as instances of `ClsFigure`.

Example usage:

```java
ClsFigure fig1 = new ClsCircle(1.0);
ClsFigure fig2 = new ClsSquare(2.3);
ClsFigure fig3 = new ClsTriangle(4.2, 4.5);

List<ClsFigure> figures = new ArrayList<>();
figures.add(fig1);
figures.add(fig2);
figures.add(fig3);

for (ClsFigure fig : figures) {
    System.out.println("Area: " + fig.opCalculateArea());
    System.out.println("Perimeter: " + fig.opCalculatePerimeter());
}
```

Although all objects are referenced as `ClsFigure`, each one executes its own version of the methods, demonstrating runtime polymorphism.

---

## Unit Testing

To validate the correctness of the implementation, unit tests were written using **JUnit 5**. The tests verify:

* Correct area and perimeter calculations for each figure.
* Proper behavior when valid parameters are provided.
* Exception handling for invalid inputs, such as negative radius values.

### Example Test Scenarios

* Circle with a valid radius calculates correct area and perimeter.
* Square with a valid side length calculates correct area and perimeter.
* Triangle calculates area correctly using base and height.
* Triangle calculates perimeter correctly when all sides are defined.
* Circle throws an exception when a negative radius is provided.
* Square throws an exception when a negative side is provided.
* The triangle throws an exception when a base, height or negative side is provided.

Unit tests serve as executable documentation and provide confidence that the polymorphic behavior works as expected.

---

## Repository and Version Control

The complete project, including source code and unit tests, is stored in a GitHub repository. Git was used via command line to:

* Track changes in the codebase.
* Maintain a clean project history.
* Share the project with the instructor for evaluation.

Only the repository URL is submitted for grading, allowing the instructor to clone and review the project.

---

## Conclusions

This practice demonstrates how polymorphism allows different objects to share a common interface while exhibiting distinct behaviors. By using an abstract class, a clear contract is established for all subclasses, improving code consistency and extensibility.

Although polymorphism may not seem immediately useful at first, its value becomes evident when building flexible and scalable software systems. Many design patterns rely heavily on polymorphism to reduce coupling and improve maintainability.

As a complementary exercise, the same design could be implemented using interfaces instead of abstract classes to further explore advanced polymorphic concepts.

---

## References

* [https://jarroba.com/polimorfismo-en-java-parte-i-con-ejemplos/](https://jarroba.com/polimorfismo-en-java-parte-i-con-ejemplos/)
* Official Oracle Java Documentation
