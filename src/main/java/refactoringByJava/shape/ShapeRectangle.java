package refactoringByJava.shape;

public class ShapeRectangle extends Shape {
    public ShapeRectangle(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        drawRectangle();
    }

    @Override
    public int getTypeCode() {
        return Shape.TYPECODE_RECTANGLE;
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    private void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }
}
