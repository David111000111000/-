package view;

import data.models.CartItem;
import service.ShopService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CartView extends AppView{
    public final ShopService shopService; //ПОлучение корзины

    public CartView(ShopService shopService) {
        super("Cart",new ArrayList<>());
        this.shopService = shopService;
    }
    //реакция CartView.getJButton на нажатие и вывод на окно
    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        return shopService.getCart();
    }
    //Метод для получения основной кнопки класса. А вот и он!
    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
