/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._phamngochuyphuc_de02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QLDichVu {
    private List<DichVu> ds = new ArrayList<>();

    public void themDV(DichVu... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void timKiem(String kw){
        this.ds.stream().filter(dv->dv.getTenDV().contains(kw)).collect(Collectors.toList());
    }
    
    public void hienThiDVKhongQua20Nam(){
        this.ds.forEach(dv->{
            if(dv.getNgayKhaiThac().getMonthValue()<=240)
                System.out.println(dv);
        });
    }
    
    public void hienThi(){
        this.ds.forEach(System.out::println);
    }
    
    
    
    /**
     * @return the ds
     */
    public List<DichVu> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<DichVu> ds) {
        this.ds = ds;
    }
    
}
