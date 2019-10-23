package com.youdushufang.persistence.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@Table(name = "config")
public class ConfigEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "config_name", unique = true, nullable = false)
    private String configName;

    @Column(name = "config_value", nullable = false)
    private String configValue;
}
