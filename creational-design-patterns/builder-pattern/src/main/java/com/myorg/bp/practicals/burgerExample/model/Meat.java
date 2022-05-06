package com.myorg.bp.practicals.burgerExample.model;

import com.myorg.bp.practicals.burgerExample.statics.MeatCategory;

public class Meat {
    private MeatCategory meatCategory;

    public Meat(MeatCategory meatCategory) {
        this.meatCategory = meatCategory;
    }

    @Override
    public String toString() {
        return String.format("Meat {meatCategory=%s}", meatCategory);
    }
}
