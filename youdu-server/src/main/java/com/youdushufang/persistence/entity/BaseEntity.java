package com.youdushufang.persistence.entity;

import com.youdushufang.common.utils.TimeUtils;
import lombok.Data;

import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Data
@MappedSuperclass
public class BaseEntity {

    protected Integer createdTime;

    protected Integer modifiedTime;

    @PrePersist
    public void prePersist() {
        if (createdTime == null) {
            createdTime = TimeUtils.getCurrentTimeInSeconds();
        }
    }

    @PreUpdate
    public void preUpdate() {
        if (createdTime == null) {
            createdTime = TimeUtils.getCurrentTimeInSeconds();
        }

        if (modifiedTime == null) {
            modifiedTime = TimeUtils.getCurrentTimeInSeconds();
        }
    }
}
