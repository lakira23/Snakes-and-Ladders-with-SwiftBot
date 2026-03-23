# SwiftBot Snakes and Ladders 

## Overview

This project is a Java-based implementation of the classic Snakes and Ladders game, extended to integrate with a SwiftBot robot. Unlike a traditional digital-only version, this system combines software and hardware so that the robot physically represents game state by moving across a 5x5 board.

The project demonstrates object-oriented design, algorithmic thinking, hardware integration, and the challenges of working with real-world constraints such as calibration, drift, and synchronisation between logical and physical states.

---

## Features

* Turn-based Snakes and Ladders gameplay
* Randomised board generation with snakes and ladders
* Physical robot movement across a 5x5 grid
* Serpentine traversal logic for board navigation
* Hardware button input (A, B, X, Y) via SwiftBot
* LED feedback and robot movement control
* File logging system for game tracking
* Win condition detection and game state management
* Manual override mode for testing and debugging
* Calibration system to adjust for real-world movement inconsistencies

---

## Key Concepts Demonstrated

* Object-Oriented Programming (OOP)
* Modular system design
* State management and synchronisation
* Algorithm design for grid traversal
* Hardware-software integration
* Debugging and iterative development
* Handling uncertainty in real-world systems

---

## System Architecture

The project is structured into multiple components:

* **Players**: Represents users and the SwiftBot
* **Snakes and Ladders**: Handles board connectors and movement logic
* **Game Controller**: Manages turns, rules, and progression
* **Robot Controller**: Handles SwiftBot movement and calibration
* **Input Handler**: Processes hardware button inputs
* **Logger**: Records game events and outcomes

Each component is designed to be modular and maintainable, supporting separation of concerns.

---

## SwiftBot Integration

The SwiftBot acts as a physical representation of the player’s position on the board. Movement is handled through timed motor control rather than sensors, meaning:

* Position is tracked logically in software
* Physical movement is approximated using calibrated timing
* Direction changes are handled at row boundaries (serpentine pattern)
* Synchronisation is maintained between game state and robot state

### Challenges Addressed

* Lack of positional feedback
* Wheel drift and uneven motor power
* Surface friction affecting movement
* Battery level impacting performance
* Timing inconsistencies in hardware input

These were mitigated through calibration, iterative testing, and movement correction logic.

---

## Gameplay Flow

1. Game initialises and generates snakes and ladders
2. Players take turns rolling a dice
3. Player position is updated logically
4. SwiftBot moves to represent the new position physically
5. If landing on a snake or ladder, position is updated accordingly
6. Robot movement is triggered again to reflect changes
7. Game continues until a player reaches the final tile

---

## Input Controls

* Button A, B, X, Y used for user interaction
* Inputs are validated and processed through the system
* Manual override mode allows direct control of the robot for testing

---

## Logging

The system records gameplay data including:

* Player movements
* Dice rolls
* Snake and ladder interactions
* Timestamps of events

Logs are stored in files for debugging and evaluation purposes.

---

## Development Process

The project was developed iteratively using GitHub for version control. Key stages included:

* Initial implementation of core game logic
* Integration of SwiftBot movement
* Calibration and refinement of movement accuracy
* Debugging synchronisation issues between software and hardware
* Adding input handling and manual override features
* Continuous testing and system improvements

---

## Challenges

This project involved working with real-world hardware, which introduced several challenges:

* Movement drift due to motor inconsistency
* Environmental factors affecting performance
* Synchronisation between logical and physical game states
* Timing issues with hardware inputs
* Calibration requirements for reliable movement

These challenges required adaptive problem-solving and repeated refinement of both code and physical behaviour.

---

## Skills Developed

* Java programming
* Object-oriented design
* Algorithm implementation
* Hardware integration
* Debugging complex systems
* Working with real-world constraints
* Git and version control
* Iterative development and testing

---

## Future Improvements

* Enhanced movement correction algorithms
* Improved input handling reliability
* UI enhancements for better user experience
* Expanded logging and analytics features

---

## Summary

This project goes beyond a standard implementation of Snakes and Ladders by combining software engineering with robotics. It demonstrates the complexity of bridging digital logic with physical systems and highlights the importance of calibration, testing, and adaptability when working in real-world environments.

---
