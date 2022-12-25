package com.example;

import java.util.List;

public class TestData {
    public List<String> getArray() {
        return List.of("Животные", "Птицы", "Рыба");
    }
    public List<String> getHerbivorousFoodTypes() {
        return List.of("Трава", "Различные растения");
    }
    public List<String> getLionAlexFriends() {
        return List.of("Марти", "Глория", "Мелман");
    }
    public String getCatFamily() {
        return "Кошачьи";
    }
    public String getAnimalsFamilies() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
    public String getCatSound() {
        return "Мяу";
    }
    public int getOneKitten() {
        return 1;
    }
    public int getZeroKitten() {
        return 0;
    }
    public String getException() {
        return "Используйте допустимые значения пола животного - самец или самка";
    }
    public String getMale() {
        return "Самец";
    }
    public String getFemale() {
        return "Самка";
    }
    public String getUndefinedAnimalType() {
        return "Не определился";
    }
    public String getPredatorAnimalType() {
        return "Хищник";
    }
    public String getHerbivorousAnimalType() {
        return "Травоядное";
    }
    public String getAnimalTypeExceptionText() {
        return "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    }
    public String getLionAlexPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }
}


