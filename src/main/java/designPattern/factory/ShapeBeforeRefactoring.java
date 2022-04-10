package designPattern.factory;

public class ShapeBeforeRefactoring {
    public static final int TYPE_CODE_LINE = 0;
    public static final int TYPE_CODE_RECTANGLE = 1;
    public static final int TYPE_CODE_OVAL = 2;

    private final int _typecode;
    private final int _startx;
    private final int _starty;
    private final int _endx;
    private final int _endy;

    public ShapeBeforeRefactoring(int _typecode, int _startx, int _starty, int _endx, int _endy) {
        this._typecode = _typecode;
        this._startx = _startx;
        this._starty = _starty;
        this._endx = _endx;
        this._endy = _endy;
    }

    public int get_typecode() {
        return _typecode;
    }

    public String getName() {
        switch (_typecode) {
            case TYPE_CODE_LINE:
                return "Line";
            case TYPE_CODE_RECTANGLE:
                return "Rectangle";
            case TYPE_CODE_OVAL:
                return "Oval";
            default:
                return "Unknown";
        }
    }

    @Override
    public String toString() {
        return "ShapeBeforeRefactoring{" +
                "_typecode=" + _typecode +
                ", _startx=" + _startx +
                ", _starty=" + _starty +
                ", _endx=" + _endx +
                ", _endy=" + _endy +
                '}';
    }

    public void draw() {
        switch (_typecode) {
            case TYPE_CODE_LINE:
                drawLine();
                break;
            case TYPE_CODE_RECTANGLE:
                drawRectangle();
                break;
            case TYPE_CODE_OVAL:
                drawOval();
                break;
            default:
                ;
        }
    }

    private void drawLine() {
        System.out.println("Drawing a line");
    }

    private void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }

    private void drawOval() {
        System.out.println("Drawing a oval");
    }

}
