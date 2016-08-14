package com.zzia;

import java.io.File;

/**
 * 描述：
 * Created by ascend on 2016/8/12.
 */
public class Client {
    public static void main(String[] args) {
        String path = "C:\\doc\\githubWorkspace\\cici\\test\\target\\test\\";
        System.out.println(File.separator+"test");
        path.substring(0,path.lastIndexOf(File.separator+"test"));

    }
}
