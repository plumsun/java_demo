package com.demo.template;

/**
 * @author LiHaoHan
 * @date 2022/12/15
 */
public class DemoTest {

    public static void main(String[] args) {
        AbstractDisplay stringDisplay = new StringDisplay();
        stringDisplay.display();
        AbstractDisplay charDisplay = new CharDisplay();
        charDisplay.display();
    }
}
