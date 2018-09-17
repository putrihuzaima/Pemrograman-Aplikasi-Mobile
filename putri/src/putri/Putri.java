/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package putri;

/**
 *
 * @author MRA
 */
public class Putri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int umur = 22;
        String paras = "cantik";
        String kepintaran = "gak pintar";

        if (paras == "cantik" && kepintaran == "pintar" && umur >= 20 && umur <= 23) {
            System.out.println("Pasti mau");
        } else if (paras == "cantik" && umur >= 20 && umur <= 23&&kepintaran == "gak pintar" ) {
            System.out.println("OK lah");
        } else if (umur >= 23 && paras == "cantik"&&kepintaran == "gak pintar") {
            System.out.println("Saya pikir dulu");
        } else {
            System.out.println("NO WAY !");
        }
    }

}
