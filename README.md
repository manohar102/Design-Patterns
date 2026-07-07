# Design Patterns in Java

A robust, production-grade implementation of all **23 classic Gang of Four (GoF) software design patterns** in Java, adhering strictly to **SOLID principles**, clean code standards, and scalable architectures. 

This repository serves as a reference catalog for design pattern implementations, laying the foundation for building enterprise-level systems (such as high-throughput billing software) where extensibility, testability, and performance are critical.

---

## 📂 Repository Structure

The project is managed as a single **Gradle Multi-Project Build** with the following nested directory structure:

```text
Design Patterns/
├── build.gradle                     # Core Gradle configuration for all subprojects
├── settings.gradle                  # Subproject directory mappings
│
├── 📂 Creational Patterns/          # Object creation mechanisms
│   ├── 📂 Abstract Factory/         # Creates families of related objects
│   ├── 📂 Builder Pattern/          # Constructs complex objects step-by-step
│   ├── 📂 Factory Method/           # Delegates instantiation to subclasses
│   ├── 📂 Prototype Pattern/        # Creates new objects by copying existing ones
│   └── 📂 Singleton Design/         # Ensures a class has only one instance
│
├── 📂 Structural Patterns/          # Class and object composition
│   ├── 📂 Adapter/                  # Adapts incompatible interfaces
│   ├── 📂 Bridge/                   # Decouples abstraction from implementation
│   ├── 📂 Composite/                # Uniformly treats single and composite objects
│   ├── 📂 Decorator/                # Adds behavior dynamically (wrapper)
│   ├── 📂 Facade/                   # Provides a unified simple entry subsystem interface
│   ├── 📂 Flyweight/                # Minimizes memory by sharing immutable state
│   └── 📂 Proxy/                    # Controls access to underlying resource placeholders
│
└── 📂 Behavioral Patterns/          # Object communication and responsibilities
    ├── 📂 Chain of Responsibility/  # Routes requests through a chain of handlers
    ├── 📂 Command/                  # Encapsulates a request as an object with undo support
    ├── 📂 Interpreter/              # Evaluates language syntax/expression ASTs
    ├── 📂 Iterator/                 # Uniformly traverses collections
    ├── 📂 Mediator/                 # Centralizes complex colleague communications
    ├── 📂 Memento/                  # Captures and restores state snapshots
    ├── 📂 Observer/                 # One-to-many state change push notifications
    ├── 📂 State/                    # Alternates object behavior based on state changes
    ├── 📂 Strategy/                 # Swaps interchangeable algorithms dynamically
    ├── 📂 Template Method/          # Defines algorithm skeleton deferring steps
    └── 📂 Visitor/                  # Separates operations from structural elements
```

---

## 🛠️ Implemented Patterns

### 🔹 Creational Patterns

| Pattern | Description | Key Billing/Enterprise Use-case | Status |
| :--- | :--- | :--- | :--- |
| **[Abstract Factory](./Creational%20Patterns/Abstract%20Factory/AbstactFactory)** | Creates families of related or dependent objects without specifying their concrete classes. | Multi-gateway payment processors (e.g., Stripe vs. PayPal sets). | Production-ready |
| **[Builder](./Creational%20Patterns/Builder%20Pattern/BuilderPattern)** | Separates the construction of a complex object from its representation. | Constructing immutable `Invoice` or `BillingStatement` objects. | Production-ready |
| **[Factory Method](./Creational%20Patterns/Factory%20Method/FactoryMethod)** | Defines an interface for creating an object, but lets subclasses decide which class to instantiate. | Instantiating different `TaxCalculator` engines based on region. | Production-ready |
| **[Prototype](./Creational%20Patterns/Prototype%20Pattern/PrototypePattern)** | Creates new objects by copying an existing prototypical instance. | Cloning pre-configured billing plans or pricing templates. | Production-ready |
| **[Singleton](./Creational%20Patterns/Singleton%20Design/SingletonDesign)** | Ensures a class has only one instance and provides a global point of access. | Thread-safe connection pools or dynamic cache configurations. | Production-ready |

### 🔹 Structural Patterns

| Pattern | Description | Key Billing/Enterprise Use-case | Status |
| :--- | :--- | :--- | :--- |
| **[Adapter](./Structural%20Patterns/Adapter/AdapterPattern)** | Converts the interface of a class into another interface clients expect. | Integrating third-party accounting ledger APIs. | Production-ready |
| **[Bridge](./Structural%20Patterns/Bridge/BridgePattern)** | Decouples an abstraction from its implementation. | Exporting invoices into separate formats (PDF/CSV/XML). | Production-ready |
| **[Composite](./Structural%20Patterns/Composite/CompositePattern)** | Composes objects into tree structures representing part-whole hierarchies. | Hierarchical product packages and multi-item invoices. | Production-ready |
| **[Decorator](./Structural%20Patterns/Decorator/DecoratorPattern)** | Attaches additional responsibilities to an object dynamically. | Applying add-ons (taxes, late fees, shipping costs) on invoices. | Production-ready |
| **[Facade](./Structural%20Patterns/Facade/FacadePattern)** | Provides a unified interface to a complex set of subsystem interfaces. | Unified backend controller executing monthly billing calculations. | Production-ready |
| **[Flyweight](./Structural%20Patterns/Flyweight/FlyweightPattern)** | Shares fine-grained identical objects to optimize memory. | Processing millions of transaction log records containing static currencies. | Production-ready |
| **[Proxy](./Structural%20Patterns/Proxy/ProxyPattern)** | Controls access to another object (placeholder/surrogate). | Lazy loading audit reports or verifying user access roles. | Production-ready |

