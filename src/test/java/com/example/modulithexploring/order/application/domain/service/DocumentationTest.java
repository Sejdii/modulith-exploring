package com.example.modulithexploring.order.application.domain.service;

import com.example.modulithexploring.ModulithExploringApplication;
import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;

class DocumentationTest {

    ApplicationModules modules = ApplicationModules.of(ModulithExploringApplication.class);

    @Test
    void writeDocumentationSnippets() {

        new Documenter(modules)
                .writeModulesAsPlantUml()
                .writeIndividualModulesAsPlantUml();
    }
}
