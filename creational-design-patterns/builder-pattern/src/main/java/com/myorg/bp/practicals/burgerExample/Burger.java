package com.myorg.bp.practicals.burgerExample;

import com.myorg.bp.practicals.burgerExample.model.Meat;
import com.myorg.bp.practicals.burgerExample.statics.Bun;
import com.myorg.bp.practicals.burgerExample.statics.CheeseType;
import com.myorg.bp.practicals.burgerExample.statics.Size;

public class Burger {
    private Size size;
    private CheeseType cheeseType;
    private Boolean cabbageSlicesAdded;
    private Bun bun;
    private Meat meat;

    public Burger(Burger.Builder builder) {
        this.size = builder.size;
        this.cheeseType = builder.cheeseType;
        this.cabbageSlicesAdded = builder.cabbageSlicesAdded;
        this.bun = builder.bun;
        this.meat = builder.meat;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "size=" + size +
                ", cheeseType=" + cheeseType +
                ", cabbageSlicesAdded=" + cabbageSlicesAdded +
                ", bun=" + bun +
                ", meat=" + meat +
                '}';
    }

    static class Builder {
        private Size size;
        private CheeseType cheeseType;
        private Boolean cabbageSlicesAdded;
        private Bun bun;
        private Meat meat;

        public Builder(Bun bun) {
            this.bun = bun;
        }

        public Builder size(Size size) {
            this.size = size;
            return this;
        }

        public Builder cheeseType(CheeseType cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        public Builder cabbageSlicesAdded(Boolean cabbageSlicesAdded) {
            this.cabbageSlicesAdded = cabbageSlicesAdded;
            return this;
        }

        public Builder meat(Meat meat) {
            this.meat = meat;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }
}
