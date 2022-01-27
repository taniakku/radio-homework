package ru.netology.radio.volumenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {


    @Test
    public void showCurrentRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        assertEquals(0, radio.getCurrentRadioStation());

    }


    @Test
    public void switchRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(5);

        radio.switchRadioStation();

        assertEquals(6, radio.getCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOtherNumberOfStations() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation(0);

        radio.switchRadioStation();

        assertEquals(1, radio.getCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(11);

        radio.switchRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOverLimitTwice() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(22);

        radio.switchRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOnTheLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(9);

        radio.switchRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOtherNumberOfStationsOverLimit() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation(4);

        radio.switchRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOtherNumberOfStationsOnTheLimit() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation(5);

        radio.switchRadioStation();

        assertEquals(0, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(8);

        radio.switchBackRadioStation();

        assertEquals(7, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationOverLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(10);

        radio.switchBackRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationZero() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(0);

        radio.switchBackRadioStation();

        assertEquals(9, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationUnderLimit() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1); //для метода это уже 9

        radio.switchBackRadioStation();

        assertEquals(8, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationOtherNumberOfStations() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation(4);

        radio.switchBackRadioStation();

        assertEquals(3, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationOtherNumberOfStationsOverLimit() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation(6);

        radio.switchBackRadioStation();

        assertEquals(3, radio.getCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationOtherNumberOfStationsMinusLimit() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation(-1); // для метода это уже 4

        radio.switchBackRadioStation();

        assertEquals(3, radio.getCurrentRadioStation());

    }

    //тесты по громкости

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();

        assertEquals(0, radio.setCurrentVolume());

    }

    @Test
    public void getCurrentVolumeZero() {
        Radio radio = new Radio();

        radio.getCurrentVolume(-1);

        assertEquals(0, radio.setCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.getCurrentVolume(0);

        radio.increaseVolume();

        assertEquals(1, radio.setCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {
        Radio radio = new Radio();

        radio.getCurrentVolume(100);

        radio.increaseVolume();

        assertEquals(100, radio.setCurrentVolume());

    }

    @Test
    public void shouldIncreaseVolumeMid() {
        Radio radio = new Radio();

        radio.getCurrentVolume(5);

        radio.increaseVolume();

        assertEquals(6, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.getCurrentVolume(0);

        radio.decreaseVolume();

        assertEquals(0, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeMax() {
        Radio radio = new Radio();

        radio.getCurrentVolume(100);

        radio.decreaseVolume();

        assertEquals(99, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeOverMax() {
        Radio radio = new Radio();

        radio.getCurrentVolume(101); //проверяем, что 101 будет для него 100

        radio.decreaseVolume();

        assertEquals(99, radio.setCurrentVolume());

    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.getCurrentVolume(-1); //проверяем, что -1 будет для него 0

        radio.decreaseVolume();

        assertEquals(0, radio.setCurrentVolume());

    }


}