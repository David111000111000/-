package controllers;

import service.ShopService;
import view.AppView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ShopController {
    private final JFrame frame;
    private final JPanel panel;
    private final ArrayList<Component> parentsButton; // =  В будущем получим кнопки от Order, Catalog и Cart
    private final JButton back;
    private final AppView appView;
    private final ShopService shopService;

    public ShopController(AppView appView, ShopService shopService) {
        this.appView = appView;
        this.shopService = shopService;
        frame = new JFrame(appView.title);
        panel = new JPanel();
        frame.getContentPane().add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        parentsButton = new ArrayList<Component>();
        back = new JButton("Back"); //А ВОТ И ОНА! В самое начало программы
    }
    public void run() {
        frame.setVisible(true);
        //Заполняем ArrayList кнопками
        for (int i = 0; i < appView.children.size(); i++) {
            parentsButton.add(appView.children.get(i).getJButton());
        }
        //Оброботчик нажатия на кнопку "Back"
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.removeAll();
                panel.setVisible(false);
                panel.setVisible(true);
                panelAdd(parentsButton);
            }
        });
        panelAdd(parentsButton); //Добавляем кнопки Catalog, Cart, Order

        new AllListener(panel,appView,shopService,back); // Класс ответственный за нажатия
    }
    //Метод для добавления ArrayList<Component> на панель
    private  void panelAdd(ArrayList<Component> jButtons){
        for (int i = 0; i < jButtons.size(); i++) {
            panel.add(jButtons.get(i));
        }
    }
}

