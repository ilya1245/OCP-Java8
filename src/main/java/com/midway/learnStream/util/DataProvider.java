package com.midway.learnStream.util;

import com.midway.learnStream.dto.Passenger;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class DataProvider {

    public static List<Passenger> getPassengers() {
        List<Passenger> trainPassengers = null;
        try {
            trainPassengers = new CsvToBeanBuilder(new FileReader(Constants.PASSENGER_TRAIN_FILE_PATH))
                    .withType(Passenger.class)
                    .build()
                    .parse();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return trainPassengers;

    }
}
