package com.ecommerce.repository;

import com.ecommerce.entity.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColorRepository 
        extends JpaRepository<Color, Integer> {
}
