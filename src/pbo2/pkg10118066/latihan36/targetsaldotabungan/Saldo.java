/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan36.targetsaldotabungan;

/**
 *
 * @author DRAGON
 */
public class Saldo {
    public int SaldoAwal;    
    public int i;
    
    public void SaldoTabungan(){
           SaldoAwal = 3500000;
           i = 1;
           while (SaldoAwal < 6000000){
           SaldoAwal = SaldoAwal + (int)((float) SaldoAwal*0.08F);
            System.out.println("Saldo di bulan ke-"+ i+" Rp. "+ SaldoAwal);
            i++;
           }
    }
}
