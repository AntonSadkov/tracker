package ru.oop;

public class Jukebox {
    public void music(int position) {
        switch (position) {
            case 1:
                System.out.println("Пусть бегут неуклюже, пешеходы по луже.");
                break;
            case 2:
                System.out.println("Спокойной ночи. Спокойного сна.");
                break;
            default:
                System.out.println("Песня не найдена.");
                break;
        }
    }

    public static void main(String[] args) {
        Jukebox selectSound = new Jukebox();
        selectSound.music(1);
        selectSound.music(2);
        selectSound.music(3);
    }
}
