/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._phamngochuyphuc_de02;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TramYTe extends DichVu{
    private int soPhongKham;
    private String dSChuyenKhoa;

    public TramYTe(String tenDV, LocalDate namXD, LocalDate ngayKhaiThac, int soPhongKham, String dSChuyenKhoa) {
        super(tenDV, namXD, ngayKhaiThac);
        this.soPhongKham = soPhongKham;
        this.dSChuyenKhoa = dSChuyenKhoa;
    }

    @Override
    public String toString(){
        return "Ma dich vu: "+this.maDV+", Ten dich vu: "+this.tenDV+", nam xay dung: "+this.namXD+", Ngay khai thac: "+this.ngayKhaiThac+", so phong kham: "+this.soPhongKham+", DS chuyen khoa: "+this.dSChuyenKhoa;
    }
    
    /**
     * @return the soPhongKham
     */
    public int getSoPhongKham() {
        return soPhongKham;
    }

    /**
     * @param soPhongKham the soPhongKham to set
     */
    public void setSoPhongKham(int soPhongKham) {
        this.soPhongKham = soPhongKham;
    }

    /**
     * @return the dSChuyenKhoa
     */
    public String getdSChuyenKhoa() {
        return dSChuyenKhoa;
    }

    /**
     * @param dSChuyenKhoa the dSChuyenKhoa to set
     */
    public void setdSChuyenKhoa(String dSChuyenKhoa) {
        this.dSChuyenKhoa = dSChuyenKhoa;
    }

    
    
    
}
