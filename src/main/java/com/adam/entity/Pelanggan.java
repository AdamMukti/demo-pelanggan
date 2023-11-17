package com.adam.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tbl_pelanggan")
public class Pelanggan {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(length = 200, nullable = false)
  private String nama;

  @Column(length = 200, nullable = false)
  private String alamat;

  @Column(length = 10, nullable = false)
  private String jenis_kelamin;

  @Column(length = 3, nullable = false)
  private int umur;

  @Column(length = 200, nullable = false)
  private String pekerjaan;

  @Column(length = 50, nullable = false)
  private int penghasilan;

  public Pelanggan() {
  }

  public Long getId() {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNama() {
    return this.nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getAlamat() {
    return this.alamat;
  }

  public void setAlamat(String alamat) {
    this.alamat = alamat;
  }

  public String getJenis_kelamin() {
    return this.jenis_kelamin;
  }

  public void setJenis_kelamin(String jenis_kelamin) {
    this.jenis_kelamin = jenis_kelamin;
  }

  public int getUmur() {
    return this.umur;
  }

  public void setUmur(int umur) {
    this.umur = umur;
  }

  public String getPekerjaan() {
    return this.pekerjaan;
  }

  public void setPekerjaan(String pekerjaan) {
    this.pekerjaan = pekerjaan;
  }

  public int getPenghasilan() {
    return this.penghasilan;
  }

  public void setPenghasilan(int penghasilan) {
    this.penghasilan = penghasilan;
  }

}
