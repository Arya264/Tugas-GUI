/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.bio.model;
/**
 * @author 13020220078
 * Nama : Muh.Yusran
 * Kelas : A2
 */
public class Jurusan {
    private String id;
    private String nama;
    public Jurusan (String id, String nama){
        this.nama=nama;
        this.id=id;
    }

    public String getId(){ 
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    @Override
    public String toString() {
        return "Jurusan(" + "id=" + id + ", nama=" + nama+'}';
    }
}