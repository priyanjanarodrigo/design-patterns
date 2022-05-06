package com.myorg.bp.practicals.burgerExample;

import com.myorg.bp.practicals.burgerExample.model.Meat;
import com.myorg.bp.practicals.burgerExample.statics.Bun;
import com.myorg.bp.practicals.burgerExample.statics.CheeseType;
import com.myorg.bp.practicals.burgerExample.statics.MeatCategory;
import com.myorg.bp.practicals.burgerExample.statics.Size;

public class BurgerBuilderDemo {
    public static void main(String[] args) {
        Burger chickenBurger = new Burger.Builder(Bun.PREMIUM)
                .size(Size.EXTRA_LARGE)
                .meat(new Meat(MeatCategory.CHICKEN))
                .cabbageSlicesAdded(true)
                .cheeseType(CheeseType.MOZZARELLA_SWISS)
                .build();

        System.out.println(chickenBurger);
    }
}
