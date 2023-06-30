package controllers;

import service.ShopService;
import view.AppView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

public class CatalogListener implements MouseListener {
    private final JPanel panel;
    private final AppView appView;
    private final ShopService shopService; //Catalog.size получить можем
    private final JButton back; //Кнопка возрощающая нас на главный экран ОПЯТЬ ТАКИ ВАЖНО

    /*Класс CatalogListener является слушателем событий.
    Он используется для обработки событий, связанных с каталогом товаров.*/
    public CatalogListener(JPanel panel, AppView appView,ShopService shopService,JButton back) {
        this.shopService = shopService;
        this.back = back;
        this.panel = panel;
        this.appView = appView;
    }


    @Override
    public void mouseClicked(MouseEvent e) {//Ну тут думаю объяснять не стоит, но ниже очень даже!
        panel.removeAll();
        panel.setVisible(false);
        panel.setVisible(true);
        //Добавляем на панель Catalog.getChildrenArrButtons т.е кнопочки
        for (int i = 0; i < appView.children.get(0).getChildrenArrButtons().size(); i++) {
            appView.children.get(0).getChildrenArrButtons().get(i).setVisible(true);
            panel.add(appView.children.get(0).getChildrenArrButtons().get(i));
        }
        panel.add(back);
        //Привязываем обработчик событий для кнопки AddToCart
        panel.getComponent(shopService.getCatalog().size()).addMouseListener(new AddToCartListener(panel,appView,back,shopService));
    }
    //Просто переопределили
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
