package ru.dexsys;

public class Main
{
    public static void main( String[] args )
    {
        Solenya solenya = new Solenya();
        Can can;
        can = new Can("Огурцы", new Vegetables[]{Vegetables.CUCUMBER, Vegetables.GARLIC, Vegetables.PEPPER});
        try {
            solenya.pushCan(can);
        } catch (ExeptionsFall e) {
            System.out.println(e.getMessage());
        }

        can = new Can("Ассорти", new Vegetables[]{Vegetables.CUCUMBER,Vegetables.TOMATO, Vegetables.GARLIC, Vegetables.PEPPER, Vegetables.CABBAGE});
        try {
            solenya.pushCan(can);
        } catch (ExeptionsFall e) {
            System.out.println(e.getMessage());
        }

        can = new Can("Помидоры", new Vegetables[]{Vegetables.TOMATO, Vegetables.GARLIC, Vegetables.PEPPER});
        try {
            solenya.pushCan(can);
        } catch (ExeptionsFall e) {
            System.out.println(e.getMessage());
        }
        solenya.listOfSolenya();

        try {
            can = solenya.getCan("Огурцы");
            System.out.println("Вы достали " + can);
        } catch (ExeptionsFall e) {
            System.out.println(e.getMessage());
        }

        solenya.listOfSolenya();
    }
}
