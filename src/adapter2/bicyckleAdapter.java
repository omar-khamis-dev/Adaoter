
package adapter2;


public class bicyckleAdapter implements vehicle{
private bicyckle bicycle;

public bicyckleAdapter(bicyckle bicycle){
    
    this.bicycle = bicycle;
    
}
    
    @Override
    public void occelearte() {
        bicycle.pedol();
    }

    @Override
    public void pushBreak() {
        bicycle.stop();
    }

    @Override
    public void scundHorn() {
        bicycle.ringbell();
    }
    
}
