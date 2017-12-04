/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.rivaldy.WindowApp;

import id.co.rivaldy.WindowApp.DAO.PaymentCost;
import id.co.rivaldy.WindowApp.Model.Delivery;
import id.co.rivaldy.WindowApp.Model.Dimention;
import java.util.Date;

/**
 *
 * @author RomyRivaldy
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dimention dimensi = new Dimention();
        dimensi.setPanjang(20.5);
        dimensi.setLebar(10.2);
        dimensi.setTinggi(2.0);

        Delivery deliv = new Delivery();
        deliv.setTujuan("bandung");
        deliv.setJenisBarang("Document");
        deliv.setBeratBarang(22.0);
        //deliv.setTglKirim(new Date());
        deliv.setDimensi(dimensi);
        deliv.setTipePaket("reguler");
        deliv.setAsuransi(true);
        deliv.setHargaBarang(250000.0);

        PaymentCost payments = new PaymentCost();
        double payment = payments.hitungCost(deliv);

        System.out.println("Cost : " + payment);
        System.out.println("Tujuan : " + deliv.getTujuan());
        System.out.println("Jenis : " + deliv.getJenisBarang());
        System.out.println("Berat : " + deliv.getBeratBarang());
        System.out.println("Total bayar : " + payment);
    }

}
