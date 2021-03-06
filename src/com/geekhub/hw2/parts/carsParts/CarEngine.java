package com.geekhub.hw2.parts.carsParts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.interfaces.Engine;

public class CarEngine implements Engine {

    private final float efficiency;

    public CarEngine(float efficiency) {
        if (efficiency >= 0 && efficiency <= 1) {
            this.efficiency = efficiency;
        } else {
            throw new IllegalArgumentException("Engine efficiency must be between 0 and 1");
        }
    }

    @Override
    public Force transform(Energy energy) {
        return new Force(Math.round(energy.getAmount() * efficiency));
    }

}
