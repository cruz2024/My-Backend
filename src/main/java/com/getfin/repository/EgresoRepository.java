package com.getfin.repository;

import com.getfin.models.Egreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EgresoRepository extends JpaRepository<Egreso, Long> {
}
