/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan57.vehicle;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk menampilkan spesifikasi sebuah kendaraan khususnya
 *            sepeda dan skateboard, mulai dari brand, model, jumlah gear
 *            (sepeda) dan panjang skateboard.
 */
public class Vehicle {
    private String myBrand;
    private String myModel;

    public Vehicle() {
    
    }

    public String getMyBrand() {
        return myBrand;
    }

    public void setMyBrand(String myBrand) {
        this.myBrand = myBrand;
    }


    public String getMyModel() {
        return myModel;
    }

    public void setMyModel(String myModel) {
        this.myModel = myModel;
    }
}
