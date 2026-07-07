# Structural Design Patterns

Structural design patterns explain how to assemble objects and classes into larger structures, while keeping these structures flexible and efficient. They focus on simplifying relationships between entities.

---

## 🛠️ Included Patterns

### 1. [Adapter](./Adapter/AdapterPattern)
* **Intent:** Converts the interface of a class into another interface clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
* **Real-World Billing Use-case:** Connecting to third-party payment gateways. Your system defines a standard `PaymentGateway` interface (with `charge()`, `refund()`). To use Stripe (which uses `StripeApi`) or PayPal (which uses `PaypalSdk`), you write `StripeAdapter` and `PaypalAdapter` classes mapping your interface to their SDK calls.
* **Key Classes:**
  - `MediaPlayer` (Target interface)
  - `AudioPlayer` (Client)
  - `AdvancedMediaPlayer` (Adaptee interface)
  - `Mp4MediaPlayer`, `VlcMediaPlayer` (Concrete Adaptees)
  - `AudioAdapter` (Adapter implementing Target and wrapping Adaptee)

```mermaid
classDiagram
    class MediaPlayer {
        <<interface>>
        +play(audioType: String, fileName: String) void
    }
    class AdvancedMediaPlayer {
        <<interface>>
        +playVlc(fileName: String) void
        +playMp4(fileName: String) void
    }
    class AudioPlayer {
        -mediaAdapter: AudioAdapter
        +play(audioType: String, fileName: String) void
    }
    class AudioAdapter {
        -advancedMusicPlayer: AdvancedMediaPlayer
        +play(audioType: String, fileName: String) void
    }
    class VlcMediaPlayer {
        +playVlc(fileName: String) void
        +playMp4(fileName: String) void
    }
    class Mp4MediaPlayer {
        +playVlc(fileName: String) void
        +playMp4(fileName: String) void
    }

    MediaPlayer <|.. AudioPlayer
    MediaPlayer <|.. AudioAdapter
    AdvancedMediaPlayer <|.. VlcMediaPlayer
    AdvancedMediaPlayer <|.. Mp4MediaPlayer
    AudioPlayer --> AudioAdapter : uses
    AudioAdapter --> AdvancedMediaPlayer : wraps
```

---

### 2. [Bridge](./Bridge/BridgePattern)
* **Intent:** Decouples an abstraction from its implementation so that the two can vary independently.
* **Real-World Billing Use-case:** Generating invoices in different layouts and export formats. The abstraction `InvoiceExporter` (e.g., `DetailedInvoiceExporter`, `SummaryInvoiceExporter`) delegates to an implementer interface `ExportFormat` (e.g., `PdfExportFormat`, `CsvExportFormat`, `XmlExportFormat`). You can add new layouts or new formats independently without creating M × N class combinations.
* **Key Classes:**
  - `Remote` (Abstraction)
  - `OldRemote`, `NewRemote` (Refined Abstractions)
  - `TV` (Implementer interface)
  - `Samsung`, `RealMe` (Concrete Implementers)

```mermaid
classDiagram
    class TV {
        <<interface>>
        +on() void
        +off() void
        +tuneChannel(channel: int) void
    }
    class Samsung {
        +on() void
        +off() void
        +tuneChannel(channel: int) void
    }
    class RealMe {
        +on() void
        +off() void
        +tuneChannel(channel: int) void
    }
    class Remote {
        <<abstract>>
        #tv: TV
        +Remote(tv: TV)
        +on() void
        +off() void
        +setChannel(channel: int) void
    }
    class OldRemote {
        +nextChannel() void
        +prevChannel() void
    }
    class NewRemote {
        +setChannel(channel: int) void
    }

    TV <|.. Samsung
    TV <|.. RealMe
    Remote <|-- OldRemote
    Remote <|-- NewRemote
    Remote o--> TV : implementer
```

---

### 3. [Composite](./Composite/CompositePattern)
* **Intent:** Composes objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.
* **Real-World Billing Use-case:** Modeling hierarchical product catalogs or composite invoices. For instance, a subscription invoice may consist of individual line items (e.g., base subscription fee) and composite items (e.g., standard bundle consisting of cloud storage, support fee, and API usage fees). The billing system calculates total cost by invoking `calculatePrice()` on the root nodes uniformly.
* **Key Classes:**
  - `MenuComponent` (Component interface)
  - `MenuItem` (Leaf node)
  - `Menu` (Composite node holding list of components)
  - `Waitress` (Client)

```mermaid
classDiagram
    class MenuComponent {
        <<abstract>>
        +getName() String
        +getDescription() String
        +getPrice() double
        +print() void
        +add(component: MenuComponent) void
        +remove(component: MenuComponent) void
    }
    class MenuItem {
        -name: String
        -description: String
        -price: double
        +getName() String
        +getDescription() String
        +getPrice() double
        +print() void
    }
    class Menu {
        -menuComponents: List~MenuComponent~
        -name: String
        -description: String
        +add(component: MenuComponent) void
        +remove(component: MenuComponent) void
        +print() void
    }
    class Waitress {
        -allMenus: MenuComponent
        +printMenu() void
    }

    MenuComponent <|-- MenuItem
    MenuComponent <|-- Menu
    Menu o--> MenuComponent : contains
    Waitress --> MenuComponent : uses
```

---

### 4. [Decorator](./Decorator/DecoratorPattern)
* **Intent:** Attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.
* **Real-World Billing Use-case:** Building a dynamic invoice billing decorator. A base invoice calculation can be dynamically decorated with `TaxDecorator`, `SeasonalDiscountDecorator`, `LateFeeDecorator`, or `CourierFeeDecorator`, adding costs or deductions transparently.
* **Key Classes:**
  - `Beverage` (Component interface)
  - `Espresso`, `HouseBlend` (Concrete Components)
  - `CondimentDecorator` (Decorator abstraction)
  - `Mocha`, `Whip` (Concrete Decorators)

