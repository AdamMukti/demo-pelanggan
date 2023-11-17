package com.adam.repo;

import org.springframework.data.repository.CrudRepository;

import com.adam.entity.Pelanggan;

public interface PelangganRepo extends CrudRepository<Pelanggan, Long> {
  
}
