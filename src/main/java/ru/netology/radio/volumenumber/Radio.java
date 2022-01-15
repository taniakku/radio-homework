package ru.netology.radio.volumenumber;

public class Radio {

    private int currentRadioStation;
    private int radioVolume;

//конструкторы

    public Radio() {

    }

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }

//тут станции

    public int setCurrentRadioStation() {
        return currentRadioStation;
    }

    public void switchRadioStation() {


        currentRadioStation = currentRadioStation + 1;
        if (currentRadioStation > 9) {
            currentRadioStation = 0;
        }


        this.currentRadioStation = currentRadioStation;

    }

    public void switchBackRadioStation() {


        currentRadioStation = currentRadioStation - 1;
        if (currentRadioStation < 0) {
            currentRadioStation = 9;
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






