package com.adam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adam.entity.Pelanggan;
import com.adam.repo.PelangganRepo;

@Service
public class PelangganService {

  @Autowired
  private PelangganRepo repo;

  public Iterable<Pelanggan> findAll() {
    return repo.findAll();
  }

  public void addPelanggan(Pelanggan pelanggan) {
    repo.save(pelanggan);
  }

  public void deleteById(long id) {
    repo.deleteById(id);
  }

  public Optional<Pelanggan> findById(long id) {
    return repo.findById(id);
  }

  public void updatePelanggan(Pelanggan pelanggan) {
    repo.save(pelanggan);
  }

}
