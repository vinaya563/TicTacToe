**Tic Tac Toe Game using Object-Oriented Programming (OOPS) in Java**

**Introduction**

This is a simple Tic Tac Toe game implementation in Java using Object-Oriented Programming (OOPS) principles. The game allows two players to play against each other on a 3x3 grid. The first player to get three of their marks in a row (horizontally, vertically, or diagonally) wins the game.

**Features**

Two players can play the game alternately.
The game checks for valid moves and prevents illegal moves.
It detects when a player wins or when the game ends in a draw.

**How to Run the Game**

To run the Tic Tac Toe game, you'll need to have Java Development Kit (JDK) installed on your system.

Clone the repository to your local machine or download the ZIP file and extract it.

Open a terminal (or command prompt) and navigate to the project directory.

Compile the Java files by executing the following command:

Copy code
javac TicTacToe.java
After successful compilation, run the game using the following command:

Copy code
java TicTacToe
The game will now start in the terminal, and you can begin playing by entering the row and column numbers to place your mark (X or O) on the grid.

Follow the on-screen instructions to take turns and complete the game.

**Game Rules**

The game is played on a 3x3 grid.

Player 1 uses 'X', and Player 2 uses 'O'.

Players take turns placing their marks in empty cells of the grid.

The game ends when one player gets three of their marks in a row (horizontally, vertically, or diagonally).

If all the cells are filled, and there is no winner, the game ends in a draw.

**Class Description**

The code is organized into the following classes:

TicTacToe: This class contains the main method and is responsible for starting the game and managing the player turns.

Board: This class represents the Tic Tac Toe game board. It handles the grid and checks for valid moves and game outcomes.

Player: This class represents a player in the game. It keeps track of the player's mark ('X' or 'O').
