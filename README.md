# E-commerce Order Management System

Distributed microservices-based system for processing orders.

Built with:
- Domain-Driven Design (DDD)
- Clean Architecture
- CQRS
- Event-Driven Architecture
- Saga Pattern (Distributed Transactions)

## Problem

In high-load e-commerce systems, order processing must handle:
- high concurrency
- distributed consistency
- integration with payment, inventory, and delivery services

This project demonstrates how to design such a system using modern architectural patterns.

# Architectural Decisions

### Why CQRS?
To separate read and write workloads and allow independent scaling.

### Why Event-Driven Architecture?
To decouple services and improve resilience.

### Why Saga Pattern?
To handle distributed transactions without using 2PC.

## Domain Model

### Bounded Contexts

- Order Context
- Payment Context
- Inventory Context
- Shipment Context

## Tech Stack

- Java + Spring Boot
- Apache Kafka (event streaming)
- PostgreSQL (per service database)
- Docker / Docker Compose