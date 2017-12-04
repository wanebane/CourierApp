package id.co.rivaldy.WindowApp.DAO;

import id.co.rivaldy.WindowApp.Model.Delivery;
import id.co.rivaldy.WindowApp.Model.DeliveryService;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author RomyRivaldy
 */
public final class DeliveryServiceList {

    public static List<Delivery> kotaList(){
        List<Delivery> kotaL = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File(DeliveryServiceList.class.getResource("/id/co/rivaldy/WindowApp/Asset/tarif.txt").getFile()));
            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                String[] data = next.split(",");

                Delivery desc = new Delivery();
                desc.setTujuan(data[0]);
                kotaL.add(desc);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeliveryServiceList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return kotaL;
    }
    public static List<DeliveryService> servList() {
        List<DeliveryService> sList = new ArrayList<>();
        try {
            Scanner scan = new Scanner(new File(DeliveryServiceList.class.getResource("/id/co/rivaldy/WindowApp/Asset/tarif.txt").getFile()));
            while (scan.hasNextLine()) {
                String next = scan.nextLine();
                String[] data = next.split(",");

                DeliveryService desc = new DeliveryService();
                desc.setTujuan(data[0]);
                desc.setRegulerService(Double.parseDouble(data[1]));
                desc.setKilatService(Double.parseDouble(data[2]));
                desc.setSameDayService(Double.parseDouble(data[3]));
                desc.setOneNightService(Double.parseDouble(data[4]));
                desc.setHoliDayService(Double.parseDouble(data[5]));
                
                sList.add(desc);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DeliveryServiceList.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sList;
    }
}
