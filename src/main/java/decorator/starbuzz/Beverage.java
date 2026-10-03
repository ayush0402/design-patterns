package decorator.starbuzz;

/**
 * Base / Abstract Component class (Beverage) which will be inherited by ConcreteComponents (DarkRoast, Espresso etc.) and Decorator class (CondimentDecorator).
 *
 * Base Decorator class (CondimentDecorator) will be inherited by ConcreteDecorators (Mocha, Soy, etc.).
 *
 * ConcreteComponent IS-A Component.
 * (Base) Decorator IS-A Component while HAS-A component.
 * ConcreteDecorator IS-A (Base) Decorator.
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
