/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dependence;

/**
 *
 * @author A455LF-WIN10
 */
public class Motor {
    private String nama;
    private String jenis;
    private String warna;
    
    Motor ( String nama, String jenis, String warna){
        this.nama = nama;
        this.jenis = jenis;
        this.warna = warna;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getJenis(){
        return jenis;
    }
    
    public void setJenis(String jenis){
        this.jenis = jenis;
    }
    
    public String getWarna(){
        return warna;
    }
    public void setWarna(String warna){
        this.warna = warna;
    }
    public void jualMotor(){
        System.out.print("Motor dijual ");
    }
}
