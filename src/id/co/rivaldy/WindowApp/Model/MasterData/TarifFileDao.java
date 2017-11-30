/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.rivaldy.WindowApp.Model.MasterData;

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
public class TarifFileDao {

    public static List<MasterDataKurir> getListData() {
        List<MasterDataKurir> dataList = new ArrayList();
        try {
            Scanner scan = new Scanner(new File("E:/Java/tarif.txt"));
            while (scan.hasNextLine()) {
                MasterDataKurir mdKurir = new MasterDataKurir();
                String line = scan.nextLine();
                String[] data = line.split(",");
                mdKurir.setDestination(data[0]);
                mdKurir.setRegulerService(Double.parseDouble(data[1]));
                mdKurir.setKilatService(Double.parseDouble(data[2]));
                mdKurir.setSameDayService(Double.parseDouble(data[3]));
                mdKurir.setOneNightService(Double.parseDouble(data[4]));
                mdKurir.setHolidayService(Double.parseDouble(data[5]));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TarifFileDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataList;
    }
}
