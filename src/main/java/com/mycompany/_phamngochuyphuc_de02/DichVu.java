/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._phamngochuyphuc_de02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public abstract class DichVu {
    protected static int dem=1;
    protected String maDV;
    protected String tenDV;
    protected LocalDate namXD;
    protected LocalDate ngayKhaiThac;
    protected List<NguoiDan> nd = new ArrayList<>();
    
    public DichVu(String tenDV, LocalDate namXD, LocalDate ngayKhaiThac){
        this.maDV=String.format("CITY0000%d", dem++);
        this.tenDV=tenDV;
    }
    
    public void dKNguoiDan(NguoiDan nd){
        this.nd.add(nd);
    }
    
    @Override
    public String toString(){
        return "Ma dich vu: "+this.maDV+", Ten dich vu: "+this.tenDV+", nam xay dung: "+this.namXD+", Ngay khai thac: "+this.ngayKhaiThac;
        
    }

    /**
     * @return the maDV
     */
    public String getMaDV() {
        return maDV;
    }

    /**
     * @param maDV the maDV to set
     */
    public void setMaDV(String maDV) {
        this.maDV = maDV;
    }

    /**
     * @return the tenDV
     */
    public String getTenDV() {
        return tenDV;
    }

    /**
     * @param tenDV the tenDV to set
     */
    public void setTenDV(String tenDV) {
        this.tenDV = tenDV;
    }

    /**
     * @return the namXD
     */
    public LocalDate getNamXD() {
        return namXD;
    }

    /**
     * @param namXD the namXD to set
     */
    public void setNamXD(LocalDate namXD) {
        this.namXD = namXD;
    }

    /**
     * @return the ngayKhaiThac
     */
    public LocalDate getNgayKhaiThac() {
        return ngayKhaiThac;
    }

    /**
     * @param ngayKhaiThac the ngayKhaiThac to set
     */
    public void setNgayKhaiThac(LocalDate ngayKhaiThac) {
        this.ngayKhaiThac = ngayKhaiThac;
    }

    /**
     * @return the nd
     */
    public List<NguoiDan> getNd() {
        return nd;
    }

    /**
     * @param nd the nd to set
     */
    public void setNd(List<NguoiDan> nd) {
        this.nd = nd;
    }
    
}
