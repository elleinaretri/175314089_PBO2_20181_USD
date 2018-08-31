/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien;

/**
 *
 * @author acer
 */
public class test {
    public static void main(String[] args) throws Exception {
        pasien ellen= new pasien();
        dokter dok = new dokter();
        
        ellen.setNama("Ellen");
        ellen.setAlamat("Klaten, Jawa Tengah");
        ellen.setTempatLahir("Klaten, Jawa Tengah");
        
        dok.setNama("Dr. Aldi Abram");
        dok.setNomorPegawai("1234356");
        dok.setAlamat("Paingan");
        dok.setTempatLahir("Surabaya");
        
        System.out.println("Data Pasien ");
        System.out.println("Nama Pasien                : " + ellen.getNama());
        System.out.print("No Rekam Medis      : " );
        try{
            ellen.setTahunLahir(1999);
            ellen.setBulanLahir(12);
            ellen.setTanggalLahir(12);
            ellen.setNoRekamMedis("ABR");
            ellen.getKode();
//            System.out.print("NO REKAM MEDIS : " );
            System.out.print(ellen.getNoRekamMedis());
            System.out.println("");
            System.out.print("TANGGAL KELAHIRAN   : ");
            ellen.getTanggalKelahiran();
            System.out.println("ALAMAT              : " + ellen.getAlamat());
            System.out.println("TEMPAT LAHIR        : " + ellen.getTempatLahir());
            System.out.println("====================================================");
        }catch (Exception ex){
            System.out.println(ex);
            
        }
        System.out.println("DATA DOKTER");
        System.out.println("NAMA                : " + dok.getNama());
        System.out.println("NO PEGAWAI          : " + dok.getNomorPegawai());
        System.out.println("ALAMAT              : " + dok.getAlamat());
        try {
            dok.setTanggalLahir(12);
            dok.setBulanLahir(2);
            dok.setTahunLahir(1989);
            System.out.print("TANGGAL LAHIR       : " );
            dok.getKelahiran();
        }catch (Exception ex){
            System.out.println(ex);
        }
        
        
        
        
        
        
    }
    
}
