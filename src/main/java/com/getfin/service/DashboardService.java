package com.getfin.service;

import com.getfin.models.DashboardData;
import com.getfin.models.Egreso;
import com.getfin.models.Ingreso;
import com.getfin.repository.EgresoRepository;
import com.getfin.repository.IngresoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;

/**
 * Servicio que genera los datos del Dashboard Principal.
 * Si no hay datos en los módulos, devuelve valores vacíos.
 */
@Service
public class DashboardService {

    @Autowired
    private IngresoRepository ingresoRepository;

    @Autowired
    private EgresoRepository egresoRepository;

    public DashboardData obtenerDashboardData() {
        DashboardData data = new DashboardData();

        // Si no hay datos, devolver valores vacíos
        if (ingresoRepository.count() == 0 && egresoRepository.count() == 0) {
            data.setTotalIngresos(0.0);
            data.setTotalEgresos(0.0);
            data.setUtilidadNeta(0.0);
            data.setAnimales(0);
            data.setCultivosActivos(0);
            data.setEstudiantesMes(0);
            data.setComportamientoFinanciero(Collections.emptyList());
            data.setDistribucionIngresos(Collections.emptyList());
            return data;
        }

        // Si hay datos, calcular totales reales
        Double totalIngreso = ingresoRepository.findAll().stream().mapToDouble(Ingreso::getMonto).sum();
        Double totalEgreso = egresoRepository.findAll().stream().mapToDouble(Egreso::getMonto).sum();

        data.setTotalIngresos(totalIngreso);
        data.setTotalEgresos(totalEgreso);
        data.setUtilidadNeta(totalIngreso - totalEgreso);

        // Datos estáticos por ahora
        data.setAnimales(6);
        data.setCultivosActivos(5);
        data.setEstudiantesMes(5);

        // Gráficos vacíos hasta que haya datos
        data.setComportamientoFinanciero(Collections.emptyList());
        data.setDistribucionIngresos(Collections.emptyList());

        return data;
    }
}
