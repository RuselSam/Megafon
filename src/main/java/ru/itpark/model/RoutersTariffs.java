package ru.itpark.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RoutersTariffs extends AbstractTariff {
    public RoutersTariffs(int id, String name, int price, String period, int internet) {
        super(id, name, price, period, internet);
    }

    @Override
    public String toString() {
        String result;
        result = "Тариф: " + super.getName() + "\n";
        result += "Цена: " + super.getPrice() + " " + super.getPeriod() + "\n";
        if (super.getInternet() > 0) {
            result += " 1 МБ за 2,5 руб " + "\n";
        } else {
            result += "Безлимитный интернет" + "\n";
        }
        return result + "\n";
    }
}
