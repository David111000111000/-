package view;


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public abstract class  AppView {
    public final String title; // Текст основной кнопки (getJButton)

    public final ArrayList<AppView> children; //Дочерние классы. Больше сказать нечего :)
    public AppView( String title, ArrayList<AppView> children) {
        this.title = title;
        this.children = children;
    }
    //То что будет отоброжаться после нажатия на getJButton
    public abstract ArrayList<Component> getChildrenArrButtons();

    public abstract JButton getJButton(); //Получение основной кнопки

}
