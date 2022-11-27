package com.midway.learnStream.dto;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class Passenger {
    @CsvBindByName(column = "PassengerId")
    private int id;

    @CsvBindByName(column = "Survived")
    private boolean survived;

    @CsvBindByName(column = "Pclass")
    private byte pClass;

    @CsvBindByName(column = "Name")
    private String name;

    @CsvBindByName(column = "Sex")
    private String sex;

    @CsvBindByName(column = "Age")
    private float age;

}
