package data.models;

public class CartItem {

    public final Product product; //Продукт который есть в корзине
    //Сеттер :)
    public CartItem(Product product) {
        this.product = product;
    }
}
