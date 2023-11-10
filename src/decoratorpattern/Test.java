package decoratorpattern;

public class Test {

    public static void main(String[] args) {
        BasePizza base = new Margherita() ;
        System.out.println("base pizza magherita cost is " + base.cost());

        BasePizza base2 = new ExtraMushroom(new Margherita()) ;
        System.out.println("base pizza magherita cost after adding mushrooms is  " + base2.cost());

        BasePizza base3 = new ExtraChesse (new ExtraMushroom(new Margherita())) ;
        System.out.println("base pizza magherita cost after adding mushrooms & cheese is  " + base3.cost());
    }
}
