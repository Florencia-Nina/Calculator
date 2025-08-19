

# Java Calculator Application
<img width="397" height="552" alt="Captura desde 2025-08-19 01-30-55" src="https://github.com/user-attachments/assets/94a62a63-0d34-48fa-b8d8-ba824f76229b" />

A simple yet functional calculator application built with Java Swing using Apache NetBeans 20 and JFrame Form.

## Features

- **Basic Operations**: 
  - Addition (+)
  - Subtraction (-) 
  - Multiplication (*)
  - Division (/)
- **Decimal Support**: Full floating-point number handling
- **Clear Functions**:
  - `AC` (All Clear): Clears the entire calculation
  - `DEL` (Delete): Removes the last entered digit
- **Intuitive UI**: Clean layout with number pad and operation buttons
- **Error Handling**: 
  - Division by zero validation
  - Invalid input handling

## Technical Specifications

- **Language**: Java SE
- **GUI Framework**: Swing (JFrame)
- **IDE**: Apache NetBeans 20
- **Project Structure**: MVC-like separation
  - `Calculator.java` for business logic
  - `CalculatorUI.java` for presentation

## Installation

### Prerequisites
- Java JDK 8+
- Apache NetBeans 20 (recommended)

### Running from NetBeans
1. Clone the repository:
   ```bash
   git clone https://github.com/Florencia-Nina/Calculator.git
   ```

2. Open in NetBeans:
   - File → Open Project → Select the Calculator folder

3. Configure main class:
   - Right-click the project → Properties
   - Select "Run" category
   - In "Main Class" field, enter: `calculator.CalculatorUI`
   - Click "OK"

4. Run the project:
   - Click the green "Run" button (or press F6)


### Running from Command Line

1. Compile:
   ```bash
   javac src/calculator/*.java
   ```
2. Run:
   ```bash
   java -cp src calculator.CalculatorUI
   ```

## Project Structure
```
Calculator/
├── src/
│   └── calculator/
│       ├── Calculator.java      # Business logic
│       └── CalculatorUI.java    # GUI implementation
├── build/                      # Compiled classes
└── README.md                   # Documentation
```

## Code Highlights

### Decimal Handling
```java
private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {
    String currentText = screen.getText();
    if (currentText.isEmpty()) {
        screen.setText("0.");
    } else if (!currentText.contains(".")) {
        screen.setText(currentText + ".");
    }
}
```

### Calculation Logic
```java
public float calculate() {
    switch(this.operator) {
        case "+": return firstNumber + secondNumber;
        case "-": return firstNumber - secondNumber;
        case "*": return firstNumber * secondNumber;
        case "/": 
            if(secondNumber != 0) return firstNumber / secondNumber;
            throw new ArithmeticException("Cannot divide by zero");
        default: throw new UnsupportedOperationException("Unsupported operation");
    }
}
```

## Contributing

Contributions are welcome! Please follow these steps:
1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [MIT License overview](https://opensource.org/licenses/MIT) for details.
---

## Developed with ❤️ using Java Swing in Apache NetBeans

---
