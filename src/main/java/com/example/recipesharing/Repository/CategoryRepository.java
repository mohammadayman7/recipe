package com.example.recipesharing.Repository;

import com.example.recipesharing.Entities.category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<category,Long> {
}
