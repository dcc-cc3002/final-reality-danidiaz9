# Final Reality

Final Reality is a simplified clone of the renowned game, Final Fantasy. Its main purpose is to serve as an educational tool, teaching foundational programming concepts.

This README is yours to complete it. Take this opportunity to describe your contributions, the design decisions you've made, and any other information you deem necessary.

This project is licensed under the [Creative Commons Attribution 4.0 International License](https://creativecommons.org/licenses/by/4.0/).

## Context

This project's goal is to create a (simplified) clone of _Final Fantasy_'s combat, a game developed by [_Square Enix_](https://www.square-enix.com). Broadly speaking, for the combat, the player has a group of game units to control and a group of enemies controlled by the computer.

## Homework 1

### Project Structure

- `Characters`: Contains character classes, including both player and enemy game units.
- `Weapons`: Contains classes representing different types of weapons.
- `Party`: Contains the class representing the character's party.
- `TurnScheduler`: Contains the TurnScheduler class.

### Features

#### Characters

- **Player Characters**: These are game units controlled by the player. They can be either common or magic game units.
  - **Common Characters**: These include Ninjas, Paladins, and Warriors.
  - **Magic Characters**: These include Black Mages and White Mages.

- **Enemy Characters**: These are game units controlled by the computer.

#### Weaponry

- **Common Weapons**: Weapons used by common game units, such as Axes, Bows, and Swords.
- **Magic Weapons**: Weapons used by magic game units, such as Staves and Wands.

#### Party

The party represents a group of game units controlled by the player.

#### Turn Scheduler

The Turn Scheduler manages the turn order of game units during combat by handling their action bars.

## Homework 2

### Additional Requirements and Features

- **Weapon Assignment**: Methods must be defined to achieve the correct assignment of weapons according to the character.
  - **Weapon Constraints**: Each character has a predefined set of weapons that they can equip.
  - **Unequip Weapon**: A character must be capable of unequipping a weapon.

- **Spell Casting**:
  - **Targeting**: A spell must be able to be cast on a target.
  - **Mana Cost**: Successfully casting a spell should deduct the corresponding mana.
  - **White Magic**: Only a White Mage can cast light magic spells.
  - **Black Magic**: Only a Black Mage can cast dark magic spells.
  - **Spell Effects**: The spell must consider the statistics of the mage (and their weapon) for its effects.

### Design Decisions

- **Character and Weapon Design**: Characters and weapons were designed to reflect the diversity in gameplay, allowing for strategic decisions based on character classes and weapon types.
- **Turn Scheduler Logic**: The Turn Scheduler ensures a dynamic and fair combat flow, where the weight of characters and their equipped weapons influence the order of turns.

### Contributions

- **Character Classes**: Defined and implemented various character classes with distinct abilities and constraints.
- **Weapon System**: Developed a robust system for weapon assignment and usage, ensuring each character can only equip appropriate weapons.
- **Magic System**: Created a detailed magic system that includes spell casting, mana management, and spell effects based on character stats.
- **Combat Mechanics**: Implemented the core combat mechanics, including the Turn Scheduler, to manage the flow of battle effectively.