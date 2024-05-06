package com.demo.chain_of_responsibility;

/**
 * @author LiHaoHan Created on 2024/5/6
 */
public abstract class BaseChainOfResponsibility implements Chain {

    protected BaseChainOfResponsibility next;

    public void setNext(BaseChainOfResponsibility next) {
        this.next = next;
    }


}
