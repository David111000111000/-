package data.data_source.order;

import data.models.Order;

public abstract class OrderDataSource {
    //Устанавливаем самый минимум для всех объектов OrderDataSourceImpl
    public abstract void createOrder(Order order);
}
