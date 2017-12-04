/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.rivaldy.WindowApp.Model;

import java.util.Date;

/**
 *
 * @author RomyRivaldy
 */
public class Delivery {
    private String noPaket;
    private String tujuan;
    private String jenisBarang;
    private Double beratBarang;
    private Date tglKirim;
    private Dimention dimensi;
    private String tipePaket;
    private Boolean asuransi;
    private Double hargaBarang;
    private String metodePembayaran;

    public String getNoPaket() {
        return noPaket;
    }

    public void setNoPaket(String noPaket) {
        this.noPaket = noPaket;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public Double getBeratBarang() {
        return beratBarang;
    }

    public void setBeratBarang(Double beratBarang) {
        this.beratBarang = beratBarang;
    }

    public Date getTglKirim() {
        return tglKirim;
    }

    public void setTglKirim(Date tglKirim) {
        this.tglKirim = tglKirim;
    }

    public Dimention getDimensi() {
        return dimensi;
    }

    public void setDimensi(Dimention dimensi) {
        this.dimensi = dimensi;
    }

    public String getTipePaket() {
        return tipePaket;
    }

    public void setTipePaket(String tipePaket) {
        this.tipePaket = tipePaket;
    }

    public Boolean getAsuransi() {
        return asuransi;
    }

    public void setAsuransi(Boolean asuransi) {
        this.asuransi = asuransi;
    }

    public Double getHargaBarang() {
        return hargaBarang;
    }

    public void setHargaBarang(Double hargaBarang) {
        this.hargaBarang = hargaBarang;
    }

    @Override
    public String toString() {
        return this.tujuan;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public void setMetodePembayaran(String metodePembayaran) {
        this.metodePembayaran = metodePembayaran;
    }
    
    
}
