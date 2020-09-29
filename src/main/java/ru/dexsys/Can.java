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

    @Override
    public String toString() {
        return "Can{" +
                "label='" + label + '\'' +
                ", ingredietns=" + Arrays.toString(ingredietns) +
                '}';
    }
}
