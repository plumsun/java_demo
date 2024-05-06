package com.demo.composite;

/**
 * @author LiHaoHan Created on 2024/4/1
 */
public class FileBusinessException extends RuntimeException {

    public FileBusinessException() {
    }

    public FileBusinessException(String message) {
        super(message);
    }
}
