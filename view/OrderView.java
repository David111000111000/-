package view;


import service.ShopService;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class OrderView extends AppView{
    public OrderView() {
        super("Order",new ArrayList<>());
    }

    //реакция OrderView.getJButton (выводит в окно)
    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        ArrayList<Component> components = new ArrayList<>();
        JTextField noInput = new JTextField("Введите Имя: ",10);
        noInput.setFocusable(false);
        JTextField input = new JTextField(" ",6);
        JTextField noInput2 = new JTextField("Введите Aдрес: ",10);
        noInput2.setFocusable(false);
        JTextField input2 = new JTextField(" ",10);//Важная строка! Она данные получает
        JButton jButton = new JButton("Enter");
        components.add(noInput);
        components.add(input);
        components.add(noInput2);
        components.add(input2);
        components.add(jButton);
        return components;
    }
    //ПОлучаем  основную кнопку класса
    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
