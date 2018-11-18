public class ManageCusomers {

    DBInterface dbInterface;

    public ManageCusomers(DBInterface dbInterface) {
        this.dbInterface = dbInterface;
    }

    public int calculateCustomer(String surname) {
        return this.dbInterface.getCustomerIdBySurname(surname);
    }
}
