# Tic-Tac-Toe
A 2-player console game built with 2D arrays, loops, and Scanner.

Features
Two-Player Mode
Input Validation
Automatic Win Detection

Helper Methods
To keep the code clean and organized, the game logic is broken down into specific methods:
printBoard(): Redraws the 3x3 grid on the screen after every turn so players can clearly see the current state of the game.
gameResult(): Acts as the referee. It checks all rows, columns, and diagonals after a move to see if the current player has won.

How it Works (Game Flow)
Setup: The game asks who wants to go first (Player X or Player O).
Playing: Players take turns entering a row number and a column number to place their mark on the 3x3 grid.
Updating: The printBoard() method repaints the console after every valid move.
Winning: The gameResult() method checks the board. The game stops and congratulates the winner as soon as someone connects three marks!

Concepts & Tools Used
2D Arrays: To create the 3x3 game board.
Loops: A while loop keeps the game running, and for loops are used to print the board and check for winners.
Conditional Logic: if/else statements to validate moves and swap player turns.
Scanner: To take input from the keyboard.
