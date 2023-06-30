
import controllers.ShopController;
import data.data_source.cart.CartDataSource;
import data.data_source.cart.MockCartDataSourceImpl;
import data.data_source.catalog.CatalogDataSource;
import data.data_source.catalog.MockCatalogDataSourceImpl;
import data.data_source.order.MockOrderDataSourceImpl;
import data.data_source.order.OrderDataSource;
import service.ShopService;
import view.*;

import java.util.ArrayList;

import java.util.List;

public class main {
    //ТЕСТЫ! УРА!
    public static void main(String[] args) {
        CatalogDataSource catalogDataSource = new MockCatalogDataSourceImpl(); // Catalog
        CartDataSource cartDataSource = new MockCartDataSourceImpl(); // Cart
        OrderDataSource orderDataSource = new MockOrderDataSourceImpl(); // Order
        //Оперирующий работой с данными
        ShopService shopService = new ShopService(catalogDataSource,cartDataSource,orderDataSource);
        //Внешность Cart
        CartView cartView = new CartView(shopService);
        //Внешность Catalog и AddToCartView
        CatalogView catalogView = new CatalogView(shopService,new ArrayList<>(List.of(new AddToCartView())));
        //Соединение всей view
        MainView mainView = new MainView(new ArrayList<>(List.of(catalogView,cartView,new OrderView())));

        //Главный контролер
        new ShopController(mainView,shopService).run();
    }
   // Поставьте пять пожалуйста:)
}