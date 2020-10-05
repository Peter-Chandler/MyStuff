package resources.life;

import java.util.Arrays;

public class Grid {
    
    public int hash;
    
    public Grid(int[] grid) {
        hash(grid);
    }

    private void hash(int[] grid) {
        hash = 7;
        hash = 23 * hash + Arrays.hashCode(grid);
    }
    
    @Override
    public int hashCode() {
        return hash;
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
        final Grid other = (Grid) obj;
        if (this.hash != other.hash) {
            return false;
        }
        return true;
    }

}
