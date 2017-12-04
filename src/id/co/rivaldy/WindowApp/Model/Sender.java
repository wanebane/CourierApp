package id.co.rivaldy.WindowApp.Model;

/**
 *
 * @author RomyRivaldy
 */
public class Sender {

    private String namaPengirim;
    private String noHp;
    private String provinsi;
    private String kota;
    private String alamat;
    private String kdPos;

    public String getNamaPengirim() {
        return namaPengirim;
    }

    public void setNamaPengirim(String namaPengirim) {
        this.namaPengirim = namaPengirim;
    }

    public String getNoHp() {
        return noHp;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKdPos() {
        return kdPos;
    }

    public void setKdPos(String kdPos) {
        this.kdPos = kdPos;
    }
}
