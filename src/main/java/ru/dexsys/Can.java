package ru.dexsys;

import lombok.Data;

import java.util.Arrays;

@Data
public class Can {
    private String label;
    private Vegetables[] ingredietns;

    public Can(String label, Vegetables[] ingredietns) {
        this.label = label;
        this.ingredietns = ingredietns;
    }

    public Can() {

    }

    public Boolean Null() {
        return (this.label == null) && (this.ingredietns == null);
    }

    @Override
    public String toString() {
        String str = "\"" + this.label + "\" " + "состав: ";
        for (Vegetables vegetables: ingredietns){
            str += vegetables + " ";
        }
        return str;
    }
}
