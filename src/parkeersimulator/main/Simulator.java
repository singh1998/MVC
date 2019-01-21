package parkeersimulator.main;


import parkeersimulator.model.Model;
import parkeersimulator.view.CarParkView;


import javax.swing.*;
import java.awt.*;


public class Simulator extends JFrame {
   private Model model;
   private CarParkView carParkView;


    public Simulator(){
        this.setTitle("parkeersimulator");
        model=new Model(3,6,30);
        carParkView = new CarParkView(model);
        setLayout(new BorderLayout());
        add(carParkView,BorderLayout.CENTER);
        pack();

        setVisible(true);

        carParkView.updateView();




    }



}