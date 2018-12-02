package lesson4;

import java.util.Objects;

public class User {
    String name;
    int age;
    String street;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public User(String name, int age, String street){
        this.age = age;
        this.name = name;
        this.street = street;
    }

    public static void main(String[] args) {
        User student1 = new User (null, 17, "streetOne");
        User student2 = new User (null, 17, "streetOne");
        System.out.println(student1.equals(student2));
        System.out.println(student2.equals(student1));
        System.out.println(student1.equals(student1));
        //System.out.println(student1.equals(student2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        User student = (User) obj;

        return age == student.age && (name != null && name.equals(student.name))
                && (street != null && street.equals(student.street));
    }

   /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return getAge() == user.getAge() &&
                Objects.equals(name, user.name) &&
                Objects.equals(street, user.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, getAge(), street);
    }*/
}
