package com.stempien.umieszliczyc;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class HelloController {
    public Label lblPierwszaLiczba;
    public Label lblDrugaLiczba;
    public Label lblZnak;
    public TextField txtPisz;
    public Label lblPunkty;
    public Button btnNastepne;

    public void btnNastepneClick(ActionEvent actionEvent) {
        int punkty = 0;
        Random random = new Random();
        int liczba1 = random.nextInt(99) + 1;
        lblPierwszaLiczba.setText("" + liczba1);
        int liczba2 = random.nextInt(99) + 1;
        lblDrugaLiczba.setText("" + liczba2);
        int dzialanie = random.nextInt(3) + 1;
        int wynik = 0;
        if (dzialanie == 1) {
            lblZnak.setText("+");
            wynik = liczba1 + liczba2;
        }
        else if (dzialanie == 2) {
           lblZnak.setText("-");
            wynik = liczba1 - liczba2;
        }
        else if (dzialanie == 3) {
            lblZnak.setText("*");
            wynik = liczba1 * liczba2;
        }
       String wynikUzykownikaTxt = txtPisz.getText();
        int wynikUzykownikaLiczba = Integer.parseInt(wynikUzykownikaTxt);
if (wynik == wynikUzykownikaLiczba){
    punkty = punkty + 5;
}
    else{
        punkty = punkty - 10;
    }
    lblPunkty.setText("" + punkty);
    }
}