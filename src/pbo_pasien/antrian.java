/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo_pasien;

/**
 *
 * @author ASUS
 */
public class antrian {
    private int nomorAntrian = 0;
    private final int JUMLAH_MAKSIMAL_PASIEN = 50;
    private pasien[] daftarPasien = new pasien[JUMLAH_MAKSIMAL_PASIEN];
    
    public void mendaftar(pasien retri) throws Exception{
        if (nomorAntrian < JUMLAH_MAKSIMAL_PASIEN){
            daftarPasien [nomorAntrian] = retri;
            nomorAntrian++;
        } else {
            throw new Exception("Antrian Penuh!");
            
        }
    }   
}
