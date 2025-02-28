package com.example.kiemthu1;

import com.example.kiemthu1.Model.SinhVien;
import com.example.kiemthu1.Service.SinhVienService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SinhVienTest {

    private SinhVienService sinhVienService;
    private SinhVien sinhVien;
    @BeforeEach
    public void setUp() {
        sinhVienService = new SinhVienService();
        sinhVienService.addSinhVien(new SinhVien("SV1", "NguyenVanA", 4, 5, 7, "it"));
        sinhVienService.addSinhVien(new SinhVien("SV2", "NguyenVanA", 4, 5, 7, "it"));

    }
    @Test
    public void testSinhVien(){
        sinhVien = new SinhVien("NV1", "Tong Thi Hong Lan", 19, 8, 5, "it");
        sinhVienService.updateSinhVien(sinhVien);
        assertEquals("NV1", sinhVien.getMaSV());
        assertEquals("Tong Thi Hong Lan", sinhVien.getTen());
        assertEquals(19, sinhVien.getTuoi());
        assertEquals(8, sinhVien.getDiemTrungBinh());
        assertEquals(5, sinhVien.getHocKy());
        assertEquals("it", sinhVien.getChuyenNganh());

    }
    //trống mã tên , chuyên ngành
    //add
    //delete
    @Test
    public void test1(){
        sinhVien = new SinhVien("NV1", "Tong Thi Hong Lan", 19, 8, 5, "it");
        sinhVienService.updateSinhVien(sinhVien);
        assertEquals("NV1", sinhVien.getMaSV());
        assertEquals("Tong Thi Hong Lan", sinhVien.getTen());
        assertEquals(19, sinhVien.getTuoi());
        assertEquals(8, sinhVien.getDiemTrungBinh());
        assertEquals(5, sinhVien.getHocKy());
        assertEquals("it", sinhVien.getChuyenNganh());
    }
    @Test
    public void test2(){
        sinhVien = new SinhVien("", "Tong Thi Hong Lan", 19, 8, 5, "it");
        Exception exception = Assertions.assertThrows(IllegalAccessException.class, () ->{
            sinhVienService.updateSinhVien(sinhVien);
        });
    }
    @Test
    public void test3(){
        sinhVien = new SinhVien("NV1", "", 19, 8, 5, "it");
        Exception exception = Assertions.assertThrows(IllegalAccessException.class, () ->{
            sinhVienService.updateSinhVien(sinhVien);
        });
    }
    @Test
    public void test4(){
        sinhVien = new SinhVien("NV1", "Tong Thi Hong Lan", 19, -4, 5, "it");
        Exception exception = Assertions.assertThrows(IllegalAccessException.class, () ->{
            sinhVienService.updateSinhVien(sinhVien);
        });

    }

    //add sinh viên
    @Test
    public void testAdd(){
        sinhVien = new SinhVien("NV2", "Tong Thi Hong Lan", 19, 8, 5, "it");
        sinhVienService.addSinhVien(sinhVien);
        assertEquals("NV2", sinhVien.getMaSV());
    }

    //delete sinhVien
    @Test
    public void testDeleteSVTonTai(){
        sinhVienService.deleteSinhVien("NV1");
        assertEquals(2, sinhVienService.getSinhVien().size());
    }

    @Test
    public void testDeleteSVKTonTai(){
        sinhVienService.deleteSinhVien("NV2");
        assertEquals(1, sinhVienService.getSinhVien().size());
    }






}
