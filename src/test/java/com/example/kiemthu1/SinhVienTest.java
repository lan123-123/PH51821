package com.example.kiemthu1;

import com.example.kiemthu1.Model.SinhVien;
import com.example.kiemthu1.Service.SinhVienService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



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
    //tống mã tên , chuyên ngành
    //add
    //delete





}
