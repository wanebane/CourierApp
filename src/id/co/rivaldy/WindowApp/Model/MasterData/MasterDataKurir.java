package id.co.rivaldy.WindowApp.Model.MasterData;

/**
 *
 * @author RomyRivaldy
 */
public class MasterDataKurir {

    private final double insurance = 0.03;

    private String deliveryType;
    private String destination;
    private double regulerService;
    private double kilatService;
    private double sameDayService;
    private double oneNightService;
    private double holidayService;

    public MasterDataKurir() {
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getRegulerService() {
        return regulerService;
    }

    public void setRegulerService(double regulerService) {
        this.regulerService = regulerService;
    }

    public double getKilatService() {
        return kilatService;
    }

    public void setKilatService(double kilatService) {
        this.kilatService = kilatService;
    }

    public double getSameDayService() {
        return sameDayService;
    }

    public void setSameDayService(double sameDayService) {
        this.sameDayService = sameDayService;
    }

    public double getOneNightService() {
        return oneNightService;
    }

    public void setOneNightService(double oneNightService) {
        this.oneNightService = oneNightService;
    }

    public double getHolidayService() {
        return holidayService;
    }

    public void setHolidayService(double holidayService) {
        this.holidayService = holidayService;
    }

    public double getInsurance() {
        return insurance;
    }
}
