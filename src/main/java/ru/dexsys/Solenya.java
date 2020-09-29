package ru.dexsys;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Solenya {
    private List<Can> cans;
    final int random = new Random().nextInt(100) + 1;

    public Solenya() {
        this.cans = new ArrayList<>();
    }

    //Добавить банку с соленьями
    public void pushCan(Can can) throws ExeptionsFall {
        if (random >= 2) {
            throw new ExeptionsFall("Выпрямите руки, банки больше нету");
        } else {
            this.cans.add(can);
        }
    }

    //Достать банку по этикетке
    public Can getCan(String label) throws ExeptionsFall {

        Can can = new Can();
        for (Can c : this.cans) {
            if (label.equals(c.getLabel())) {
                if (random == 1) {
                    throw new ExeptionsFall("Выпрямите руки, банки больше нету");
                } else {
                    can = c;
                }
                this.cans.remove(c);
                break;
            }
        }
        return can;
    }

    //Вывести состав погреба
    public void listOfSolenya() {
        System.out.println("Список солений");
        for (Can can : cans) {
            System.out.println(can);
        }
    }

}
