package decoratorpattern;

public class ExtraChesse extends ToppingDecorator {

    BasePizza basePizza ;

    public ExtraChesse(BasePizza basePizza) {this.basePizza = basePizza;} ;
    @Override
    public int cost() {
        return this.basePizza.cost() + 10 ;
    }
}
