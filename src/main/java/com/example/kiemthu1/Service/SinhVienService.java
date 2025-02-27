package com.example.kiemthu1.Service;

import com.example.kiemthu1.Model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> sinhVien = new ArrayList<>();
    //ADD
    public void addSinhVien(SinhVien sv){
        sinhVien.add(sv);
    }
    //DELETE
    public boolean deleteSinhVien(String ma){
        return sinhVien.removeIf(sv -> sv.getMaSV().equals(ma));
    }
    //UPDATE
    public void updateSinhVien(SinhVien sv){
        if (sv.getMaSV()==null || sv.getMaSV().isBlank()){
            throw new IllegalArgumentException("MaSV is null or empty");
        }

        if (sv.getTen()==null || sv.getTen().isBlank()){
            throw new IllegalArgumentException("MaSV is null or empty");
        }

        if (sv.getChuyenNganh()==null || sv.getChuyenNganh().isBlank()){
            throw new IllegalArgumentException("MaSV is null or empty");
        }
        for (SinhVien s : sinhVien){
            if (s.getMaSV().equals(sv.getMaSV())){
                s.setTen(sv.getTen());
                s.setTuoi(sv.getTuoi());
                s.setDiemTrungBinh(sv.getDiemTrungBinh());
                s.setHocKy(sv.getHocKy());

            }
        }


    }

}
