package decorator.starbuzz.base;

import decorator.starbuzz.Beverage;

public class HouseBlend extends Beverage {
    
    public HouseBlend() {
        description = "Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
