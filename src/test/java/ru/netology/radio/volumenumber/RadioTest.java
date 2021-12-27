package ru.netology.radio.volumenumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setCurrentRadioStation() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }


    @Test
    public void getRadioStation() {
        Radio radio = new Radio();

        radio.getRadioStation(10);

        int expected = 0;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void getRadioStationZero() {
        Radio radio = new Radio();

        radio.getRadioStation(-1);

        int expected = 9;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchRadioStationMax() {
        Radio radio = new Radio();

        radio.getRadioStation(9);

        radio.switchRadioStation();

        int expected = 0;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchRadioStationStart() {
        Radio radio = new Radio();

        radio.getRadioStation(1);

        radio.switchRadioStation();

        int expected = 2;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }



    @Test
    public void switchRadioStationStartZero() {
        Radio radio = new Radio();

        radio.getRadioStation(0);

        radio.switchRadioStation();

        int expected = 1;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchRadioStationMid() {
        Radio radio = new Radio();

        radio.getRadioStation(5);

        radio.switchRadioStation();

        int expected = 6;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchRadioStationBond() {
        Radio radio = new Radio();

        radio.getRadioStation(8);

        radio.switchRadioStation();

        int expected = 9;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchRadioStationOverMax() {
        Radio radio = new Radio();

        radio.getRadioStation(10);

        radio.switchRadioStation();

        int expected = 1;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchBackRadioStation() {
        Radio radio = new Radio();

        radio.getRadioStation(0);

        radio.switchBackRadioStation();

        int expected = 9;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchBackRadioStationZero() {
        Radio radio = new Radio();

        radio.getRadioStation(1);

        radio.switchBackRadioStation();

        int expected = 0;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }

    @Test
    public void switchBackRadioStationOverLimit() {
        Radio radio = new Radio();

        radio.getRadioStation(10);

        radio.switchBackRadioStation();

        int expected = 9;
        int actual = radio.setCurrentRadioStation();

        assertEquals(expected, actual);

    }



    //тесты по громкости

    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();

        int expected = 0;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolumeOverLimit() {
        Radio radio = new Radio();

        radio.getCurrentVolume(11);

        int expected = 10;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void getCurrentVolumeZero() {
        Radio radio = new Radio();

        radio.getCurrentVolume(-1);

        int expected = 0;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.getCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeOverLimit() {
        Radio radio = new Radio();

        radio.getCurrentVolume(10);

        radio.increaseVolume();

        int expected = 10;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldIncreaseVolumeMid() {
        Radio radio = new Radio();

        radio.getCurrentVolume(5);

        radio.increaseVolume();

        int expected = 6;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.getCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeMax() {
        Radio radio = new Radio();

        radio.getCurrentVolume(10);

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeOverMax() {
        Radio radio = new Radio();

        radio.getCurrentVolume(11); //проверяем, что 11 будет для него 10

        radio.decreaseVolume();

        int expected = 9;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }

    @Test
    public void shouldDecreaseVolumeUnderLimit() {
        Radio radio = new Radio();

        radio.getCurrentVolume(-1); //проверяем, что -1 будет для него 0

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.setCurrentVolume();

        assertEquals(expected, actual);

    }




}