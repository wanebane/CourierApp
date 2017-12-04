package id.co.rivaldy.WindowApp.DAO;

import id.co.rivaldy.WindowApp.Model.Delivery;
import id.co.rivaldy.WindowApp.Model.DeliveryService;
import java.util.List;

/**
 *
 * @author RomyRivaldy
 */
public class PaymentCost {

    private Double asuransiCost = 0.03;

    public Double hitungCost(Delivery devy) {
        Double totalCost = 0.0;

        Double hargaTujuan;
        Double beratBarang = devy.getBeratBarang();
        Double hargaBarang = devy.getHargaBarang();

        List<DeliveryService> listServ = DeliveryServiceList.servList();

        for (DeliveryService deliveryService : listServ) {

            if (deliveryService.getTujuan().equalsIgnoreCase(devy.getTujuan())) {
                if (devy.getTipePaket().equalsIgnoreCase("reguler")) {
                    hargaTujuan = deliveryService.getRegulerService();
                    if (devy.getAsuransi()) {
                        totalCost = (hargaTujuan * beratBarang) + (hargaBarang * asuransiCost);
                        System.out.println("Total Cost : " + totalCost);
                    } else {
                        totalCost = hargaTujuan * beratBarang;
                    }
                }
                if (devy.getTipePaket().equalsIgnoreCase("kilat")) {
                    hargaTujuan = deliveryService.getKilatService();
                    if (devy.getAsuransi()) {
                        totalCost = (hargaTujuan * beratBarang) + (hargaBarang * asuransiCost);
                        System.out.println("Total Cost : " + totalCost);
                    } else {
                        totalCost = hargaTujuan * beratBarang;
                    }
                }
                if (devy.getTipePaket().equalsIgnoreCase("sds")) {
                    hargaTujuan = deliveryService.getSameDayService();
                    if (devy.getAsuransi()) {
                        totalCost = (hargaTujuan * beratBarang) + (hargaBarang * asuransiCost);
                        System.out.println("Total Cost : " + totalCost);
                    } else {
                        totalCost = hargaTujuan * beratBarang;
                    }
                }
                if (devy.getTipePaket().equalsIgnoreCase("ons")) {
                    hargaTujuan = deliveryService.getOneNightService();
                    if (devy.getAsuransi()) {
                        totalCost = (hargaTujuan * beratBarang) + (hargaBarang * asuransiCost);
                        System.out.println("Total cost : " + totalCost);
                    } else {
                        totalCost = hargaTujuan * beratBarang;
                    }
                }
                if (devy.getTipePaket().equalsIgnoreCase("hds")) {
                    hargaTujuan = deliveryService.getHoliDayService();
                    if (devy.getAsuransi()) {
                        totalCost = (hargaTujuan * beratBarang) + (hargaBarang * asuransiCost);
                        System.out.println("Total cost : " + totalCost);
                    } else {
                        totalCost = hargaTujuan * beratBarang;
                    }
                }
            }
        }

        return totalCost;
    }
}
