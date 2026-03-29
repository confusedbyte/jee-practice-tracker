# jee-practice-tracker

## Description
A lightweight Java application designed to help students preparing for JEE Main and Advanced exams track and manage practice problems efficiently.

## Features
- **Add Problems**: Store JEE practice problems with title, topic, and difficulty level
- **Problem Filtering**: Filter problems by difficulty (Easy, Medium, Hard) or topic
- **Progress Tracking**: Mark problems as solved to track your progress
- **Data Persistence**: Save and load your problem list using serialization

## Project Structure
```
src/
├── JEEProblemTracker.java     # Main tracker class
├── Problem.java               # Problem model class
├── ProblemFilter.java         # Filtering utilities
└── DataPersistence.java       # Save/load functionality
```

## Usage
```java
JEEProblemTracker tracker = new JEEProblemTracker();
Problem problem = new Problem("Matrix Multiplication", "Matrices", "Hard");
tracker.addProblem(problem);
```

## Getting Started
1. Clone this repository
2. Compile all Java files: `javac src/*.java`
3. Run the main class: `java -cp src JEEProblemTracker`

## Requirements
- Java 8 or higher

## License
MIT License - Feel free to use and modify
