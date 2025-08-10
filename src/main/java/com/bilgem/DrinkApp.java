package com.bilgem;
/**
 * Kahve sipariş uygulamasının ana sınıfı.
 */
public class DrinkApp {
    /**
     * Order service nesnesi ve Menu Service nesnelerini oluşturur.(SRP ye uyması için işlemler ayrı classlara bölündü)
     * MenuService nesnesini oluştururken OrderService i constructor'a gonderir.(Dependency Injection)
     * 
     */
    public void coffeeMachine() {

        OrderService orderService = new OrderService();
        MenuService menuService = new MenuService(orderService);
        menuService.displayMenu();

    }
}
