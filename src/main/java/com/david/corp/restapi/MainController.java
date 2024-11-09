package com.david.corp.restapi;

import org.springframework.web.bind.annotation.RestController;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MainController {
    @GetMapping("/home")
    public String getMethodName() {
        return new String("Version 1");
    }
    

    @GetMapping("/cpu")
    public String getCpuUsage() {

        // Obtén una instancia de OperatingSystemMXBean
        OperatingSystemMXBean osBean = 
            (OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        
        // Obtén el uso de la CPU en porcentaje
        double cpuLoad = osBean.getSystemLoadAverage();

        if (cpuLoad < 0) {
            return "Uso de CPU no disponible.";
        } else {
            return String.format("Carga promedio de la cpu: %.2f%%\n", cpuLoad);
        }
    }
    

}
