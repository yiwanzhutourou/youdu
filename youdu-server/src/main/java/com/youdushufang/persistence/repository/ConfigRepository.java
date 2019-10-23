package com.youdushufang.persistence.repository;

import com.youdushufang.persistence.entity.ConfigEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConfigRepository extends JpaRepository<ConfigEntity, Integer> {

    Optional<ConfigEntity> findByConfigName(String configName);
}
