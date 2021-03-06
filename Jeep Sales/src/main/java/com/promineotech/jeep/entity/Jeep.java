package com.promineotech.jeep.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.math.BigDecimal;
import java.util.Comparator;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Jeep implements Comparable<Jeep>{
    private Long modelPK;
    private JeepModel modelId;
    private String trimLevel;
    private int numDoors;
    private int wheelSize;
    private BigDecimal basePrice;

    @JsonIgnore
    public Long getModelPK() {
        return modelPK;
    }

    @Override
    public int compareTo(Jeep jeep) {
        return Comparator
                .comparing(Jeep::getModelId)
                .thenComparing(Jeep::getTrimLevel)
                .thenComparing(Jeep::getNumDoors)
                .compare(this, jeep);
    }
}
