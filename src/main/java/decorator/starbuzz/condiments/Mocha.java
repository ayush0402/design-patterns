package decorator.starbuzz.condiments;

import decorator.starbuzz.Beverage;
import decorator.starbuzz.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha (Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
