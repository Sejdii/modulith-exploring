package com.example.modulithexploring;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;

@Slf4j
class ModularityTest {

    private final ApplicationModules applicationModules = ApplicationModules.of(ModulithExploringApplication.class);

    @Test
    void shouldHaveValidStructure() {
        applicationModules.verify();
    }

    @Test
    void shouldDisplayAllModules() {
        applicationModules.forEach(applicationModule -> log.info("Module: {}", applicationModule));
    }
}
