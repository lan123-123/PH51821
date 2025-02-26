package com.example.kiemthu1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tinhTongTest {

    //biên min và max
    @Test
    public void test1(){
        Assertions.assertEquals(2, tinhTong.tong(new int[]{1, 1}));
    }
    @Test
    public void test2(){
        Assertions.assertEquals(8, tinhTong.tong(new int[]{4, 3}));
    }

    @Test
    public void test3(){
        Assertions.assertEquals(4, tinhTong.tong(new int[]{1, 1}));
    }
    //tương đương các số âm
    @Test
    public void test4(){
        Assertions.assertEquals(-4, tinhTong.tong(new int[]{1, 1}));
    }

}
