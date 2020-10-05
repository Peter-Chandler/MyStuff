package resources.life;

public class GridChanges {
    
    public int[] liveCells;
    public int[] deadCells;
    
    public GridChanges(int[] liveCells, int liveCellsAmount, int[] deadCells, int deadCellsAmount) {
        this.liveCells = new int[liveCellsAmount];
        this.deadCells = new int[deadCellsAmount];
        System.arraycopy(liveCells, 0, this.liveCells, 0, liveCellsAmount);
        System.arraycopy(deadCells, 0, this.deadCells, 0, deadCellsAmount);   
    }

}
