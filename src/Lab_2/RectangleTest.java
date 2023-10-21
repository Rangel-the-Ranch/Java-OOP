package lab2aProblem2;

public class RectangleTest {
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle( 3.7, 5.5);
        Rectangle r3 = new Rectangle( -1 ,0);
        Rectangle.setColor("red");
        System.out.println("r1 width: " + r1.getWidth() );
        System.out.println("r1 heigth: " + r1.getHeigth() );
        System.out.println("r2 width: " + r2.getWidth() );
        System.out.println("r2 heigth: " + r2.getHeigth() );
        System.out.println("r3 width: " + r3.getWidth() );
        System.out.println("r3 heigth: " + r3.getHeigth() );
        System.out.println("\tcolor: " + Rectangle.getColor() );
        r3.setHeigth(10);

        System.out.println("r3 width: " + r3.getWidth() );
        System.out.println("r3 heigth: " + r3.getHeigth() );

    }
}
