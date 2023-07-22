public class Mobile_Phone implements Cloneable {

    private int phone_number;
    private String phone_model;

    public Mobile_Phone(int phone_number, String phone_model) {
        this.phone_number = phone_number;
        this.phone_model = phone_model;
    }

    public int getPhone_number() { return phone_number; }
    public String getPhone_model() { return phone_model; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}