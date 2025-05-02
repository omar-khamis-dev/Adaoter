
package adapter2;

public class car implements vehicle{

    @Override
    public void occelearte() {
        System.err.println("car starts to move !!?");
    }

    @Override
    public void pushBreak() {
                System.err.println("car stopped to move !!?");

    }

    @Override
    public void scundHorn() {
                System.err.println("Beed Beed !!?");

    }
    
}
