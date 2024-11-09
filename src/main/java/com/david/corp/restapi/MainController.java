package com.david.corp.restapi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    @GetMapping("/home")
    public String getMethodName() {
        return new String("Version 1");
    }
    

    @GetMapping("/memory")
    public String getMemoriaDisponible() {
        // Obtén la instancia del Runtime
        Runtime runtime = Runtime.getRuntime();

        // Memoria total disponible para la JVM
        long totalMemory = runtime.totalMemory();
        // Memoria libre dentro de la JVM
        long freeMemory = runtime.freeMemory();
        // Memoria máxima que la JVM intentará utilizar
        long maxMemory = runtime.maxMemory();

        // Calcula la memoria disponible real
        long availableMemory = maxMemory - (totalMemory - freeMemory);

        String result = "Memoria Total (bytes): " + totalMemory
        +"Memoria Libre (bytes): " + freeMemory
        +"Memoria Máxima (bytes): " + maxMemory
        +"Memoria Disponible (bytes): " + availableMemory;
        return result;
    }
}
