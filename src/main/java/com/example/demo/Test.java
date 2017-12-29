package com.example.demo;

import java.nio.ByteBuffer;

/**
 * Created by lance on 2017/12/28.
 */
public class Test {

    public static void main(String[] args){
        ByteBuffer byteBuffer = ByteBuffer.allocate(6);
        byteBuffer.put((byte) 3);
        byteBuffer.position(0);
        byteBuffer.limit(1);
        byte bs = byteBuffer.get();
        System.out.println(byteBuffer);
        System.out.println(bs);
    }

}
