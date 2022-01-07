package ru.netology.radio.volumenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(10);

    @Test
    void showTotalAmountOfStations() {

        assertEquals(10, radio.setTotalStations());
    }

    Radio radioOne = new Radio();

    @Test
    public void setCurrentRadioStation() {

        assertEquals(0, radio.setCurrentRadioStation());

    }

    @Test
    public void getRadioStation() {

        radio.getRadioStation(10);

        assertEquals(0, radio.setCurrentRadioStation());

    }

    @Test
    public void getRadioStationZero() {

        radio.getRadioStation(-1);

        assertEquals(9, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationMax() {

        radio.getRadioStation(9);

        radio.switchRadioStation();

        assertEquals(0, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationStart() {

        radio.getRadioStation(1);

        radio.switchRadioStation();

        assertEquals(2, radio.setCurrentRadioStation());

    }


    @Test
    public void switchRadioStationStartZero() {

        radio.getRadioStation(0);

        radio.switchRadioStation();

        assertEquals(1, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationMid() {

        radio.getRadioStation(5);

        radio.switchRadioStation();

        assertEquals(6, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationBond() {

        radio.getRadioStation(8);

        radio.switchRadioStation();

        assertEquals(9, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOverMax() {

        radio.getRadioStation(10);

        radio.switchRadioStation();

        assertEquals(1, radio.setCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStation() {

        radio.getRadioStation(0);

        radio.switchBackRadioStation();

        assertEquals(9, radio.setCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationZero() {

        radio.getRadioStation(1);

        radio.switchBackRadioStation();

        assertEquals(0, radio.setCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationOverLimit() {

        radio.getRadioStation(10);

        radio.switchBackRadioStation();

        assertEquals(9, radio.setCurrentRadioStation());

    }


    //тесты по громкости

    @Test
    public void setCurrentVolume() {

        assertEquals(0, radio.setCurrentVolume());

    }

    @Test
    public void getCurrentVolumeOverLimit() {

        radio.getCurrentVolume(101);

        assertEquals(100, radio.setCurrentVolume());

    }

    @Test
    public void getCurrentVolumeZero() {

        radio.getCurrentVolume(-1);

        assertEquals(0, radio.setCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolume() {

        radio.getCurrentVolume(0);

        radio.increaseVolume();

        assertEquals(1, radio.setCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {

        radio.getCurrentVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.setCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeMid() {

        radio.getCurrentVolume(5);

        radio.increaseVolume();

        assertEquals(6, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolume() {

        radio.getCurrentVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeMax() {

        radio.getCurrentVolume(100);

        radio.decreaseVolume();

        assertEquals(99, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeOverMax() {

        radio.getCurrentVolume(101); //проверяем, что 101 будет для него 100

        radio.decreaseVolume();

        assertEquals(99, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {

        radio.getCurrentVolume(-1); //проверяем, что -1 будет для него 0

        radio.decreaseVolume();

        assertEquals(0, radio.setCurrentVolume());

    }


}