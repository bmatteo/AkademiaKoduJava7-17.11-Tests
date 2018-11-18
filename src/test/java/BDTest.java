import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BDTest {
    @Test
    public void testCalculateCustomer() {
        ManageCusomers manageCusomers = new ManageCusomers(new DBInterfaceStub());
        String surname = "Kowalski";
        int expectedResult = 3;

        Assert.assertEquals(expectedResult, manageCusomers.calculateCustomer("Kowalski"));
    }

    @Ignore
    @Test
    public void testCalculateCustomer2() {
        DBInterface db = mock(DBInterface.class);
        when(db.getCustomerIdBySurname("Kowalski")).thenReturn(3);
        when(db.getCustomerIdBySurname("Nowak")).thenReturn(5);
        ManageCusomers manageCusomers = new ManageCusomers(db);
        String surname = "Kowalski";
        int expectedResult = 3;
        int expectedResult2 = 5;

        Assert.assertEquals(expectedResult, manageCusomers.calculateCustomer(surname));
        Assert.assertEquals(expectedResult2, manageCusomers.calculateCustomer("Nowak"));
    }
}
