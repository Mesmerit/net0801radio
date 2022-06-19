import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setNextRadioStationIfMidStationAndNoParameter() {
        Radio radio1 = new Radio();
        radio1.setNumberOfRadioStation(5);

        radio1.setNextRadioStation();

        int actual = radio1.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationIfMaxStationAndNoParameter() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(9);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationIfMidStationAndNoParameter() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(8);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationIfMinStationAndNoParameter() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(0);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void setOutHNumberOfRadioStationIfMidAndNoParameter() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(5);

        radio.setNumberOfRadioStation(10);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void setOutLNumberOfRadioStationIfMidAndNoParameter() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(6);

        radio.setNumberOfRadioStation(-30);

        int actual = radio.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }


    @Test
    void setNextRadioStationIfMidStationAndParameter() {
        Radio radio1 = new Radio(15);
        radio1.setNumberOfRadioStation(5);

        radio1.setNextRadioStation();

        int actual = radio1.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationIfMaxStationAndParameter() {
        Radio radio = new Radio(15);
        radio.setNumberOfRadioStation(14);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationIfMidStationAndParameter() {
        Radio radio = new Radio(15);
        radio.setNumberOfRadioStation(8);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationIfMinStationAndParameter() {
        Radio radio = new Radio(15);
        radio.setNumberOfRadioStation(0);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 14;

        assertEquals(expected, actual);
    }

    @Test
    void setOutHNumberOfRadioStationIfMidAndParameter() {
        Radio radio = new Radio(15);
        radio.setNumberOfRadioStation(5);

        radio.setNumberOfRadioStation(30);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void setOutLNumberOfRadioStationIfMidAndParameter() {
        Radio radio = new Radio(15);
        radio.setNumberOfRadioStation(6);

        radio.setNumberOfRadioStation(-3);

        int actual = radio.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void setMoreVolumeIfMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);

        radio.setMoreVolume();

        int actual = radio.getCurrentVolume();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void setMoreVolumeIfMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.setMoreVolume();

        int actual = radio.getCurrentVolume();
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    void setLessVolumeIfMid() {
        Radio radio = new Radio();
        radio.setCurrentVolume(6);

        radio.setLessVolume();

        int actual = radio.getCurrentVolume();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void setLessVolumeIfMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.setLessVolume();

        int actual = radio.getCurrentVolume();
        int expected = 0;

        assertEquals(expected, actual);
    }
}
