package ru.itpark;


import ru.itpark.model.MainsTariffs;
import ru.itpark.model.OtherTariffs;
import ru.itpark.model.RoutersTariffs;
import ru.itpark.service.TariffService;

public class Main {
    public static void main(String[] args) {
        TariffService tariffService = new TariffService();
        tariffService.addTariff(new MainsTariffs(1, "Включайся", 500, "в месяц", 15, 600, 300));
        tariffService.addTariff(new MainsTariffs(2, "Мой Мегафон", 450, "в месяц", 0, 450, 60));
        tariffService.addTariff(new RoutersTariffs(3, "Твой безлимит", 5000, "за год", 1));
        tariffService.addTariff(new OtherTariffs(4, "Не мой Мегафон", 350, "за месяц", 0, true, true));
        System.out.println(tariffService.getTariff());
    }

}
