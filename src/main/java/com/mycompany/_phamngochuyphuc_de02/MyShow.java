/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._phamngochuyphuc_de02;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class MyShow {
    public static void main(String[] args) {
        QLDichVu qldv = new QLDichVu();
        
        DichVu dv1 = new BaiDoXe("A Thao", LocalDate.of(2020, 4, 14), LocalDate.of(2021, 1, 1), 100, "Thong Nhat");
        DichVu dv2 = new TramYTe("Gia Tan 3", LocalDate.of(2017, 2, 4), LocalDate.of(2079, 1, 1), 12, "Kham mat, kham tim, kham rang");
        
        qldv.themDV(dv1, dv2);
        qldv.hienThi();
        //qldv.hienThiDVKhongQua20Nam();
        
        System.out.println("-----------------------");
        qldv.timKiem("A Thao");
        qldv.hienThi();
        
    }
}
