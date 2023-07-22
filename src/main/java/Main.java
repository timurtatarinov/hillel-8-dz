public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {

        Student student = new Student( 587058086, "Xiaomi", "Роман", 9);
        Student student1 = student.clone();

        System.out.println(student.getMobile_phone().getPhone_number()
                + ", " + student.getMobile_phone().getPhone_model()
                + ", " + student.getName()
                + ", " + student.getClass_level());

        System.out.println(student1.getMobile_phone().getPhone_number()
                + ", " + student1.getMobile_phone().getPhone_model()
                + ", " + student1.getName()
                + ", " + student1.getClass_level());

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }

}