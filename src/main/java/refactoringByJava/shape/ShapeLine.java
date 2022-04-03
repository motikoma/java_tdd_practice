package refactoringByJava.shape;

public class ShapeLine extends Shape {
    public ShapeLine(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        drawLine();
    }

    @Override
    public int getTypeCode() {
        return TYPECODE_LINE;
    }

    @Override
    public String getName() {
        return "ShapeLine";
    }

    private void drawLine() {
        System.out.println("Drawing an line");
    }

}
