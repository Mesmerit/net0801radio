package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;
    private int maxRadioStation;

    public Radio (int quantityRadioStations){
        this.maxRadioStation = quantityRadioStations - 1;
    }
    public Radio (){
        this.maxRadioStation = 9;
    }


    private void setRadioStation(int currentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            setRadioStation(0);
        } else {
            setRadioStation(currentRadioStation + 1);
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == 0) {
            setRadioStation(maxRadioStation);
        } else {
            setRadioStation(currentRadioStation - 1);
        }
    }

    public void setNumberOfRadioStation(int numberOfRadioStation) {
        setRadioStation(numberOfRadioStation);
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            this.currentVolume = 0;
            return;
        }
        if (currentVolume >= 100) {
            this.currentVolume = 100;
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setMoreVolume() {
        setCurrentVolume(currentVolume + 1);
    }

    public void setLessVolume() {
        setCurrentVolume(currentVolume - 1);
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

}
