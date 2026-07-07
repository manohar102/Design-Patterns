# Creational Design Patterns

Creational design patterns deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. The basic form of object creation could result in design problems or added complexity to the design. Creational design patterns solve this problem by controlling this object creation.

---

## 🛠️ Included Patterns

### 1. [Factory Method](./Factory%20Method/FactoryMethod)
* **Intent:** Defines an interface for creating an object, but lets subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.
* **Real-World Billing Use-case:** Generating payment transactions. A billing platform might support multiple payment methods (Credit Card, Bank Transfer, PayPal). A `TransactionCreator` defines `createTransaction()`, and subclass creators like `CcTransactionCreator` and `PaypalTransactionCreator` instantiate their respective transaction models.
* **Key Classes:**
  - `Transport` (Product Interface)
  - `Truck`, `Boat` (Concrete Products)
  - `TransportFactory` (Creator)

```mermaid
classDiagram
    class Transport {
        <<interface>>
        +deliver() void
    }
    class Truck {
        +deliver() void
    }
    class Boat {
        +deliver() void
    }
    class TransportFactory {
        +createTransport(type: String) Transport
    }

    Transport <|.. Truck
    Transport <|.. Boat
    TransportFactory ..> Transport : creates
```

---

### 2. [Abstract Factory](./Abstract%20Factory/AbstactFactory)
* **Intent:** Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
* **Real-World Billing Use-case:** Supplying region-specific formatting engines (currency formatters, date formats, address layouts) for invoices. A `UsFormatFactory` creates a US currency formatter and a US address layout, while a `EuFormatFactory` creates Euro formatters and European address layouts.
* **Key Classes:**
  - `FurnitutureFactory` (Abstract Factory)
  - `ModernFurnitureFactory`, `VictorialFunitureFactory` (Concrete Factories)
  - `Chair`, `Sofa` (Abstract Products)
  - `ModernChair`, `VictorialChair` (Concrete Products)

```mermaid
classDiagram
    class FurnitutureFactory {
        <<interface>>
        +createChair() Chair
        +createSofa() Sofa
    }
    class ModernFurnitureFactory {
        +createChair() Chair
        +createSofa() Sofa
    }
    class VictorialFunitureFactory {
        +createChair() Chair
        +createSofa() Sofa
    }
    class Chair {
        <<interface>>
        +sitOn() void
    }
    class Sofa {
        <<interface>>
        +lieOn() void
    }
    class ModernChair {
        +sitOn() void
    }
    class VictorialChair {
        +sitOn() void
    }
    class ModeranSOfa {
        +lieOn() void
    }
    class VictorialSofa {
        +lieOn() void
    }
    class FactoryProducer {
        +getFactory(type: String) FurnitutureFactory
    }

    FurnitutureFactory <|.. ModernFurnitureFactory
    FurnitutureFactory <|.. VictorialFunitureFactory
    Chair <|.. ModernChair
    Chair <|.. VictorialChair
    Sofa <|.. ModeranSOfa
    Sofa <|.. VictorialSofa
    ModernFurnitureFactory ..> ModernChair : creates
    ModernFurnitureFactory ..> ModeranSOfa : creates
    VictorialFunitureFactory ..> VictorialChair : creates
    VictorialFunitureFactory ..> VictorialSofa : creates
    FactoryProducer ..> FurnitutureFactory : produces
```

---

### 3. [Builder](./Builder%20Pattern/BuilderPattern)
* **Intent:** Separates the construction of a complex object from its representation so that the same construction process can create different representations.
* **Real-World Billing Use-case:** Constructing a complex `Invoice` object. An invoice has mandatory fields (invoice ID, customer details, date) and multiple optional fields (discounts, tax breakdowns, purchase order numbers, line items). A builder ensures the `Invoice` is immutable once constructed and avoids "telescoping constructor" anti-patterns.
* **Key Classes:**
  - `House` (Product)
  - `HouseBuilder` (Builder)

```mermaid
classDiagram
    class House {
        -walls: int
        -doors: int
        -windows: int
        -hasGarage: boolean
        -hasSwimPool: boolean
        -hasGarden: boolean
        +toString() String
    }
    class HouseBuilder {
        -house: House
        +setWalls(walls: int) HouseBuilder
        +setDoors(doors: int) HouseBuilder
        +setWindows(windows: int) HouseBuilder
        +setGarage(hasGarage: boolean) HouseBuilder
        +setSwimPool(hasSwimPool: boolean) HouseBuilder
        +setGarden(hasGarden: boolean) HouseBuilder
        +build() House
    }

    HouseBuilder ..> House : builds
```

---

### 4. [Prototype](./Prototype%20Pattern/PrototypePattern)
* **Intent:** Specifies the kinds of objects to create using a prototypical instance, and creates new objects by copying this prototype.
* **Real-World Billing Use-case:** Copying standard subscription plans or invoice templates. Rather than fetching pricing rules, tax parameters, and terms from the database every time a client subscribes to a standard "Enterprise Plan", a pre-constructed prototype is cloned and customized with the specific customer's details.
* **Key Classes:**
  - `Shape` (Prototype class implementing `Cloneable`)
  - `Circle`, `Rectangle` (Concrete Prototypes)
  - `ShapeCache` (Registry to store and retrieve prototypes)

```mermaid
classDiagram
    class Shape {
        <<abstract>>
        -id: int
        -color: String
        +clone() Object
        +getId() int
        +setId(id: int) void
        +getColor() String
        +setColor(color: String) void
        +draw() void
    }
    class Circle {
        +draw() void
    }
    class Rectangle {
        +draw() void
    }
    class ShapeCache {
        -shapeMap: Hashtable~Integer, Shape~
        +getShape(shapeId: int) Shape
        +loadCache() void
    }

    Shape <|-- Circle
    Shape <|-- Rectangle
    ShapeCache ..> Shape : clones from registry
```

---

### 5. [Singleton](./Singleton%20Design/SingletonDesign)
* **Intent:** Ensures a class has only one instance, and provides a global point of access to it.
* **Real-World Billing Use-case:** Globally coordinating thread-safe configurations (such as standard tax rates, exchange rate caches, or connection pools to the billing database).
* **Key Classes:**
  - `Index` (Eager/Classic Singleton)
  - `SynchronizedIndex` (Thread-safe Lazy Singleton)
  - `EnumIndex` (Enum-based Singleton - *highly recommended for production Java due to built-in serialization and thread safety*)

```mermaid
classDiagram
    class Index {
        -instance: Index
        -Index()
        +getInstance() Index
        +doSomething() void
    }
    class SynchronizedIndex {
        -instance: SynchronizedIndex
        -SynchronizedIndex()
        +getInstance() SynchronizedIndex
        +doSomething() void
    }
    class EnumIndex {
        <<enumeration>>
        INSTANCE
        +doSomething() void
    }

    note for Index "Eager initialization; instance created at class loading time"
    note for SynchronizedIndex "Lazy and synchronized; thread-safe on-demand creation"
    note for EnumIndex "Recommended: JVM guarantees singularity and serialization safety"
```

---

## 🎯 Creational Design Patterns Summary

| Pattern | Focus | Construction | Coupling |
| :--- | :--- | :--- | :--- |
| **Factory Method** | Single Object | Defer to Subclass | Low (interfaces only) |
| **Abstract Factory** | Families of Objects | Factory Composition | Low (abstract factories) |
| **Builder** | Complex Steps | Director / Step-by-Step | Medium (complex assemblies) |
| **Prototype** | Cloning state | Binary clone / copy | Low (needs prototype registry) |
| **Singleton** | Single instance | Static Access / Enum | High (global access point) |
