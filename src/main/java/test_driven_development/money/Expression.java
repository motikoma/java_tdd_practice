package test_driven_development.money;

interface Expression {
    Expression plus(Expression added);
    Expression times(int multiplier);
    Money reduce(Bank bank, String to);
}
