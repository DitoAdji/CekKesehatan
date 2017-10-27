/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cekkesehatan;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author DITO
 */
public class FXMLKesehatanController implements Initializable {

    @FXML
    private RadioButton rdlaki;
    @FXML
    private ToggleGroup Pilihan;
    @FXML
    private RadioButton rdperempuan;
    @FXML
    private JFXTextField beratbadan;
    @FXML
    private JFXTextField tinggibadan;
    @FXML
    private JFXTextField nama;
    @FXML
    private JFXTextField ideal;
    @FXML
    private JFXTextArea hasil;
    @FXML
    private JFXTextArea saran;
    @FXML
    private JFXButton proses;
    @FXML
    private JFXButton reset;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void buttonProses(ActionEvent event) {
        double ti,bt,jenkel = 0;
        ti = Double.valueOf(tinggibadan.getText());
        bt = Double.valueOf(beratbadan.getText());
        
        if (rdlaki.isSelected()){
        jenkel = (ti - 110);
        }else if (rdperempuan.isSelected()){
        jenkel = (ti - 100);
        }
        
        
        if (jenkel < bt){
        ideal.setText(""+jenkel);
        hasil.setText("Maaf "+ nama.getText()+"Sepertinya anda OverWeight");
        saran.setText("Banyak berolahraga");
        }else if (jenkel > bt) {
        ideal.setText(""+jenkel);
        hasil.setText("Maaf "+ nama.getText()+"Sepertinya anda UnderWeight");
        saran.setText("Banyak Makan");
        }else {
        ideal.setText(""+jenkel);
        hasil.setText("Hallo "+ nama.getText()+"Selamat anda ideal");
        saran.setText("Jaga pola makan anda dan olahraganya jangan lupa");
        }
    
        
    }

    @FXML
    private void buttonReset(ActionEvent event) {
    hasil.setText("");
    saran.setText("");
    ideal.setText("");
        nama.setText("");
        beratbadan.setText("");
        tinggibadan.setText("");
        rdlaki.setSelected(false);
        rdperempuan.setSelected(false);
        
        
    }
    
}
