# TicTacToe-Game-Verifier
A game verifier for Tic-Tac-Toe to check which player has won (if any)


## Getting Started

### Prerequisites

  You will need to have installed:
  ```
  - Java 8
  - Maven
  ```
 
### Installation

  To start you need to clone the git repository and cd into it.
  
  ```
  $ git clone https://github.com/ahmedhamedaly/TicTacToe-Game-Verifier.git
  $ cd TicTacToe-Game-Verifier
  ```
  

### Usage 
  
  To run the tests for the program, run the following command.
  
  ```
  $ mvn test
  ```
  
  ![Sample output](https://user-images.githubusercontent.com/51321440/75097856-5019f800-55a7-11ea-99b4-e9721afe7c28.png)

  
  If you want to test out a specific function, eg. constructor or currentState.
  
  ```
  $ mvn -Dtest=ticTacToeTest#constructorTest test
  
  $ mvn -Dtest=ticTacToeTest#currentStateTest test
  ```
  
  To call the class (as part of a bigger program), use it as follows below.
  ```
  ticTacToe game = new ticTacToe(board);
  game.currentState();
  ```
 
