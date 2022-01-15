package ru.netology.radio.volumenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio();


    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio(9);


        assertEquals(9, radio.setCurrentRadioStation());

    }


    @Test
    public void switchRadioStation() {
        Radio radio = new Radio(10);

        radio.setCurrentRadioStation();

        radio.switchRadioStation();

        assertEquals(0, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationMid() {
        Radio radio = new Radio(5);

        radio.setCurrentRadioStation();

        radio.switchRadioStation();

        assertEquals(6, radio.setCurrentRadioStation());

    }

    @Test
    public void switchRadioStationOverLimit() {
        Radio radio = new Radio(11);

        radio.setCurrentRadioStation();

        radio.switchRadioStation();

        assertEquals(0, radio.setCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStation() {
        Radio radio = new Radio(9);

        radio.setCurrentRadioStation();

        radio.switchBackRadioStation();

        assertEquals(8, radio.setCurrentRadioStation());

    }

    @Test
    public void switchBackRadioStationUnderLimit() {
        Radio radio = new Radio(-1);

        radio.setCurrentRadioStation();

        radio.switchBackRadioStation();

        assertEquals(9, radio.setCurrentRadioStation());

    }

    //тесты по громкости

    @Test
    public void setCurrentVolume() {

        assertEquals(0, radio.setCurrentVolume());

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