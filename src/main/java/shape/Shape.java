package shape;

public abstract class Shape {
    static final int TYPECODE_LINE = 0;
    static final int TYPECODE_RECTANGLE = 1;
    static final int TYPECODE_OVAL = 2;
    private final int startX;
    private final int startY;
    private final int endX;
    private final int endY;

    protected Shape(int startX, int startY, int endX, int endY) {
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }

    public static ShapeLine createShapeLine(int startX, int startY, int endX, int endY){
        return new ShapeLine(startX, startY, endX, endY);
    }

    public static ShapeRectangle createShapeRectangle(int startX, int startY, int endX, int endY){
        return new ShapeRectangle(startX, startY, endX, endY);
    }

    public static ShapeOval createShapeOval(int startX, int startY, int endX, int endY){
        return new ShapeOval(startX, startY, endX, endY);
    }

    public abstract void draw();

    public abstract int getTypeCode();

    public abstract String getName();

}
