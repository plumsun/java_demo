package com.demo.chain_of_responsibility;

/**
 * @author LiHaoHan Created on 2024/5/6
 */
public class BChainHandler extends BaseChainOfResponsibility {
    @Override
    public void doHandler() {
        System.out.println("this = " + this);
        if (next != null) {
            next.doHandler();
        }
    }
}
