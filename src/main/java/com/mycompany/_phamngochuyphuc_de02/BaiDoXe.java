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
public class BaiDoXe extends DichVu{
    private int soChoDo;
    private String khuVucDo;

    public BaiDoXe(String tenDV, LocalDate namXD, LocalDate ngayKhaiThac, int sochoDo, String khuVucDo) {
        super(tenDV, namXD, ngayKhaiThac);
        this.soChoDo=sochoDo;
        this.khuVucDo=khuVucDo;
    }

    @Override
    public String toString() {
        //System.out.println("Bai do xe: ");
        return "Ma dich vu: "+this.maDV+", Ten dich vu: "+this.tenDV+", nam xay dung: "+this.namXD+", Ngay khai thac: "+this.ngayKhaiThac+", So luong: "+soChoDo+", Khu vuc: "+khuVucDo;
    }

    
    
    /**
     * @return the soChoDo
     */
    public int getSoChoDo() {
        return soChoDo;
    }

    /**
     * @param soChoDo the soChoDo to set
     */
    public void setSoChoDo(int soChoDo) {
        this.soChoDo = soChoDo;
    }

    /**
     * @return the khuVucDo
     */
    public String getKhuVucDo() {
        return khuVucDo;
    }

    /**
     * @param khuVucDo the khuVucDo to set
     */
    public void setKhuVucDo(String khuVucDo) {
        this.khuVucDo = khuVucDo;
    }
    
    
}
