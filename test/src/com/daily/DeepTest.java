package com.daily;

/**
 * The type Test.
 *
 * @author LiHaoHan on 2024/8/9
 */
public class DeepTest {


    /**
     * 深拷贝实现
     */
    @org.junit.Test
    public void deepCopies() throws CloneNotSupportedException {
        DeepAddress address = new DeepAddress("New York");
        DeepPerson person1 = new DeepPerson("John", address);

        // 深拷贝
        DeepPerson person2 = (DeepPerson) person1.clone();

        // 修改person1的address
        person1.address.city = "San Francisco";

        System.out.println(person1); // 输出: Person{name='John', address=San Francisco}
        System.out.println(person2); // 输出: Person{name='John', address=New York}
    }
}

class DeepAddress implements Cloneable {
    String city;

    public DeepAddress(String city) {
        this.city = city;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class DeepPerson implements Cloneable {
    String name;
    DeepAddress address;

    public DeepPerson(String name, DeepAddress address) {
        this.name = name;
        this.address = address;
    }

    // 实现深拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepPerson cloned = (DeepPerson) super.clone();
        cloned.address = (DeepAddress) address.clone(); // 深拷贝 address
        return cloned;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address.city + "}";
    }
}

