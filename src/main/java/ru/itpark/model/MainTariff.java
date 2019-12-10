package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MainTariff extends AbstractTariff {
    private int minute;
    private int sms;

    public MainTariff(int id, String name, int price, String period, int internet, int minute, int sms) {
        super(id, name, price, period, internet);
        this.minute = minute;
        this.sms = sms;
    }

    @Override
    public String toString() {
        String result;
        result = "Тариф: " + super.getName() + "\n";
        result += "Цена: " + super.getPrice() + " " + super.getPeriod() + "\n";
        if (super.getInternet() > 0) {
            result += super.getInternet() + " ГБ интернета " + "\n";
        } else {
            result += "Безлимитный интернет" + "\n";
        }
        if (minute > 0) {
            result += minute + " минут" + "\n";
        } else {
            return result;
        }
        if (sms > 0) {
            result += sms + " СМС" + '\n';
        } else {
            return result;
        }
        return result + "\n";
    }
}