### 🔹 Behavioral Patterns

| Pattern | Description | Key Billing/Enterprise Use-case | Status |
| :--- | :--- | :--- | :--- |
| **[Chain of Responsibility](./Behavioral%20Patterns/Chain%20of%20Responsibility/ChainOfResponsibilityPattern)** | Routes requests along a chain of handlers. | Expense invoice approval pipeline (Manager -> Director -> CEO). | Production-ready |
| **[Command](./Behavioral%20Patterns/Command/CommandPattern)** | Encapsulates a request as an object, supporting queueing and undo. | Transaction logging and transactional rollback recovery. | Production-ready |
| **[Interpreter](./Behavioral%20Patterns/Interpreter/InterpreterPattern)** | Evaluates expressions or rule grammars. | Parsing dynamic billing formulas or user-defined discount rules. | Production-ready |
| **[Iterator](./Behavioral%20Patterns/Iterator/IteratorPattern)** | Accesses collection elements sequentially without exposing layout. | Traversing invoice structures regardless of underlying list type. | Production-ready |
| **[Mediator](./Behavioral%20Patterns/Mediator/MediatorPattern)** | Centralizes communications between colleague objects. | Decoupling controllers like charging, ledger, and notification systems. | Production-ready |
| **[Memento](./Behavioral%20Patterns/Memento/MementoPattern)** | Captures and restores object state checkpoints. | Saving and reverting user draft changes on active invoices. | Production-ready |
| **[Observer](./Behavioral%20Patterns/Observer/ObserverPattern)** | Broadcasts push events to registered observers. | Notifying accounting, email, and inventory systems when paid. | Production-ready |
| **[State](./Behavioral%20Patterns/State/StatePattern)** | Alters object behavior when internal state changes. | Managing invoice states (Draft, Sent, Paid, Void, Refunded). | Production-ready |
| **[Strategy](./Behavioral%20Patterns/Strategy/StrategyPattern)** | Encapsulates family of interchangeable algorithms. | Swapping payment gateways (Credit Card, PayPal, Crypto) on checkout. | Production-ready |
| **[Template Method](./Behavioral%20Patterns/Template%20Method/TemplateMethodPattern)** | Defines algorithm workflow skeleton, deferring steps. | Data report parsing pipelines (CSV vs. JSON) with audit hooks. | Production-ready |
| **[Visitor](./Behavioral%20Patterns/Visitor/VisitorPattern)** | Adds new operations on elements without modifying their classes. | Applying dynamic discount and tax calculations on items. | Production-ready |

---

## 🚀 Setup & Build Instructions

The repository is built and run using **Gradle**. 

### Prerequisites
* **Java Development Kit (JDK)**: Version 17 or higher
* **Gradle**: Installed on system (or running inside standard IDE integrations)

### Compile and Build
To compile all design pattern subprojects in the repository:
```bash
gradle build
```

### Run a Pattern
Each design pattern is defined as a standard Gradle subproject. To execute a specific pattern from the root directory, run:
```bash
gradle :[SubprojectName]:run
```

**Examples:**
* To run the **Singleton** pattern:
  ```bash
  gradle :SingletonDesign:run
  ```
* To run the **Decorator** pattern:
  ```bash
  gradle :DecoratorPattern:run
  ```
* To run the **Strategy** pattern:
  ```bash
  gradle :StrategyPattern:run
  ```

---

## 🎯 Architecture & Clean Code Guidelines

To ensure the repository maintains industry-standard quality:
1. **SOLID Principles**:
   - **Single Responsibility (SRP)**: Each class has one reason to change.
   - **Open/Closed (OCP)**: Entities are open for extension, closed for modification.
   - **Liskov Substitution (LSP)**: Subtypes are substitutable for their base types.
   - **Interface Segregation (ISP)**: Clients do not depend on methods they do not use.
   - **Dependency Inversion (DIP)**: Depend on abstractions, not concretions.
2. **Robustness**: Implement proper exception handling, thread safety (especially in Singleton patterns), and resource management.
3. **Gradle Best Practices**: Configure all compiler plugins, resource sets, and entry configurations centrally in the root build script.
