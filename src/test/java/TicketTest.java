import org.junit.Assert;
import org.junit.Test;

public class TicketTest {

    boolean wedDeal = false;
    private int stnAmount = 1;
    private int OAPAmount = 0;
    private int studentAmount =1;
    private int childAmount = 1;

    @Test
    public void getTotalPrice(){
        int i = 0;
        if (wedDeal){
            i = -2;
        }
        int stn = 8 * stnAmount;
        int OAP = 6 * OAPAmount;
        int student = 6 * studentAmount;
        int child = 4 * childAmount;
        i = stn + OAP + student + child + i;
        Assert.assertEquals("Wrong Value", 18, i);
    }
}
