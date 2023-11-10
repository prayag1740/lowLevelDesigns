package factorypattern;

public class Test {
    public static void main(String[] args) {
        Shapefactory sf = new Shapefactory();
        Shape shapeObj = sf.getShape("RECTANGLE");
        shapeObj.draw();
    }
}
