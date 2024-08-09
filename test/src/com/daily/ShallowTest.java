package com.daily;

/**
 * @author LiHaoHan on 2024/8/9
 */
public class ShallowTest {
    /**
     * 浅拷贝实现
     */
    @org.junit.Test
    public void shallowCopies() throws CloneNotSupportedException {
        Address address = new Address("New York");
        Person person1 = new Person("John", address);

        // 浅拷贝
        Person person2 = (Person) person1.clone();

        // 修改person1的address
        person1.address.city = "San Francisco";

        System.out.println(person1); // 输出: Person{name='John', address=San Francisco}
        System.out.println(person2); // 输出: Person{name='John', address=San Francisco}
    }
}


class Address {
    String city;

    public Address(String city) {
        this.city = city;
    }
}

class Person implements Cloneable {
    String name;
    Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // 实现浅拷贝
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address.city + "}";
    }
}
