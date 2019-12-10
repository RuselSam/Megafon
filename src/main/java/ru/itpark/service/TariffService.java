package ru.itpark.service;

import ru.itpark.model.AbstractTariff;
import java.util.ArrayList;

public class TariffService {
    private ArrayList<AbstractTariff> Tariffs = new ArrayList<>();
    public void addProducts(AbstractTariff item){
        Tariffs.add(item);
    }

    public String getTariff() {
        return Tariffs.toString();
    }
}
