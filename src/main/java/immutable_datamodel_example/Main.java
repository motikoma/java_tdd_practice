package immutable_datamodel_example;

public class Main {
    public static void main(String[] args) {
        OrderConstraint orderConstraint = OrderConstraint.SHIPPING_JAPAN_ONLY;
        System.out.println(orderConstraint.getErrorMessage());
    }
}
