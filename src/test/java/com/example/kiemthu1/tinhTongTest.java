package com.example.kiemthu1;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class tinhTongTest {

    //biên min và max
    //dương
    @Test
    public void test1(){
        Assertions.assertEquals(2, tinhTong.tong(new int[]{1, 1}));
    }
    //âm
    @Test
    public void test2(){
        Assertions.assertEquals(8, tinhTong.tong(new int[]{-4, 3}));
    }
    //rỗng
    @Test
    public void test3(){
        Assertions.assertEquals(0, tinhTong.tong(new int[]{}));
    }
    //tương đương các số âm
    //null
   


}
