package com.zzia;

import java.io.File;

/**
 * Created by adeng on 2016/8/13.
 */
public class Test {


    @org.junit.Test
    public void test2(){
//        PayCardService
    }

    @org.junit.Test
    public void test(){
        String path = "C:\\doc\\githubWorkspace\\cici\\test\\target\\test\\";
        System.out.println("path.length() = " + path.length());
        System.out.println(path.lastIndexOf(File.separator+"test"));
        System.out.println(path.substring(0,path.lastIndexOf(File.separator+"test")));;
    }
}
