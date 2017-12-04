package id.co.rivaldy.WindowApp.Model;

/**
 *
 * @author RomyRivaldy
 */
public class DeliveryService {

    private String tujuan;
    private Double regulerService;
    private Double kilatService;
    private Double sameDayService;
    private Double oneNightService;
    private Double holiDayService;

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public Double getRegulerService() {
        return regulerService;
    }

    public void setRegulerService(Double regulerService) {
        this.regulerService = regulerService;
    }

    public Double getKilatService() {
        return kilatService;
    }

    public void setKilatService(Double kilatService) {
        this.kilatService = kilatService;
    }

    public Double getSameDayService() {
        return sameDayService;
    }

    public void setSameDayService(Double sameDayService) {
        this.sameDayService = sameDayService;
    }

    public Double getOneNightService() {
        return oneNightService;
    }

    public void setOneNightService(Double oneNightService) {
        this.oneNightService = oneNightService;
    }

    public Double getHoliDayService() {
        return holiDayService;
    }

    public void setHoliDayService(Double holiDayService) {
        this.holiDayService = holiDayService;
    }

}
