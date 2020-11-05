package tabs;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import resources.sudoku.Cell;

public class Sudoku extends javax.swing.JPanel {
    
    private static final int[] BASEGRID = {0, 1, 2, 9, 10, 11, 18, 19, 20};
    private static final Color LIGHT_BLUE = new Color(207, 224, 252);
    private static final Color BLUE = new Color(133, 176, 248);
    private static final Color DARK_BLUE = new Color(15, 100, 240);
    private final DocumentFilter df = new DocumentFilter() {
        @Override
        public void replace(FilterBypass fb, int offs, int length, String str, AttributeSet a) throws BadLocationException {
            if (selected.inputType) {
                if ((str.matches("^[0-9]$") || str.equals(""))) {
                    if (str.equals("0") || (!str.equals("") && selected.value == Integer.parseInt(str))) {
                        str = "";
                    }
                    selected.setValue(str.equals("") ? 0 : Integer.parseInt(str));
                    super.replace(fb, 0, fb.getDocument().getLength(), " "+str, a);
                    highlightCell(selected);
                    checkInvalid(selected);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            } else {
                if (str.matches("^[0-9]$")) {
                    if (str.equals("0")) {
                        selected.setValue(0);
                        super.replace(fb, 0, fb.getDocument().getLength(), "", a);
                    } else {
                        selected.addMark(Integer.parseInt(str));
                    }
                    super.replace(fb, 0, fb.getDocument().getLength(), selected.marks, a);
                } else {
                    Toolkit.getDefaultToolkit().beep();
                }
            }
            
        }

        @Override
        public void remove(FilterBypass fb, int offs, int length) throws BadLocationException {
            //set value to zero removes all marks
            selected.setValue(0);
            highlightCell(selected);
            //remove all text
            super.remove(fb, 0, fb.getDocument().getLength());
            checkInvalid(selected);
        }
        
    };
    private final FocusAdapter fa = new FocusAdapter() {
        @Override
        public void focusGained(FocusEvent e) {
            selected = (Cell) e.getSource();
            highlightCell(selected);
        }
    };
    private final MouseAdapter ma = new MouseAdapter() {
        @Override
        public void mousePressed(MouseEvent e) {
            Cell cell = (Cell) e.getSource();
            if (e.getButton() == MouseEvent.BUTTON1) {
                cell.inputType = true;
            } else if( e.getButton() == MouseEvent.BUTTON3) {
                cell.requestFocusInWindow();
                cell.inputType = false;
            }
        }
    };
    private Cell[] cells;
    private Cell[][] rows;
    private Cell[][] columns;
    private Cell[][] grids;
    private Cell selected;
    private String currentSudoku;
    
    public Sudoku() {
        initComponents();
        newGame();
    }
    
    public void newGame() {
        cells = new Cell[81];
        rows = new Cell[9][9];
        columns = new Cell[9][9];
        grids = new Cell[9][9];
        for (int i = 0; i < 81; i++) {
            Cell c = new Cell(i);
            ((AbstractDocument) c.getDocument()).setDocumentFilter(df);
            c.addFocusListener(fa);
            c.addMouseListener(ma);
            cells[i] = c;
        }
        for (int i = 0; i < 9; i++) {
            Cell[] row = new Cell[9];
            Cell[] column = new Cell[9];
            Cell[] grid = new Cell[9];
            int offset = (i / 3) * 27 + (i % 3) * 3;
            for (int j = 0; j < 9; j++) {
                row[j] = cells[9 * i + j];
                column[j] = cells[9 * j + i];
                grid[j] = cells[BASEGRID[j]+offset];
            }
            rows[i] = row;
            columns[i] = column;
            grids[i] = grid;
        }
        for (int i = 0; i < 9; i++) {
            JPanel panel = new JPanel(new GridLayout(3, 3));
            panel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
            Cell[] grid = grids[i];
            for (int j = 0; j < 9; j++) {
                panel.add(grid[j]);
            }
            board.add(panel);
        }
        
        
        for (Cell c : cells) {
            HashSet<Cell> neighbours = new HashSet<>();
            neighbours.addAll(Arrays.asList(rows[c.row]));
            neighbours.addAll(Arrays.asList(columns[c.column]));
            neighbours.addAll(Arrays.asList(grids[c.grid]));
            neighbours.remove(c);
            c.neighbours = neighbours.toArray(new Cell[20]);
        }
    }
    
    public void clear() {
        for (Cell c : cells) {
            selected = c;
            selected.setEditable(true);
            selected.inputType = true;
            selected.setText("");
        }
    }
    
    public void reset() {
        clear();
        String[] sudokuSplit = currentSudoku.split("");
        for (int i = 0; i < 81; i++) {
            if (!sudokuSplit[i].equals("0")) {
                selected = cells[i];
                selected.setText("" + Integer.parseInt(sudokuSplit[i]));
                selected.setEditable(false);
                selected.isChangeable = false;
                selected.setForeground(Color.DARK_GRAY);
            }
        }
        selected = null;
        for (Cell c : cells) {
            c.setBackground(Color.WHITE);
        }
        System.out.println(currentSudoku);
    }
    
    public void selectPuzzle() {
        String path = "/sudoku/puzzles/";
        String type = (String) difficultyComboBox.getSelectedItem();
        int level = (int) levelSelectSpinner.getValue();
        switch (type) {
            case "Very Easy": path += "veasy.txt"; break;
            case "Easy": path += "easy.txt"; break;
            case "Medium": path += "medium.txt"; break;
            case "Hard": path += "hard.txt"; break;
            case "Very Hard": path += "vhard.txt"; break;
        }
        currentSudoku = "";
        Scanner sc = new Scanner(Sudoku.class.getResourceAsStream(path));
        for (int i = 0; i < level; i++) {
            currentSudoku = sc.nextLine();
        }
        reset();
        printSudoku();
    }
    
    public void computePotentials() {
        for (Cell c : cells) {
            if (c.value == 0) {
                c.potential = new HashSet(Arrays.asList(1,2,3,4,5,6,7,8,9));
                for (Cell n : c.neighbours) {
                    c.potential.remove(n.value);
                }
            }
        }
        printPotentials();
        //here we can do other checks to potential such as hidden doubles and triples
    }
    
    public void complete() {
        computePotentials();
        for (int i = 0; i < 9; i++) {
            for (Cell[] group : new Cell[][] {rows[i], columns[i], grids[i]}) {
                int[] values = new int[9];
                Cell[] lastCell = new Cell[9];
                for (Cell c : group) {
                    if (c.potential != null) {
                        // Naked Single Candidates
                        if (c.potential.size() == 1) {
                            selected = c;
                            selected.setForeground(Color.GREEN);
                            selected.inputType = true;
                            selected.setText(""+(int)c.potential.toArray()[0]);
                        }
                        for (int value : c.potential) {
                            values[value-1]++;
                            lastCell[value-1] = c;
                        }
                    }
                }
                for (int j = 0; j < 9; j++) {
                    // Hidden Single Candidates
                    if (values[j] == 1 && lastCell[j].value == 0) {
                        selected = lastCell[j];
                        selected.setForeground(Color.GREEN);
                        selected.inputType = true;
                        selected.setText(""+(j+1));
                    }
                }
            }
        }
    }
    
    public void printSudoku() {
        String printString;
        for (int p = 0; p < 9; p++) {
            printString = "";
            for (int j = 0; j < 9; j++) {
                Cell c = cells[p*9 + j];
                if (c.value != 0) {
                    printString += c.value;
                } else {
                    printString += " ";
                }
                printString += "|";
            }
            System.out.println(printString);
        }
        System.out.println("");
    }
    
    public void printPotentials() {
        String printString;
        for (int p = 0; p < 9; p++) {
            printString = "";
            for (int j = 0; j < 9; j++) {
                Cell c = cells[p*9 + j];
                if (c.value != 0) {
                    printString += "         ";
                } else {
                    for (int k = 1; k <= 9; k++) {
                        if (c.potential.contains(k)) {
                            printString += k;
                        } else {
                            printString += " ";
                        }
                    }
                }
                printString += "|";
            }
            System.out.println(printString);
        }
        System.out.println("");
    }
    
    public void highlightCell(Cell cell) {
        for (Cell c : cells) {
            c.setBackground(Color.WHITE);
        }
        selected.setBackground(DARK_BLUE);
        if (cell.value != 0) {
            if (filledNeighboursRadioButton.isSelected()) {
                for (Cell c : cell.neighbours) {
                    c.setBackground(LIGHT_BLUE);
                }
            }
            if (sameValuesRadioButton.isSelected()) {
                for (Cell c : cells) {
                    if (!c.equals(selected) && c.value == cell.value) {
                        c.setBackground(BLUE);
                    }
                }
            }
        } else {
            if (emptyNeighboursRadioButton.isSelected()) {
                for (Cell c : cell.neighbours) {
                    c.setBackground(LIGHT_BLUE);
                }
            }
        }
        
    }
    
    public void checkInvalid(Cell cell) {
        // The cell has been changed so any previous conflicts are removed
        if (!cell.conflictingCells.isEmpty()) {
            cell.setForeground(new Color(0, 0, 128));
            for (Cell c : cell.conflictingCells) {
                c.conflictedBy.remove(cell);
                // as long as the cell is not conflicting or being conflicted by another cell its colour is set to default
                if (c.conflictingCells.isEmpty() && c.conflictedBy.isEmpty()) { 
                    if (highlightErrorsRadioButton.isSelected()) {
                        c.setForeground(c.isChangeable ? new Color(0, 0, 128) : Color.DARK_GRAY);
                    }
                }
            }
        }
        if (cell.value != 0) {
            //checks if the value is invalid
            for (Cell c : cell.neighbours) {
                if (cell.value == c.value) {
                    cell.conflictingCells.add(c);
                    c.conflictedBy.add(cell);
                    if (highlightErrorsRadioButton.isSelected()) {
                        c.setForeground(c.isChangeable ? Color.RED : new Color(114, 0, 0));
                    }
                }
            }
            if (!cell.conflictingCells.isEmpty()) {
                if (highlightErrorsRadioButton.isSelected()) {
                    cell.setForeground(Color.RED);
                }
            }
        }
    }
        
        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        controls = new javax.swing.JPanel();
        difficultyComboBox = new javax.swing.JComboBox<>();
        levelSelectSpinner = new javax.swing.JSpinner();
        selectButton = new javax.swing.JButton();
        completeButton = new javax.swing.JButton();
        emptyNeighboursRadioButton = new javax.swing.JRadioButton();
        filledNeighboursRadioButton = new javax.swing.JRadioButton();
        sameValuesRadioButton = new javax.swing.JRadioButton();
        resetButton = new javax.swing.JButton();
        highlightErrorsRadioButton = new javax.swing.JRadioButton();
        board = new javax.swing.JPanel();

        controls.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        controls.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        controls.setPreferredSize(new java.awt.Dimension(480, 480));

        difficultyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Very Easy", "Easy", "Medium", "Hard", "Very Hard" }));

        levelSelectSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10000, 1));

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        completeButton.setText("Complete");
        completeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeButtonActionPerformed(evt);
            }
        });

        emptyNeighboursRadioButton.setSelected(true);
        emptyNeighboursRadioButton.setText("Highlight neighbours for empty cell");
        emptyNeighboursRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonActionPerformed(evt);
            }
        });

        filledNeighboursRadioButton.setText("Highlight neighbours for filled cell");
        filledNeighboursRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonActionPerformed(evt);
            }
        });

        sameValuesRadioButton.setSelected(true);
        sameValuesRadioButton.setText("Highlight same values");
        sameValuesRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioButtonActionPerformed(evt);
            }
        });

        resetButton.setText("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        highlightErrorsRadioButton.setSelected(true);
        highlightErrorsRadioButton.setText("Highlight errors");
        highlightErrorsRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                highlightErrorsRadioButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout controlsLayout = new javax.swing.GroupLayout(controls);
        controls.setLayout(controlsLayout);
        controlsLayout.setHorizontalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(levelSelectSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectButton, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
                    .addGroup(controlsLayout.createSequentialGroup()
                        .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(highlightErrorsRadioButton)
                            .addComponent(sameValuesRadioButton)
                            .addComponent(filledNeighboursRadioButton)
                            .addComponent(emptyNeighboursRadioButton)
                            .addGroup(controlsLayout.createSequentialGroup()
                                .addComponent(completeButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(resetButton)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        controlsLayout.setVerticalGroup(
            controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(difficultyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelSelectSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(completeButton)
                    .addComponent(resetButton))
                .addGap(18, 18, 18)
                .addComponent(emptyNeighboursRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(filledNeighboursRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sameValuesRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(highlightErrorsRadioButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        board.setLayout(new java.awt.GridLayout(3, 3));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(controls, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(controls, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(board, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        selectPuzzle();
    }//GEN-LAST:event_selectButtonActionPerformed

    private void completeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeButtonActionPerformed
        complete();
    }//GEN-LAST:event_completeButtonActionPerformed

    private void radioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioButtonActionPerformed
        highlightCell(selected);
    }//GEN-LAST:event_radioButtonActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        reset();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void highlightErrorsRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_highlightErrorsRadioButtonActionPerformed
        for (Cell c : cells) {
            if (!(c.conflictedBy.isEmpty() && c.conflictingCells.isEmpty())) { //if there are conflicting cells we either need to remove or colour in red
                c.setForeground(highlightErrorsRadioButton.isSelected() ?
                    // Checking if the cell is changeable or not as this affects the colour
                    c.isChangeable ? Color.RED : new Color(114, 0, 0) : // off to on so colouring in red
                    c.isChangeable ? new Color(0, 0, 128) : Color.DARK_GRAY); // on to off so colouring in deafult colour
            }
        }
    }//GEN-LAST:event_highlightErrorsRadioButtonActionPerformed

    //<editor-fold defaultstate="collapsed" desc="Generated Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel board;
    private javax.swing.JButton completeButton;
    private javax.swing.JPanel controls;
    private javax.swing.JComboBox<String> difficultyComboBox;
    private javax.swing.JRadioButton emptyNeighboursRadioButton;
    private javax.swing.JRadioButton filledNeighboursRadioButton;
    private javax.swing.JRadioButton highlightErrorsRadioButton;
    private javax.swing.JSpinner levelSelectSpinner;
    private javax.swing.JButton resetButton;
    private javax.swing.JRadioButton sameValuesRadioButton;
    private javax.swing.JButton selectButton;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
    
}