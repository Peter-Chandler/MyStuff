package resources.mandelbrot;

public class MandelbrotVariables {
    
    private final double startX;
    private final double endX;
    private final double startY;
    private final double endY;
    private final double step;
    
    public MandelbrotVariables(double startX, double endX, double startY, double endY, double step) {
        this.startX = startX;
        this.endX = endX;
        this.startY = startY;
        this.endY = endY;
        this.step = step;
    }
    
    public double getStartX() {
        return startX;
    }
    
    public double getEndX() {
        return endX;
    }
    
    public double getStartY() {
        return startY;
    }
    
    public double getEndY() {
        return endY;
    }
    
    public double getStep() {
        return step;
    }
    
    @Override
    public String toString() {
        return "startX:"+startX+"  endX:"+endX+"  startY:"+startY+"  endY:"+endY;
    }
}
