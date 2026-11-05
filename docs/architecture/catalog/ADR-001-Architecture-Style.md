# ADR-001: Use Simple Layered Architecture for Catalog Bounded Context

## Context
The Catalog bounded context is responsible for product management
(CRUD operations on products: name, description, price, attributes, etc.).

In our strategic DDD analysis we classified **Catalog Management**
as a **Supporting Subdomain**.

Supporting subdomains:
- Are necessary for the business to function
- Do not provide significant competitive advantage
- Usually have relatively simple business rules

## Decision
We will implement the Catalog bounded context using a **simple layered architecture**
instead of full Clean Architecture + rich DDD tactical patterns.

Layers:
- API / Controllers
- Application Services
- Domain (entities + repositories interfaces)
- Infrastructure 

We will **not** introduce:
- Complex aggregate design
- Domain events (unless strictly needed later)
- Strict dependency inversion across many abstractions
- Full hexagonal / ports-and-adapters structure