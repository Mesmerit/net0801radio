package ru.netology.domain;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    private void setRadioStation(int currentRadioStation) {
        if (currentRadioStation < -1) {
            return;
        }
        if (currentRadioStation > 10) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation == 9) {
            setRadioStation(0);
        } else {
            setRadioStation(currentRadioStation + 1);
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation == 0) {
            setRadioStation(9);
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
        if (currentVolume >= 10) {
            this.currentVolume = 10;
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
