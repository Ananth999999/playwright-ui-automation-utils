# Playwright UI Automation with Java-Based Test Utilities

This project demonstrates a practical approach to UI test automation using **Playwright (JavaScript)** combined with lightweight **Java helper utilities** for test data validation.  
The goal of the project is to simulate how automated testing and supporting validation scripts can work together to improve reliability, repeatability, and early defect detection.

Rather than building a complex framework, the project focuses on clear, maintainable test logic, reusable validation methods, and simple debugging mechanisms that reflect common testing workflows used in real engineering environments.

---

## Project Objectives

- Automate critical UI workflows using Playwright
- Validate application behavior through assertions and navigation checks
- Introduce basic Java utilities for test data validation
- Improve debugging through readable diagnostics and failure artifacts
- Emphasize repeatability and stability of automated tests

---

## Functional Overview

The Playwright test suite automates a sample authentication workflow against a public demo application (**SauceDemo**).  
The automated test performs:

- Page navigation
- Form input interactions
- User action simulation (login)
- URL and state verification using assertions

The Java utility complements UI automation by performing simple validation checks on structured inputs.  
This mirrors real-world scenarios where test data integrity must be verified before execution.

---

## Key Features

- UI test automation using Playwright (JavaScript)
- Assertions for workflow and navigation validation
- Structured and readable test logic
- Java-based helper utility for input validation
- Diagnostic console outputs for verification results
- Separation of test logic and utility logic

---

## Tech Stack

- **Playwright (@playwright/test)** – UI automation & assertions  
- **JavaScript (Node.js runtime)** – Test implementation  
- **Java (JDK)** – Validation helper utility  
- **Git / GitHub** – Version control & project hosting  

---

## Test Automation Scope

The Playwright tests focus on validating core UI behaviors:

- Authentication flow verification
- Element interaction reliability
- Navigation correctness
- Basic functional checks

The tests intentionally avoid unnecessary complexity and emphasize:

- Deterministic behavior
- Clear assertions
- Simple maintainability

---

## Java Utility Scope

The Java component provides basic validation helpers:

- Required-field checks
- Empty/null detection
- Diagnostic PASS/FAIL outputs

This reflects typical lightweight scripting or utility usage often found in QA / test engineering workflows.

---

## How to Run Playwright Tests

Ensure Node.js and Playwright dependencies are installed:

npm install  
npx playwright test

---

## How to Run Java Utility

Compile and execute the Java helper:

javac utils/TestDataValidator.java  
java -cp utils TestDataValidator

---

## Design Considerations

This project intentionally prioritizes:

- Simplicity over framework complexity
- Readability over abstraction layers
- Practical validation logic
- Easy reproducibility

The structure is designed to be easily understandable in interview discussions and technical reviews.

---

## Learning Focus

Through this project, the following concepts are reinforced:

- UI automation fundamentals
- Assertion-based validation
- Separation of concerns (tests vs utilities)
- Basic scripting utilities
- Debugging & diagnostics mindset

---

## Repository Structure

playwright-ui-automation-utils/  
 ├── tests/  
 │    └── login.spec.js  
 ├── utils/  
 │    └── TestDataValidator.java  
 ├── package.json  
 ├── package-lock.json  
 ├── .gitignore  
 └── README.md  

---

## Notes

This repository is intended for demonstration and learning purposes, emphasizing realistic entry-level automation practices rather than production-grade frameworks.
