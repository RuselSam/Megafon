package ru.itpark;


import ru.itpark.model.MainTariff;
import ru.itpark.model.OtherTariff;
import ru.itpark.model.RouterTariff;
import ru.itpark.service.TariffService;

public class Main {
    public static void main(String[] args) {
        TariffService tariffService = new TariffService();
        tariffService.addProducts(new MainTariff(1, "Включайся", 500, "в месяц", 15, 600, 300));
        tariffService.addProducts(new MainTariff(2, "Мой Мегафон", 450, "в месяц", 0, 450, 60));
        tariffService.addProducts(new RouterTariff(3, "Твой безлимит", 5000, "за год", 1));
        tariffService.addProducts(new OtherTariff(4, "Не мой Мегафон", 350, "за месяц", 0, true, true));
        System.out.println(tariffService.getTariff());
    }

}
