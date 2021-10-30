package de.hsw;

public class ThreeDimPoint extends Point {
    private int z;

    public ThreeDimPoint(int x) {
        super(x);
        this.z = x;
    }

    public ThreeDimPoint(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    
}
