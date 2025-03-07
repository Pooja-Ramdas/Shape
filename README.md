# Shape

# Shape Calculator

## Description
This Java program calculates the **Area**, **Perimeter**, and **Volume** of various shapes using an **abstract class (Shape)**. It follows an **object-oriented approach** with separate Java files for each shape.

## Features
- Supports **Circle, Rectangle, Square, Sphere, Cylinder, and Equilateral Pyramid**.
- Uses **menu-driven** input for user convenience.
- Provides **Area and Perimeter** for all shapes.
- Calculates **Volume** for 3D shapes (Sphere, Cylinder, Pyramid).

---

## List of Variables

| Variable Name | Data Type | Use |
|--------------|----------|-----|
| `dim_one` | `double` | Stores first dimension (e.g., radius, length) |
| `dim_two` | `double` | Stores second dimension (e.g., width, height) |
| `dim_three` | `double` | Not used in current implementation |
| `num_sides` | `int` | Stores number of sides of the shape |

---

## List of Functions

| Function Name | Return Type | Use |
|--------------|------------|-----|
| `calculateArea()` | `double` | Computes area of the shape |
| `calculatePerimeter()` | `double` | Computes perimeter of the shape |
| `calculateVolume()` | `double` | Computes volume (for 3D shapes) |
| `getNumSides()` | `int` | Returns the number of sides of the shape |

---

## How to Run
1. **Compile all Java files**:  
   ```sh
   javac *.java
