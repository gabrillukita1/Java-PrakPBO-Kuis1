/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Data_Calon {
    private String Nama;
    private String NIK;
    private double Nilai_Tulis;
    private double Nilai_Coding;
    private double Nilai_Wawancara;

    public double getNilai_Tulis() {
        return Nilai_Tulis;
    }

    public void setNilai_Tulis(double Nilai_Tulis) {
        this.Nilai_Tulis = Nilai_Tulis;
    }

    public double getNilai_Coding() {
        return Nilai_Coding;
    }

    public void setNilai_Coding(double Nilai_Coding) {
        this.Nilai_Coding = Nilai_Coding;
    }

    public double getNilai_Wawancara() {
        return Nilai_Wawancara;
    }

    public void setNilai_Wawancara(double Nilai_Wawancara) {
        this.Nilai_Wawancara = Nilai_Wawancara;
    }

    public Data_Calon(String Nama, String NIK, double Nilai_Tulis, double Nilai_Coding, double Nilai_Wawancara) {
        this.Nama = Nama;
        this.NIK = NIK;
        this.Nilai_Tulis = Nilai_Tulis;
        this.Nilai_Coding = Nilai_Coding;
        this.Nilai_Wawancara = Nilai_Wawancara;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }
}
