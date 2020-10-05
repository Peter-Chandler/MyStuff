package tabs;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;
import resources.minesweeper.MinesweeperCell;

public class Minesweeper extends javax.swing.JPanel {
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        controls = new javax.swing.JPanel();
        columnsInputTextField = new javax.swing.JTextField();
        columnsInputLabel = new javax.swing.JLabel();
        rowsInputTextField = new javax.swing.JTextField();
        rowsInputLabel = new javax.swing.JLabel();
        minesInputTextField = new javax.swing.JTextField();
        minesInputLabel = new javax.swing.JLabel();
        newGameButton = new javax.swing.JButton();
        totalMinesLeftLabel = new javax.swing.JLabel();
        showMovesButton = new javax.swing.JButton();
        cellSizeInputComboBox = new javax.swing.JComboBox<>();
        cellSizeInputLabel = new javax.swing.JLabel();
        autoCheckBox = new javax.swing.JCheckBox();
        minesLeftCheckBox = new javax.swing.JCheckBox();
        display = new resources.ImageJPanel();

        jRadioButton1.setText("jRadioButton1");

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        controls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controls.setPreferredSize(new java.awt.Dimension(480, 480));

        columnsInputTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                columnsInputTextFieldFocusLost(evt);
            }
        });
        columnsInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                columnsInputTextFieldActionPerformed(evt);
            }
        });

        columnsInputLabel.setText("Number of columns: min 9, max 50");

        rowsInputTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rowsInputTextFieldFocusLost(evt);
            }
        });
        rowsInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rowsInputTextFieldActionPerformed(evt);
            }
        });

        rowsInputLabel.setText("Number of rows: min 9, max 50");

        minesInputTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                minesInputTextFieldFocusLost(evt);
            }
        });
        minesInputTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minesInputTextFieldActionPerformed(evt);
            }
        });

        minesInputLabel.setText("Number of mines");

        newGameButton.setText("New game");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        totalMinesLeftLabel.setText("Total mines left: ");
        totalMinesLeftLabel.setToolTipText("");

        showMovesButton.setText("Show available moves");
        showMovesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMovesButtonActionPerformed(evt);
            }
        });

        cellSizeInputComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Small" }));
        cellSizeInputComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cellSizeInputComboBoxActionPerformed(evt);
            }
        });

        cellSizeInputLabel.setText("Size of each minesweeper cell");

        autoCheckBox.setText("Auto complete");
        autoCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                autoCheckBoxActionPerformed(evt);
            }
        });

        minesLeftCheckBox.setText("Display mines left for cells");
        minesLeftCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minesLeftCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlsLayout = new javax.swing.GroupLayout(controls);
        controls.setLayout(controlsLayout);
        controlsLayout.setHorizontalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minesLeftCheckBox)
                    .addComponent(autoCheckBox)
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(columnsInputTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(rowsInputTextField))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rowsInputLabel)
                            .addComponent(columnsInputLabel, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(totalMinesLeftLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cellSizeInputComboBox, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(minesInputTextField, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(minesInputLabel)
                            .addComponent(cellSizeInputLabel)))
                    .addComponent(newGameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showMovesButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {columnsInputLabel, minesInputLabel, rowsInputLabel});

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {columnsInputTextField, minesInputTextField, rowsInputTextField});

        controlsLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {newGameButton, totalMinesLeftLabel});

        controlsLayout.setVerticalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(columnsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(columnsInputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rowsInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rowsInputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(minesInputTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minesInputLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cellSizeInputComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cellSizeInputLabel))
                .addGap(18, 18, 18)
                .addComponent(newGameButton)
                .addGap(18, 18, 18)
                .addComponent(totalMinesLeftLabel)
                .addGap(18, 18, 18)
                .addComponent(showMovesButton)
                .addGap(18, 18, 18)
                .addComponent(autoCheckBox)
                .addGap(18, 18, 18)
                .addComponent(minesLeftCheckBox)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        controlsLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {columnsInputLabel, columnsInputTextField, minesInputLabel, minesInputTextField, rowsInputLabel, rowsInputTextField, totalMinesLeftLabel});

        display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                displayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                displayMouseReleased(evt);
            }
        });
        display.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                displayComponentResized(evt);
            }
        });

        javax.swing.GroupLayout displayLayout = new javax.swing.GroupLayout(display);
        display.setLayout(displayLayout);
        displayLayout.setHorizontalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1024, Short.MAX_VALUE)
        );
        displayLayout.setVerticalGroup(
            displayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void displayComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_displayComponentResized
        panelWidth = display.getWidth();
        panelHeight = display.getHeight();
        setxMax((panelWidth-1)/(cellSizeInput+1));
        setyMax((panelHeight-1)/(cellSizeInput+1));
        // offset is only not created when no game has been created yet at the start as there is no image to get the dimensions yet
        if (gameRunning || gameOver) {
            offsetX = (panelWidth-imageWidth)/2;
            offsetY = (panelHeight-imageHeight)/2;
            display();
        }
    }//GEN-LAST:event_displayComponentResized

    private void columnsInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_columnsInputTextFieldActionPerformed
        columnsInputCheck();
    }//GEN-LAST:event_columnsInputTextFieldActionPerformed

    private void columnsInputTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_columnsInputTextFieldFocusLost
        columnsInputCheck();
    }//GEN-LAST:event_columnsInputTextFieldFocusLost

    private void rowsInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rowsInputTextFieldActionPerformed
        rowsInputCheck();
    }//GEN-LAST:event_rowsInputTextFieldActionPerformed

    private void rowsInputTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rowsInputTextFieldFocusLost
        rowsInputCheck();
    }//GEN-LAST:event_rowsInputTextFieldFocusLost

    private void minesInputTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minesInputTextFieldActionPerformed
        minesInputCheck();
    }//GEN-LAST:event_minesInputTextFieldActionPerformed

    private void minesInputTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_minesInputTextFieldFocusLost
        minesInputCheck();
    }//GEN-LAST:event_minesInputTextFieldFocusLost

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        if (columnsInput != -1 && rowsInput != -1 && minesInput != -1) {
            // create all game variables
            columns = columnsInput;
            rows = rowsInput;
            mines = minesInput;
            cellSize = cellSizeInput;
            winCondition = columns*rows-mines;
            uncoveredCells = 0;
            totalMinesLeft = mines;
            totalMinesLeftLabel.setText("Total mines left: "+totalMinesLeft);
            imageWidth = columns*(cellSize+1)+1;
            imageHeight = rows*(cellSize+1)+1;
            offsetX = (panelWidth-imageWidth)/2;
            offsetY = (panelHeight-imageHeight)/2;
            image = new BufferedImage(imageWidth, imageHeight, BufferedImage.TYPE_INT_ARGB);
            g = image.createGraphics();
            g.setFont(new Font("Serif", Font.PLAIN, cellSize));
            
            // populate grid with cells
            grid = new MinesweeperCell[columns][rows];
            for (int x = 0; x < columns; x++) {
                for (int y = 0; y < rows; y++) {
                    grid[x][y] = new MinesweeperCell(x, y, cellSize, g);
                }
            }
            // set the neighbours of each cell
            for (int x = 0; x < columns; x++) {
                for (int y = 0; y < rows; y++) {
                    MinesweeperCell cell = grid[x][y];
                    if (x != 0)                           cell.neighbours.add(grid[x-1][y  ]);
                    if (x != columns-1)                   cell.neighbours.add(grid[x+1][y  ]);
                    if (y != 0)                           cell.neighbours.add(grid[x  ][y-1]);
                    if (y != rows-1)                      cell.neighbours.add(grid[x  ][y+1]);
                    if (x != 0 && y != 0)                 cell.neighbours.add(grid[x-1][y-1]);
                    if (x != columns-1 && y != 0)         cell.neighbours.add(grid[x+1][y-1]);
                    if (x != 0 && y != rows-1)            cell.neighbours.add(grid[x-1][y+1]);
                    if (x != columns-1 && y != rows-1)    cell.neighbours.add(grid[x+1][y+1]);
                }
            }
            // populate random cells with mines and update neighbouring cells mine values
            Random rand = new Random();
            int counter = 0;
            while (counter != mines) {
                int x = rand.nextInt(columns);
                int y = rand.nextInt(rows);
                if (!grid[x][y].isMine) {
                    grid[x][y].isMine = true;
                    for (MinesweeperCell c : grid[x][y].neighbours) {
                        c.minesAdjacent++;
                        c.minesLeft++;
                    }
                    counter++;
                }
            }
            // draw starting grid
            g.setColor(new Color(192, 192, 192));
            g.fillRect(0, 0, imageWidth, imageHeight);
            g.setColor(Color.BLACK);
            for (int x = 0; x <= columns; x++) {
                g.drawLine(x*(cellSize+1), 0, x*(cellSize+1), imageHeight-1);
            }
            for (int y = 0; y <= rows; y++) {
                g.drawLine(0, y*(cellSize+1), imageWidth-1, y*(cellSize+1));
            }
            display();
            // set game states
            gameRunning = true;
            gameOver = false;
            autoRunning = false;
            displayMinesLeft = false;
        }
    }//GEN-LAST:event_newGameButtonActionPerformed

    private void showMovesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showMovesButtonActionPerformed
        if (gameRunning) {
            for (int x = 0; x < columns; x++) {
                for (int y = 0; y < rows; y++) {
                    MinesweeperCell cell = grid[x][y];
                    if (!cell.isCovered && cell.minesAdjacent > 0) {
                        ArrayList<MinesweeperCell> coveredNeighbours = new ArrayList<>();
                        for (MinesweeperCell c : cell.neighbours) {
                            if (c.isCovered && !c.isFlagged) {
                                coveredNeighbours.add(c);
                            }
                        }
                        if (cell.minesLeft == 0 && coveredNeighbours.size() > 0) {
                            for (MinesweeperCell c : coveredNeighbours) {
                                g.setColor(Color.GREEN);
                                g.drawOval(2+(c.x*(cellSize+1)), 2+(c.y*(cellSize+1)), cellSize-2, cellSize-2);
                            }
                        } else if (cell.minesLeft > 0 && cell.minesLeft == coveredNeighbours.size()) {
                            for (MinesweeperCell c : coveredNeighbours) {
                                g.setColor(Color.RED);
                                g.drawOval(2+(c.x*(cellSize+1)), 2+(c.y*(cellSize+1)), cellSize-2, cellSize-2);
                            }
                        }
                    }
                }
            }
            display();
        }
    }//GEN-LAST:event_showMovesButtonActionPerformed

    private void cellSizeInputComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cellSizeInputComboBoxActionPerformed
       if (((String)cellSizeInputComboBox.getSelectedItem()).equals("Normal")) {
            cellSizeInput = 40;
            setxMax((panelWidth-1)/(cellSizeInput+1));
            setyMax((panelHeight-1)/(cellSizeInput+1));
            // checking that if coming from cellSize 20 to 40 the current inputs are not over the max
            if (columnsInput > columnsInputMax) {
                columnsInput = columnsInputMax;
                columnsInputTextField.setText(""+columnsInput);
            }
            if (rows > rowsInputMax) {
                rowsInput = rowsInputMax;
                rowsInputTextField.setText(""+rowsInput);
            }
       } else {
            cellSizeInput = 20;
            setxMax((panelWidth-1)/(cellSizeInput+1));
            setyMax((panelHeight-1)/(cellSizeInput+1));
       }
    }//GEN-LAST:event_cellSizeInputComboBoxActionPerformed

    private void displayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMousePressed
        // saving the location of the mouse press
        if (gameRunning) {
           mousePressedX = (evt.getX() - offsetX)/(cellSize+1);
            mousePressedY = (evt.getY() - offsetY)/(cellSize+1); 
        }
    }//GEN-LAST:event_displayMousePressed

    private void displayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMouseReleased
        //check if the mouse was released on the cell that was clicked on
        if (gameRunning && mousePressedX == (evt.getX() - offsetX)/(cellSize+1) && mousePressedY == (evt.getY() - offsetY)/(cellSize+1)) {
            MinesweeperCell cell = grid[(evt.getX() - offsetX)/(cellSize+1)][(evt.getY() - offsetY)/(cellSize+1)];
            if (evt.getButton() == 1) { // left click cell to uncover
                clickedCell(cell);
            } else if (evt.getButton() == 2) { // middle click cell to left click on all neighbouring cells
                for (MinesweeperCell c : cell.neighbours) {
                    clickedCell(c);
                }  
            } else if (evt.getButton() == 3) { // right click cell to flag
                flagCell(cell);
            }
            display();
        }
    }//GEN-LAST:event_displayMouseReleased

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        stopAuto();
    }//GEN-LAST:event_formComponentHidden

    private void autoCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_autoCheckBoxActionPerformed
        if (gameRunning) {
            if (autoRunning) {
                stopAuto();
            } else {
                autoTimer.start();
                autoRunning = true;
            }
        }
    }//GEN-LAST:event_autoCheckBoxActionPerformed

    private void minesLeftCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minesLeftCheckBoxActionPerformed
        if (gameRunning) {
            displayMinesLeft =  !displayMinesLeft;
            if (displayMinesLeft) {
                for (int x = 0; x < columns; x++) {
                    for (int y = 0; y < rows; y++) {
                        MinesweeperCell cell = grid[x][y];
                        if (!cell.isCovered && cell.minesAdjacent > 0) {
                            cell.displayMinesLeft();
                        }
                    }
                }
            } else {
                for (int x = 0; x < columns; x++) {
                    for (int y = 0; y < rows; y++) {
                        MinesweeperCell cell = grid[x][y];
                        if (!cell.isCovered && cell.minesAdjacent > 0) {
                            cell.displayAdjacent();
                        }
                    }
                }
            }
            display();
        }
    }//GEN-LAST:event_minesLeftCheckBoxActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox autoCheckBox;
    private javax.swing.JComboBox<String> cellSizeInputComboBox;
    private javax.swing.JLabel cellSizeInputLabel;
    private javax.swing.JLabel columnsInputLabel;
    private javax.swing.JTextField columnsInputTextField;
    private javax.swing.JPanel controls;
    private resources.ImageJPanel display;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JLabel minesInputLabel;
    private javax.swing.JTextField minesInputTextField;
    private javax.swing.JCheckBox minesLeftCheckBox;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel rowsInputLabel;
    private javax.swing.JTextField rowsInputTextField;
    private javax.swing.JButton showMovesButton;
    private javax.swing.JLabel totalMinesLeftLabel;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="My Variables">
    // panel, image and graphics drawing variables
    private int panelWidth;
    private int panelHeight;
    private int offsetX;
    private int offsetY;
    private int imageWidth;
    private int imageHeight;
    private BufferedImage image;
    private Graphics2D g;
    // gui variables
    private int columnsInput;
    private int rowsInput;
    private int minesInput;
    private int cellSizeInput;
    private int columnsInputMax;
    private int rowsInputMax;
    private int totalMinesLeft;
    private int mousePressedX;
    private int mousePressedY;
    // game variables
    private int columns;
    private int rows;
    private int mines;
    private int cellSize;
    private int winCondition;
    private int uncoveredCells;
    private MinesweeperCell[][] grid;
    Stack<MinesweeperCell> emptyCells;
    // game states
    private boolean gameRunning;
    private boolean gameOver;
    private boolean autoRunning;
    private boolean displayMinesLeft;
    //</editor-fold>
    
    public Minesweeper() {
        initComponents();
        columnsInput = -1;
        rowsInput = -1;
        minesInput = -1;
        cellSizeInput = 40;
        gameRunning = false;
        gameOver = false;
    }
    
    private void clickedCell(MinesweeperCell cell) {
        if (!cell.isFlagged && cell.isMine) { // clicked on a mine
            // update game states to show game is over
            gameOver = true;
            gameRunning = false;
            stopAuto();
            // display all mines on the board
            for (int x = 0; x < columns; x++) {
                for (int y = 0; y < rows; y++) {
                    if (grid[x][y].isMine) {
                        grid[x][y].displayMine();
                    }
                }
            }
            // display game over text centered
            g.setColor(new Color(100, 0, 0));
            g.setFont(new Font("Serif", Font.PLAIN, imageWidth/5));
            FontMetrics metrics = g.getFontMetrics(new Font("Serif", Font.PLAIN, imageWidth/5));
            g.drawString("Game Over", (imageWidth-metrics.stringWidth("Game Over"))/2, ((imageHeight-metrics.getHeight())/2)+metrics.getAscent());
        } else if (!cell.isFlagged && cell.isCovered && cell.minesAdjacent == 0) { // clicked on a tile that has no adjacent mines
            // stack to store cells with no adjacent mines so all empty connected cells can be uncovered
            emptyCells = new Stack<>();
            uncoverCell(cell);
            // while loop to keep checking empty cells until all connected empty cells (and neighbours) have been uncovered
            while (!emptyCells.isEmpty()) {
                // uncovering all the neighbouring cells
                for (MinesweeperCell c : emptyCells.pop().neighbours) {
                    if (c.isCovered && !c.isFlagged) {
                        uncoverCell(c);
                    }
                }
            }
        } else if (!cell.isFlagged && cell.isCovered && cell.minesAdjacent > 0){ // clicked on a tile that has at least one mine neighbour
            uncoverCell(cell);
        }
        // checks to see if the click caused the player to win
        winCheck();
    }
    
    private void uncoverCell(MinesweeperCell cell) {
        cell.isCovered = false;
        uncoveredCells++;
        if (cell.minesAdjacent == 0) {
            // cell is displayed empty and added to the stack as it has no adjacent mines and its neighbours need to be checked
            cell.displayEmpty();
            emptyCells.push(cell);
        } else {
            // draw cell as it has adjacent mines
            if (displayMinesLeft) {
                cell.displayMinesLeft();
            } else {
                cell.displayAdjacent();
            }
        }
    }
    
    private void flagCell(MinesweeperCell cell) {
        if (cell.isCovered) {
            if (cell.isFlagged) { // if the cell is already flagged
                // flag is removed
                cell.removeFlag();
                totalMinesLeft++;
                // update minesLeft for neighbours and display if minesLeft is set to be displayed
                for (MinesweeperCell c : cell.neighbours) {
                    if (!c.isMine) {
                        c.minesLeft++;
                    }
                    if (displayMinesLeft && !c.isCovered) {
                        c.displayMinesLeft();
                    }
                }
            } else {
                // flag is added
                cell.addFlag();
                totalMinesLeft--;
                // update minesLeft for neighbours and display if minesLeft is set to be displayed
                for (MinesweeperCell c : cell.neighbours) {
                    if (!c.isMine) {
                        c.minesLeft--;
                    }
                    if (displayMinesLeft && !c.isCovered) {
                        c.displayMinesLeft();
                    }
                }
            }
            totalMinesLeftLabel.setText("Total mines left: "+totalMinesLeft);
        }
    }
    
    private void winCheck() {
        if (uncoveredCells == winCondition) { // check if the user has uncovered all cells and won the game
            // display game won on screen centered
            g.setColor(Color.GREEN);
            g.setFont(new Font("Serif", Font.PLAIN, imageWidth/5));
            FontMetrics metrics = g.getFontMetrics(new Font("Serif", Font.PLAIN, imageWidth/5));
            g.drawString("Game Won", (imageWidth-metrics.stringWidth("Game Won"))/2, ((imageHeight-metrics.getHeight())/2)+metrics.getAscent());
            // update game variables to show game is over
            gameOver = true;
            gameRunning = false;
            stopAuto();
        }
    }
    
    javax.swing.Timer autoTimer = new javax.swing.Timer(1000, new java.awt.event.ActionListener() {
    // checks all cells if they are guranteed to be safe or a mine
        @Override
          public void actionPerformed(java.awt.event.ActionEvent e) {
               if (gameRunning) {
                    // update variable to see if we need to display changes or if to stop
                    boolean update = false;
                    // lists to store the cells that can be safely clicked or flagged correctly
                    ArrayList<MinesweeperCell> cellsToUncover = new ArrayList<>();
                    ArrayList<MinesweeperCell> cellsToFlag = new ArrayList<>();
                    for (int x = 0; x < columns; x++) {
                        for (int y = 0; y < rows; y++) {
                            MinesweeperCell cell = grid[x][y];
                            if (!cell.isCovered) {
                                // gets all covered neighbours of an uncovered cell
                                ArrayList<MinesweeperCell> coveredNeighbours = new ArrayList<>();
                                for (MinesweeperCell c : cell.neighbours) {
                                    if (c.isCovered && !c.isFlagged) {
                                        coveredNeighbours.add(c);
                                    }
                                }
                                // if the amount of minesLeft is 0 but there are covered neighbours they can be safely uncovered
                                if (cell.minesLeft == 0 && coveredNeighbours.size() > 0) {
                                    update = true;
                                    for (MinesweeperCell c : coveredNeighbours) {
                                        // check if the list already contains the cell to stop duplicates being clicked
                                        if (!cellsToUncover.contains(c)) {
                                          cellsToUncover.add(c);
                                        }
                                    }
                                // if the amount of minesLeft equals the amount of covered neighbours then the neighbours must all be mines
                                } else if (cell.minesLeft > 0 && cell.minesLeft == coveredNeighbours.size()) {
                                    update = true;
                                    for (MinesweeperCell c : coveredNeighbours) {
                                        // check if the list already contains the cell to stop duplicates being clicked
                                        if (!cellsToFlag.contains(c)) {
                                            cellsToFlag.add(c);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    
                    if (!update) {
                        // if there are no updates then the timer can stop
                        stopAuto();
                    } else {
                        // if there has been an update then the cells are uncovered/flagged and displayed
                        for (MinesweeperCell cell : cellsToUncover) {
                            clickedCell(cell);
                        }
                        for (MinesweeperCell cell : cellsToFlag) {
                            flagCell(cell);
                        }
                        display();
                    }
                }
            }
        });
    
    private void stopAuto() {
        autoTimer.stop();
        autoRunning = false;
        autoCheckBox.setSelected(false);
    }
    
    private void display() {
        display.displayImage(image, offsetX, offsetY);
    }

    private void setxMax(int xMax) {
        this.columnsInputMax = xMax;
        columnsInputLabel.setText("Number of columns: max "+xMax);
    }

    private void setyMax(int yMax) {
        this.rowsInputMax = yMax;
        rowsInputLabel.setText("Number of rows: max "+yMax);
    }

    private void columnsInputCheck() {
        try {
            int input = Integer.parseInt(columnsInputTextField.getText());
            if (input > 0 && input <= columnsInputMax) {
                columnsInput = input;
            } else {
                if (columnsInput == -1) {
                    columnsInputTextField.setText("");
                } else {
                    columnsInputTextField.setText(""+columnsInput);
                }
            }
        } catch (NumberFormatException e) {
            if (columnsInput == -1) {
                columnsInputTextField.setText("");
            } else {
                columnsInputTextField.setText(""+columnsInput);
            }
        }
    }

    private void rowsInputCheck() {
        try {
            int input = Integer.parseInt(rowsInputTextField.getText());
            if (input > 0 && input <= rowsInputMax) {
                rowsInput = input;
            } else {
                if (rowsInput == -1) {
                    rowsInputTextField.setText("");
                } else {
                    rowsInputTextField.setText(""+rowsInput);
                }
            }
        } catch (NumberFormatException e) {
            if (rowsInput == -1) {
                rowsInputTextField.setText("");
            } else {
                rowsInputTextField.setText(""+rowsInput);
            }
        }
    }

    private void minesInputCheck() {
        try {
            int input = Integer.parseInt(minesInputTextField.getText());
            if (input > 0 && input < columnsInput*rowsInput) {
                minesInput = input;
            } else {
                if (minesInput == -1) {
                    minesInputTextField.setText("");
                } else {
                    minesInputTextField.setText(""+minesInput);
                }
            }
        } catch (NumberFormatException e) {
            if (minesInput == -1) {
                minesInputTextField.setText("");
            } else {
                minesInputTextField.setText(""+minesInput);
            }
        }
    }

}