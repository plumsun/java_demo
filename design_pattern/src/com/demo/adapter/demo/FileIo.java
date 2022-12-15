package com.demo.adapter.demo;

import java.io.IOException;

/**
 * target
 *
 * @author LiHaoHan
 * @date 2022/12/15
 */
public interface FileIo {

    void readListToFile(String fileName) throws IOException;
    void writeListToFile(String fileName) throws IOException;
    void saveListToFile(String key,String value) throws IOException;
    Object getValue(String key);
}
