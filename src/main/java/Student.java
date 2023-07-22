public class Student implements Cloneable {

    private Mobile_Phone mobile_phone;
    private String name;
    private int class_level;

    public Student(int phone_number, String phone_model, String name, int class_level) {
        this.mobile_phone = new Mobile_Phone(phone_number, phone_model);
        this.name = name;
        this.class_level = class_level;
    }

    public Mobile_Phone getMobile_phone() { return mobile_phone; }
    public String getName() { return name; }
    public int getClass_level() { return class_level; }

    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.mobile_phone = (Mobile_Phone) mobile_phone.clone();
        return cloned;
    }
}