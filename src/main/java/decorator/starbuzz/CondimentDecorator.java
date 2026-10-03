package decorator.starbuzz;

/**
 * Decorator class.
 *
 * This HAS-A Component while also extending a Component.
 */
public abstract class  CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();
}
