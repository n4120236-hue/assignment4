1. SOLID Implementation

Single Responsibility Principle (SRP): Each class has one reason to change. For example, MembershipRepositoryImpl handles only database persistence, while MembershipController manages user interaction.




Open-Closed Principle (OCP): The system is open for extension but closed for modification. We can add new membership types (e.g., YogaMembership) by extending BaseEntity without changing the existing service or repository logic.


Liskov Substitution Principle (LSP): Subclasses like PremiumMembership and BasicMembership can replace the BaseEntity type without breaking the application's functionality.


Interface Segregation Principle (ISP): Instead of one large interface, we use specific ones like Validatable and Searchable to ensure classes only implement the methods they actually need.


Dependency Inversion Principle (DIP): High-level modules (Service) do not depend on low-level modules (Repository Implementation). Both depend on abstractions (CrudRepository interface), and dependencies are injected via constructors.


2. Advanced OOP Features

Generics: Used in the CrudRepository<T> interface to allow the repository to handle any entity type consistently.


Lambdas: Implemented in SortingUtils to provide a concise way to sort membership lists by name or price using Comparator.



Reflection (RTTI): The ReflectionUtils class uses runtime inspection to extract class names, fields, and methods for debugging and logging purposes.


Interfaces: Validatable includes a static method for null checks and a default method to print validation results.


3. Database Schema

The system uses a PostgreSQL database with the following structure:

Gyms Table: Stores location data.

Memberships Table: Stores client data with a Foreign Key (gym_id) linking to the Gyms table.
