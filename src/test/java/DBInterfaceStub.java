public class DBInterfaceStub implements DBInterface {
    public int getCustomerIdBySurname(String surname) {
        return 3;
    }

    public String getCustomerSurnameById(int id) {
        return "Kowalski";
    }

    public String saveCustomerName(String name) {
        return name;
    }
}
