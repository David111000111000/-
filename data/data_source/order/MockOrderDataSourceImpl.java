package data.data_source.order;

import data.models.Order;

public class MockOrderDataSourceImpl extends OrderDataSource{
    private Order order;
    //Создаем заказ
    @Override
    public void createOrder(Order order) {
        this.order = order;
    }
}
