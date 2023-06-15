package chapter9;
public class InheritanceTester {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.print();

        Square square = new Square();
        square.print();
        Mother mom = new Mother();
        mom.setName("anait");
        System.out.println(mom.getName() + " is a " + mom.getGender());
    }
    public static void testSquareOverride(){
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(8);
        rectangle.setLength(4);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());

    }
}
