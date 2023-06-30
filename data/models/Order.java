package data.models;

import data.models.CartItem;

import java.awt.*;
import java.util.ArrayList;

public class Order {

    public final String name; //Имя заказчика
    public final String address; //Адресс заказчика
    public final ArrayList<Component> cart; // Корзина с товарами заказчика
    //Конструктор
    public Order(String name, String address, ArrayList<Component> cart) {
        this.name = name;
        this.address = address;
        this.cart = cart;
    }
}
