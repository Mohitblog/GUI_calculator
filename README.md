# Java Swing Calculator

A simple desktop calculator built with **Java Swing**. Enter two numbers and use the buttons to add, subtract, multiply or divide them.

## Features

- Four operations: **Add, Subtract, Multiply and Divide**
- Two input fields, with a separate result label next to each operation button
- Division returns a decimal result
- Friendly messages for invalid input and for division by zero
- Clean grid layout that is easy to use
- The program closes when the window is closed

## Tech stack

Java · Swing · AWT (layout)

## Getting started

### Prerequisites

- JDK 8 or later

### Run

```bash
javac GUI_2.java
java GUI_2
```

### How to use

1. Type a whole number in **Enter first number**.
2. Type a whole number in **Enter second number**.
3. Click **Add**, **SUB**, **MUL** or **DIV** to see the result next to that button.

## Project structure

```
GUI_calculator/
├── GUI_2.java   # Calculator window and button handlers
└── README.md
```

## Roadmap

- [x] Handle invalid input and division by zero with friendly messages
- [x] Close the program when the window is closed
- [ ] Accept decimal numbers
- [ ] Rename the class `GUI_2` to something descriptive, such as `Calculator`

## Author

**Mohit Upadhyay** · [LinkedIn](https://www.linkedin.com/in/mohit-upadhyay-895529430) · [GitHub](https://github.com/Mohitblog)
