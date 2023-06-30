package view;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class MainView extends AppView{
    //Соеденитель CatalogView,CartView,OrderView
    public MainView(ArrayList<AppView> children) {
        super( "Магазин",children);
    }

    //возрощает Null потому что зачем? Елси срьезно, то не нужно просто что-то иное
    @Override
    public ArrayList<Component> getChildrenArrButtons() {
        return null;
    }
    //аналогично верхнему методу
    @Override
    public JButton getJButton() {
        JButton jButton = new JButton(title);
        return jButton;
    }
}
