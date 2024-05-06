package com.demo.chain_of_responsibility;

/**
 * @author LiHaoHan Created on 2024/5/6
 */
public class Main {

    public static void main(String[] args) {
        BaseChainOfResponsibility aChainHandler = new AChainHandler();
        BaseChainOfResponsibility bChainHandler = new BChainHandler();
        BaseChainOfResponsibility cChainHandler = new CChainHandler();

        aChainHandler.setNext(bChainHandler);
        bChainHandler.setNext(cChainHandler);

        aChainHandler.doHandler();
    }
}
