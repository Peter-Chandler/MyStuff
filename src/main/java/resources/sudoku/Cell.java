package resources.sudoku;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashSet;
import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.DefaultCaret;

public class Cell extends JTextArea {
    
    public final int row;
    public final int column;
    public final int grid;
    public int value;
    public String marks;
    public boolean isChangeable;
    public HashSet<Integer> potential;
    public Cell[] neighbours;
    public boolean inputType;
    public ArrayList<Cell> conflictingCells; // Cells that cause conflict with this cells input value
    public ArrayList<Cell> conflictedBy; // Cells that input value has made this a conflicting cell
    
    public Cell(int position) {
        column = position % 9;
        row = position / 9;
        grid = (row / 3) * 3 + column / 3;
        value = 0;
        marks = "                          ";
        isChangeable = true;
        conflictingCells = new ArrayList<>();
        conflictedBy = new ArrayList<>();
        this.setLineWrap(true);
        this.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        this.setFont(new Font("Tahoma", 0, 37));
        this.setBackground(Color.WHITE);
        this.setForeground(new Color(0, 0, 128));
        this.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        // sets the caret to a blank caret that will not display on the text field
        this.setCaret(new DefaultCaret() {
            @Override
            public void paint(Graphics g) {
            }
            @Override
            public boolean isVisible() {
                return false;
            }
            @Override
            public boolean isSelectionVisible() {
                return false;
            }

        });
        // this always makes the caret to the right of the text so that it will always be deleted by back space as you cannot see the caret
        this.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                Cell c = (Cell) e.getSource();
                if (c.getCaretPosition() != c.getText().length()) {
                    c.setCaretPosition(c.getText().length());
                }
            }
        });
        // removes the ability to highlight as it is not needed and does not look good when the cell already has its background highlighted
        this.setHighlighter(null);
    }
    
    public void setValue(int value) {
        this.value = value;
        marks = "                          ";
        this.setFont(new Font("Tahoma", 0, 37));
    }
    
    public void addMark(int value) {
        System.out.println(value);
        if (marks.charAt((3*(value-1))+1) == value+48) {
            marks = new StringBuilder(marks).replace((3*(value-1))+1, (3*(value-1))+2, " ").toString();
        } else {
            marks = new StringBuilder(marks).replace((3*(value-1))+1, (3*(value-1))+2, ""+value).toString();
        }
        this.setFont(new Font("Tahoma", 0, 12));
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cell other = (Cell) obj;
        if (this.row != other.row) {
            return false;
        }
        if (this.column != other.column) {
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.row;
        hash = 61 * hash + this.column;
        return hash;
    }
    
}