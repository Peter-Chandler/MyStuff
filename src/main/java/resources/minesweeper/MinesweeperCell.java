package resources.minesweeper;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;

public class MinesweeperCell {
    
    // variables for colours and images used for all cells and games
    private static final Color BACKGROUND_COLOR;
    private static final Color[] STRING_COLORS;
    private static final BufferedImage flag40;
    private static final BufferedImage flag20;
    private static final BufferedImage mine40;
    private static final BufferedImage mine20;
    
    static {
        try {
            flag40 = ImageIO.read(new File("src\\main\\java\\resources\\minesweeper\\Flag40.png"));
            flag20 = ImageIO.read(new File("src\\main\\java\\resources\\minesweeper\\Flag20.png"));
            mine40 = ImageIO.read(new File("src\\main\\java\\resources\\minesweeper\\Mine40.png"));
            mine20 = ImageIO.read(new File("src\\main\\java\\resources\\minesweeper\\Mine20.png"));
        } catch (IOException e) {
            e.printStackTrace(System.out);
            throw new RuntimeException("Could not init minesweeperCell class.", e);
        }
        BACKGROUND_COLOR = new Color(192, 192, 192);
        STRING_COLORS = new Color[] {
            Color.BLACK,
            Color.BLUE,
            new Color(0, 75, 0),
            Color.RED, new Color(0, 0, 125),
            new Color(125, 0, 0),
            new Color(153, 153, 0),
            new Color(76, 153, 0),
            new Color(50, 50, 50)};
    }
    
    // cell variables
    public final int x;
    public final int y;
    public int minesAdjacent;
    public int minesLeft;
    public boolean isMine;
    public boolean isFlagged;
    public boolean isCovered;
    public ArrayList<MinesweeperCell> neighbours;
    // drawing variables
    private final int cellSize;
    private final int imageX;
    private final int imageY;
    private final Graphics2D g;
    private final FontMetrics metrics;
   
    public MinesweeperCell(int x, int y, int cellSize, Graphics2D g) {
        this.x = x;
        this.y = y;
        minesAdjacent = 0;
        minesLeft = 0;
        isMine = false;
        isFlagged = false;
        isCovered = true;
        neighbours = new ArrayList<>();
        
        this.cellSize = cellSize;
        imageX = 1+x*(cellSize+1);
        imageY = 1+y*(cellSize+1);
        this.g = g;
        metrics = g.getFontMetrics(new Font("Serif", Font.PLAIN, cellSize));
    }
    
    public void displayEmpty() {
        g.setColor(Color.WHITE);
        g.fillRect(imageX, imageY, cellSize, cellSize);
    }
    
    public void displayAdjacent() {
        displayEmpty();
        g.setColor(STRING_COLORS[minesAdjacent]);
        g.drawString(""+minesAdjacent, imageX + (cellSize - metrics.stringWidth(""+minesAdjacent)) / 2, imageY + ((cellSize - metrics.getHeight()) / 2) + metrics.getAscent());
    }
    
    public void displayMinesLeft() {
        displayEmpty();
        g.setColor(STRING_COLORS[minesLeft]);
        g.drawString(""+minesLeft, imageX + (cellSize - metrics.stringWidth(""+minesLeft)) / 2, imageY + ((cellSize - metrics.getHeight()) / 2) + metrics.getAscent());
    }
    
    public void displayMine() {
        g.drawImage(cellSize == 40 ? mine40 : mine20, imageX, imageY, null);
    }
    
    public void addFlag() {
        isFlagged = true;
        g.drawImage(cellSize == 40 ? flag40 : flag20, imageX, imageY, null);
    }
    
    public void removeFlag() {
        isFlagged = false;
        g.setColor(BACKGROUND_COLOR);
        g.fillRect(imageX, imageY, cellSize, cellSize);
    }
   
    public ArrayList<MinesweeperCell> getCommonNeighbours(MinesweeperCell cell) {
        ArrayList<MinesweeperCell> common = new ArrayList<>(cell.neighbours);
        common.retainAll(this.neighbours);
        return common;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        MinesweeperCell cell = (MinesweeperCell) obj;
        return this.x == cell.x && this.y == cell.y;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + this.x;
        hash = 53 * hash + this.y;
        return hash;
    }
    
}