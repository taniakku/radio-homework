package ru.netology.radio.volumenumber;

public class Radio {

    private int currentRadioStation;
    private int radioVolume;
    private int numberOfStations = 10;

//конструкторы

    public Radio() {
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
    }

//тут станции

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {

/*        if (currentRadioStation < 0) {
            currentRadioStation = numberOfStations - 1;
        }

        if (currentRadioStation > numberOfStations) {
            currentRadioStation = 0;
        }*/

        this.currentRadioStation = currentRadioStation;

    }


    public int getNumberOfStations() {
        return numberOfStations;
    }

    public int setNumberOfStations() {
        return numberOfStations;
    }

    public void switchRadioStation() {

        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation >= numberOfStations) {
            currentRadioStation = 0;
        }


        this.currentRadioStation = currentRadioStation;

    }

    public void switchBackRadioStation() {

        if (currentRadioStation >= numberOfStations) {
            currentRadioStation = numberOfStations - 2;
        } else currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation <= 0) {
            currentRadioStation = numberOfStations - 1;
        }

        this.currentRadioStation = currentRadioStation;

    }


    //тут громкость

    public int setCurrentVolume() {
        return radioVolume;
    }

    public void getCurrentVolume(int radioVolume) {

        if (radioVolume < 0) {
            radioVolume = 0;
        }

        if (radioVolume > 100) {
            radioVolume = 100;
        }

        this.radioVolume = radioVolume;
    }

    public void increaseVolume() {

        radioVolume = radioVolume + 1;
        if (radioVolume >= 100) {
            radioVolume = 100;
        }


        this.radioVolume = radioVolume;
    }

    public void decreaseVolume() {

        radioVolume = radioVolume - 1;
        if (radioVolume < 0) {
            radioVolume = 0;
        }


        this.radioVolume = radioVolume;
    }


}






