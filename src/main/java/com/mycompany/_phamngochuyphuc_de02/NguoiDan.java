/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._phamngochuyphuc_de02;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author admin
 */
public class NguoiDan {
    private static int dem;
    private int maND=++dem;
    private String hoTen;
    private LocalDate namSinh;
    

    public NguoiDan(String hoTen, LocalDate namSinh) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    @Override
    public String toString() {
        return maND+"-"+hoTen+"-"+namSinh;
    }

    
    
    /**
     * @return the maND
     */
    public int getMaND() {
        return maND;
    }

    /**
     * @param maND the maND to set
     */
    public void setMaND(int maND) {
        this.maND = maND;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the namSinh
     */
    public LocalDate getNamSinh() {
        return namSinh;
    }

    /**
     * @param namSinh the namSinh to set
     */
    public void setNamSinh(LocalDate namSinh) {
        this.namSinh = namSinh;
    }
   
    
}
