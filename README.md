# Sudoku-Youna-Son
2025-2026 AP CSA Sudoku Generator Project
This project is a Java console application that generates and prints a fully solved 9x9 Sudoku board. It is completely random and will generate a random board every time you load it.

Video Link: https://drive.google.com/file/d/1TXrF9VbbMS_CfoN94pthUZFLsz8MZSaS/view?usp=sharing
This code runs on the main rules of Sudoku:

1) Unique numbers per column
2) Unique numbers per row
3) Unique numbers for each box or 3x3 grid inside the 9x9 grid
This logic is followed by using Math.random() everytime the program loads. Additionally, Arraylists are used to map and store the numbers 1-9.

List of Files is this README.md AND the console application, sudoku.java (for part 1)

Part 2 (Extra Credit) This file is labeled extracredit.java

How it works:

A copy of the solved board is created to serve as the playable puzzle. Random positions in the puzzle are replaced with 0 to represent blank spaces.

The user interacts with the puzzle through the console by entering: Row (0–8) and Column (0–8), this is where you want to input your answer, keep in mind it starts at 0

Number (1–9), or the answer you enter into your chosen square

Then it reprint the grid into an updated version if you get it correct and press continue playing.

PLEASE LET ME KNOW IF THERES ISSUES WITH MY GITHUB PROJECT, I DON'T UNDERSTAND THIS WEBSITE VERY WELL

I USED CODE HS FOR MY IDE
