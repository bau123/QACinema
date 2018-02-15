import org.junit.Assert;
import org.junit.Test;

public class TicketTest {

    boolean wedDeal;
    //Gimme a value
    private int stnAmount = 1;
    //Gimme a value
    private int OAPAmount = 0;
    //Gimme a value
    private int studentAmount = 1;
    //Gimme a value
    private int childAmount = 1;

    @Test
    public void getTotalDealOff(){
        wedDeal = false;
        int i = 0;
        if (wedDeal){
            i = -2;
        }
        int stn = 8 * stnAmount;
        int OAP = 6 * OAPAmount;
        int student = 6 * studentAmount;
        int child = 4 * childAmount;
        i = stn + OAP + student + child + i;
        Assert.assertEquals("Wrong total", 18, i);
    }
    @Test
    public void getTotalDealOn(){
        wedDeal = true;
        int i = 0;
        if (wedDeal){
            i = -2;
        }
        int stn = 8 * stnAmount;
        int OAP = 6 * OAPAmount;
        int student = 6 * studentAmount;
        int child = 4 * childAmount;
        i = stn + OAP + student + child + i;
        Assert.assertEquals("Wrong Value", 16, i);
    }
}
