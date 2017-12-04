/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.rivaldy.WindowApp.DAO;

/**
 *
 * @author RomyRivaldy
 */
public final class PackageNo {

    public static String getNoPaket() {
        String noPaketDeliv = "";

        int code = (int) Math.ceil(Math.random() * 10000000) * 1;
        noPaketDeliv += code;
        return noPaketDeliv;
    }
}
