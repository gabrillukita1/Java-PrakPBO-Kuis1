/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Divisi_Web extends Data_Calon implements Hasil_Seleksi{
    
    public Divisi_Web(String Nama, String NIK, double Nilai_Tulis, double Nilai_Coding, double Nilai_Wawancara) {
        super(Nama, NIK, Nilai_Tulis, Nilai_Coding, Nilai_Wawancara);
    }
    
    public double getNilaiTulis(){
        return super.getNilai_Tulis() * 0.40;
    }
    
    public double getNilaiCoding(){
        return super.getNilai_Coding() * 0.35;
    }
    
    public double getNilaiWawancara(){
        return super.getNilai_Wawancara() * 0.25;
    }
    
    public double getNilaiAkhir(){
        return this.getNilaiTulis() + this.getNilaiCoding() + this.getNilaiWawancara();
    }
    

    @Override
    public void Hasil_Seleksi() {
       if (this.getNilaiAkhir() >= 85){
            System.out.println("Nilai Akhir : "+this.getNilaiAkhir());
            System.out.println("KETERANGAN  : DITERIMA");
            System.out.println("Selamat kepada "+super.getNama()+" diterima di bagian Web Development");
        }
            
        else {
            System.out.println("Nilai Akhir : "+this.getNilaiAkhir());
            System.out.println("KETERANGAN  : DITOLAK");
            System.out.println("Mohon maaf kepada "+super.getNama()+" telah ditolak di bagian Web Development");
        }
    }
    
}
