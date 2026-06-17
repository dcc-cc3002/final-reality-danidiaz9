# Final Reality

Final Reality is a simplified clone of the renowned game, Final Fantasy. Its main purpose is to
serve as an educational tool, teaching foundational programming concepts.

This README is yours to complete it. Take this opportunity to describe your contributions, the
design decisions you've made, and any other information you deem necessary.

This project is licensed under the
[Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/).

Context
-------

This project's goal is to create a (simplified) clone of _Final Fantasy_'s combat, a game developed
by [_Square Enix_](https://www.square-enix.com)
Broadly speaking for the combat the player has a group of gameunits to control and a group of
enemies controlled by the computer.

-------

# Homework 1

## Project Structure

- `Characters`: Contains character classes, including both player and enemy gameunits.
- `Weapons`: Contains classes representing different types of weapons.
- `Party`: Contains the class representing the character's party.
- `TurnScheduler`: Contains the TurnScheduler class.


## Features

### Characters

- **Player Characters**: These are gameunits controlled by the player. They can be either common or magic gameunits.
    - **Common Characters**: These include Ninjas, Paladins, and Warriors.
    - **Magic Characters**: These include Black Mages and White Mages.

- **Enemy Characters**: These are gameunits controlled by the computer.

### Weaponry

- **Common Weapons**: Weapons used by common gameunits, such as Axes, Bows, and Swords.
- **Magic Weapons**: Weapons used by magic gameunits, such as Staves and Wands.

### Party

The party represents a group of gameunits controlled by the player.

### Turn Scheduler

The Turn Scheduler manages the turn order of gameunits during combat by handling their action bars.