## MyStuff
Desktop Java Application where you can use and play with some of the fractal visualisation, cellular automata and game projects I have created

## Motivation
After my third year project and dissertation on an algorithm visualisation application at The University of Warwick 
I wanted to create a similar application where I could use and play with the various projects I have created for fun and practice

## Projects
The following projects are complete but could have new features developed and UI changes:
 - [Conway's Game of Life](#conway), [(wiki)](https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life)
 - [Langton's ant](#langton), [(wiki)](https://en.wikipedia.org/wiki/Langton%27s_ant)
 - [Turmites](#turmite), [(wiki)](https://en.wikipedia.org/wiki/Turmite)
 - [Mandelbrot set](#mandelbrot), [(wiki)](https://en.wikipedia.org/wiki/Mandelbrot_set)
 - [Minesweeper](#minesweeper), [(wiki)](https://en.wikipedia.org/wiki/Minesweeper_(video_game))
 - [Sudoku](#sudoku), [(wiki)](https://en.wikipedia.org/wiki/Sudoku)

The following are projects that I am currently working towards adding:
 - Maze generation, [(wiki)](https://en.wikipedia.org/wiki/Maze_generation_algorithm)
 - Chaos game, [(wiki)](https://en.wikipedia.org/wiki/Chaos_game)
 - Snake, [(wiki)](https://en.wikipedia.org/wiki/Snake_(video_game_genre))
 - Rewrite my A level coursework labyrinth game from python to Java

## Installation
At the moment the project will need to be downloaded and opened as a maven project in Netbeans IDE and ran from there.
In the future I will update the maven pom file so that you do not have to do this and you can build the program from the command line.
I may also upload the final JAR files so that you do not have to build the project yourself

## Potential To-Dos:
 - Conway's Game of Life
   - Be able to select an area and then save/clear it
   - Auto detect cell size when uploading image
   - Draw line between points when mouse is dragged fast
   - Check out of bounds when zooming and dragging
   - Be able to change the ruleset
   - Be able to fill the canvas a certain % with random live cells
 - Langton's ant
   - Be able to choose the colours of the states
   - Be able to generate images of all combinations up to a certain length
   - Be able to choose starting location for the ant
   - Be able to have a larger canvas that can be scrolled
   - Be able to add multiple ants
 - Turmites
   - Be able to extend the amount of states that could be possible
   - Be able to generate images of all possible combinations
 - Mandelbrot set
   - Better colour smoothing
 - Minesweeper
   - Implement 1-1 and 1-2 rule for the minesweeper auto complete
 - Sudoku
   - Have different colour schemes and user made, saveable colour schemes
   - Display time taken to complete
   - Display message when the Sudoku has been successfully completed
   - Add in ability to discover hidden singles and triples for the autocomplete feature
   - Let the user input their own Sudoku puzzles and save them
   - Be able to input a picture of a Sudoku and the program detect the values (difficult, might need machine learning for good predictions)
   - Button to automatically display marks for all cells
   - Option to allow marks to be updated when the user adds a value
   - Option to not allow a cell to be marked by a value if that value cannot be entered in that cell
   - Need to remove hard coded colour values and replace with static colour variables
 - General
   - Standardise the look of the ui across all projects e.g. remove empty space in control panels
   - Be able to close tabs
   - Code cleanup
   - Comment code
   - Find a better name than MyStuff
   - Change around the resources directory so that non java files are outside the java directory
   - Update maven files so that resource files are downloaded properly and fix all file locations in java code


<a name="conway">
<details>
    <summary>Conway's Game of Life</summary>
</details>


<a name="langton">
<details>
    <summary>Langton's ant</summary>
</details>


<a name="turmite">
<details>
    <summary>Turmites</summary>
</details>


<a name="mandelbrot">
<details>
    <summary>Mandelbrot set</summary>
</details>


<a name="minesweeper">
<details>
    <summary>Minesweeper</summary>
</details>

<a name="sudoku">
<details>
    <summary>Sudoku</summary>
</details>