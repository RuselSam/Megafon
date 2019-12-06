package ru.itpark.service;

import ru.itpark.model.AbstractTariff;
import ru.itpark.model.MainsTariffs;
import ru.itpark.model.OtherTariffs;
import ru.itpark.model.RoutersTariffs;

import java.util.ArrayList;

public class TariffService {
    private ArrayList<AbstractTariff> Tariffs = new ArrayList<>();

    public void addTariff(MainsTariffs tariffs) {
        Tariffs.add(tariffs);
    }

    public void addTariff(RoutersTariffs tariffs) {
        Tariffs.add(tariffs);
    }

    public void addTariff(OtherTariffs tariffs) {
        Tariffs.add(tariffs);
    }

    public String getTariff() {
        return Tariffs.toString();
    }
}
