public interface DBInterface {
    public int getCustomerIdBySurname(String surname);
    public String getCustomerSurnameById(int id);
    public String saveCustomerName(String name);
}
