package com.boyarsky.apiservice.entity.measurement;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@ToString
@Table(name = "weight_measurements")
public class WeightMeasurement extends Measurement {
    @Column(nullable = false)
    private Float weight;
}
