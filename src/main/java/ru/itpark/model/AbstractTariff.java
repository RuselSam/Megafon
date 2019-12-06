package ru.itpark.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class AbstractTariff {
    private int id;
    private String name;
    private int price;
    private String period;
    private int internet;

}
