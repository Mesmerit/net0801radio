import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void setNextRadioStationIfMidStation() {
        Radio radio1 = new Radio();
        radio1.setNumberOfRadioStation(5);

        radio1.setNextRadioStation();

        int actual = radio1.getCurrentRadioStation();
        int expected = 6;

        assertEquals(expected, actual);
    }

    @Test
    void setNextRadioStationIfMaxStation() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(9);

        radio.setNextRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 0;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationIfMidStation() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(8);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 7;

        assertEquals(expected, actual);
    }

    @Test
    void setPrevRadioStationIfMinStation() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(0);

        radio.setPrevRadioStation();

        int actual = radio.getCurrentRadioStation();
        int expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void setOutHNumberOfRadioStationIfMid() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(5);

        radio.setNumberOfRadioStation(90);

        int actual = radio.getCurrentRadioStation();
        int expected = 5;

        assertEquals(expected, actual);
    }

    @Test
    void setOutLNumberOfRadioStationIfMid() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStation(6);

        radio.setNumberOfRadioStation(-30);

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
        radio.setCurrentVolume(10);

        radio.setMoreVolume();

        int actual = radio.getCurrentVolume();
        int expected = 10;

        assertEquals(expected, actual);
    }

    @Test
    void setMLessVolumeIfMid() {
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
