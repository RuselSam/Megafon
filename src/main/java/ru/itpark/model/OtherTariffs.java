package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OtherTariffs extends AbstractTariff {
    private boolean unlimitedCalls;
    private boolean internetCapacity;

    public OtherTariffs(int id, String name, int price, String period, int internet, boolean unlimitedCalls, boolean internetCapacity) {
        super(id, name, price, period, internet);
        this.unlimitedCalls = unlimitedCalls;
        this.internetCapacity = internetCapacity;
    }

    @Override
    public String toString() {
        String result;
        result = "Тариф: " + super.getName() + "\n";
        result += "Цена: " + super.getPrice() + " " + super.getPeriod() + "\n";
        if (internetCapacity == true) {
            if (super.getInternet() > 0) {
                result += getInternet() + " ГБ инетрнета" + "\n";
            } else {
                result += "Безлимитный интернет" + "\n";
            }
        } else {
            return result;
        }
        if (unlimitedCalls == true) {
            result += "Безлимитные звонки внутри сети";
        } else {
            return result;
        }
        return result + "\n";
    }
}
