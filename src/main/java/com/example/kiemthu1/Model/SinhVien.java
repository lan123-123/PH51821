package com.example.kiemthu1.Model;

import lombok.*;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class SinhVien {
    private String maSV;
    private String ten;
    private Integer tuoi;
    private float diemTrungBinh;
    private Integer hocKy;
    private String chuyenNganh;

}
