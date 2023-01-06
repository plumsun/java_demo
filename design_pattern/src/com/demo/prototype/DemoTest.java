package com.demo.prototype;

import com.demo.prototype.freework.Manager;
import com.demo.prototype.freework.Product;
import org.junit.Test;

/**
 * @author LiHaoHan
 * @date 2023/1/4
 */
public class DemoTest {

    @Test
    public void test() throws CloneNotSupportedException {
        Manager manager = new Manager();
        Student student = new Student();
        Teacher teacher = new Teacher();
        manager.register("stu",student);
        manager.register("tea",teacher);


        Product stu = manager.create("stu");
        stu.use();
        Product tea = manager.create("tea");
        tea.use();
    }
}
