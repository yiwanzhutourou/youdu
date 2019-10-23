package com.youdushufang.service;

import com.youdushufang.persistence.entity.ConfigEntity;
import com.youdushufang.persistence.repository.ConfigRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ConfigService {

    private final ConfigRepository configRepository;

    public ConfigService(ConfigRepository configRepository) {
        this.configRepository = configRepository;
    }

    @NonNull
    public String getConfig(@NonNull String configName) {
        Optional<ConfigEntity> configEntityOptional =  configRepository.findByConfigName(configName);
        if (configEntityOptional.isPresent()) {
            return configEntityOptional.get().getConfigValue();
        }
        return "";
    }
}
