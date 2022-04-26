package design_pattern.replace_type_code_with_state_strategy.shape;

public class ShapeOval extends Shape {
    public ShapeOval(int startX, int startY, int endX, int endY) {
        super(startX, startY, endX, endY);
    }

    @Override
    public void draw() {
        drawLine();
    }

    @Override
    public int getTypeCode() {
        return TYPECODE_OVAL;
    }

    @Override
    public String getName() {
        return "oval";
    }

    private void drawLine() {
        System.out.println("Drawing a line");
    }
}
