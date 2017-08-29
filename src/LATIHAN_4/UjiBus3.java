/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LATIHAN_4;

/**
 *
 * @author SMK TELKOM
 */
public class UjiBus3 {
    public static void main(String[] args){
        Bus3 Bus = new Bus3(5);
            Bus.addpenumpang(17);
            Bus.addpenumpang(24);
            Bus.cetakpenumpang();
            
            Bus.addpenumpang (2);
            Bus.cetakpenumpang();
            
            Bus.addpenumpang(1);
            Bus.cetakpenumpang();
            
            Bus.addpenumpang(2);
            Bus.cetakpenumpang();
            
            Bus.addpenumpang(2);
            Bus.cetakpenumpang();
            
    }
}