```mermaid
classDiagram
    class Beverage {
        <<abstract>>
        -description: String
        +getDescription() String
        +cost() double
    }
    class Espresso {
        +cost() double
    }
    class HouseBlend {
        +cost() double
    }
    class CondimentDecorator {
        <<abstract>>
        #beverage: Beverage
        +getDescription() String
    }
    class Mocha {
        +getDescription() String
        +cost() double
    }
    class Whip {
        +getDescription() String
        +cost() double
    }

    Beverage <|-- Espresso
    Beverage <|-- HouseBlend
    Beverage <|-- CondimentDecorator
    CondimentDecorator <|-- Mocha
    CondimentDecorator <|-- Whip
    CondimentDecorator o--> Beverage : wraps
```

---

### 5. [Facade](./Facade/FacadePattern)
* **Intent:** Provides a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
* **Real-World Billing Use-case:** Organizing complex backend billing services. A client just calls `billingFacade.processMonthlyInvoice(customerId)`. Behind the scenes, the facade coordinates the `CustomerService`, `UsageTracker`, `TaxCalculator`, `InvoiceGenerator`, `PaymentGateway`, and `EmailNotificationService`.
* **Key Classes:**
  - `HomeTheaterFacade` (Facade class)
  - `Amplifier`, `DvdPlayer`, `Projector`, `Screen`, `TheaterLights` (Subsystem classes)

```mermaid
classDiagram
    class HomeTheaterFacade {
        -amp: Amplifier
        -dvd: DvdPlayer
        -projector: Projector
        -screen: Screen
        -lights: TheaterLights
        +watchMovie(movie: String) void
        +endMovie() void
    }
    class Amplifier {
        +on() void
        +off() void
        +setVolume(volume: int) void
    }
    class DvdPlayer {
        +on() void
        +off() void
        +play(movie: String) void
    }
    class Projector {
        +on() void
        +off() void
        +wideScreenMode() void
    }
    class Screen {
        +up() void
        +down() void
    }
    class TheaterLights {
        +on() void
        +dim(level: int) void
    }

    HomeTheaterFacade --> Amplifier : delegates
    HomeTheaterFacade --> DvdPlayer : delegates
    HomeTheaterFacade --> Projector : delegates
    HomeTheaterFacade --> Screen : delegates
    HomeTheaterFacade --> TheaterLights : delegates
```

---

### 6. [Flyweight](./Flyweight/FlyweightPattern)
* **Intent:** Shares objects to support large numbers of fine-grained objects efficiently.
* **Real-World Billing Use-case:** Minimizing memory footprint for millions of micro-transactions. If millions of billing records contain repetitive transaction codes, currencies (e.g., USD, EUR), and tax rules, these shared elements can be encapsulated into Flyweights, referencing them inside lightweight context objects.
* **Key Classes:**
  - `TreeType` (Shared flyweight intrinsic state)
  - `TreeFactory` (Flyweight Factory)
  - `Tree` (Unshared extrinsic context)
  - `Forest` (Client)

```mermaid
classDiagram
    class TreeType {
        -name: String
        -color: String
        -texture: String
        +draw(canvas: Graphics, x: int, y: int) void
    }
    class TreeFactory {
        -treeTypes: Map~String, TreeType~
        +getTreeType(name: String, color: String, texture: String) TreeType
    }
    class Tree {
        -x: int
        -y: int
        -type: TreeType
        +draw(canvas: Graphics) void
    }
    class Forest {
        -trees: List~Tree~
        +plantTree(x: int, y: int, name: String, color: String, texture: String) void
        +draw(canvas: Graphics) void
    }

    TreeFactory ..> TreeType : creates/caches
    Tree --> TreeType : references shared state
    Forest --> Tree : contains
    Forest ..> TreeFactory : uses
```

---

### 7. [Proxy](./Proxy/ProxyPattern)
* **Intent:** Provides a surrogate or placeholder for another object to control access to it.
* **Real-World Billing Use-case:** Access control or lazy loading on database entities. A `BillingReportProxy` might delay the generation of a heavy quarterly audit report (Virtual Proxy) or verify user roles before granting access to sensitive invoice data (Protection Proxy).
* **Key Classes:**
  - `Image` (Subject interface)
  - `RealImage` (Real Subject)
  - `ProxyImage` (Proxy)

```mermaid
classDiagram
    class Image {
        <<interface>>
        +display() void
    }
    class RealImage {
        -fileName: String
        +RealImage(fileName: String)
        -loadFromDisk(fileName: String) void
        +display() void
    }
    class ProxyImage {
        -realImage: RealImage
        -fileName: String
        +display() void
    }

    Image <|.. RealImage
    Image <|.. ProxyImage
    ProxyImage --> RealImage : lazy loads
```

---

## 🎯 Structural Design Patterns Summary

| Pattern | Purpose | Relationship |
| :--- | :--- | :--- |
| **Adapter** | Converts interface | Unites incompatible interfaces |
| **Bridge** | Decouples interface/implementation | Bridges separate hierarchies |
| **Composite** | Handles tree structure | Uniformly treats leaves and groups |
| **Decorator** | Adds behaviors dynamically | Wraps object to extend functionality |
| **Facade** | Simplifies complex system | Unified single point of entry |
| **Flyweight** | Optimizes memory | Shares identical intrinsic states |
| **Proxy** | Intercepts access | Controls reference to underlying object |
