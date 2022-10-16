package com.example.adminapp.repository;

import com.example.adminapp.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory,Long> {

    public List<Inventory> findInventoryByName(String name);
}
