package pl.edu.wszib.springjpa.model;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table
public class Praca {

  @Id
  @GeneratedValue
  private Long id;
  private String nazwaFirmy;

  private String pracaOd;
  private String pracaDo;

  private String stanowisko;

  @CreationTimestamp
  private Instant createdAt;
  @UpdateTimestamp
  private Instant updatedAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNazwaFirmy() {
    return nazwaFirmy;
  }

  public void setNazwaFirmy(String nazwaFirmy) {
    this.nazwaFirmy = nazwaFirmy;
  }

  public String getPracaOd() {
    return pracaOd;
  }

  public void setPracaOd(String pracaOd) {
    this.pracaOd = pracaOd;
  }

  public String getPracaDo() {
    return pracaDo;
  }

  public void setPracaDo(String pracaDo) {
    this.pracaDo = pracaDo;
  }

  public String getStanowisko() {
    return stanowisko;
  }

  public void setStanowisko(String stanowisko) {
    this.stanowisko = stanowisko;
  }

  public Instant getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Instant createdAt) {
    this.createdAt = createdAt;
  }

  public Instant getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Instant updatedAt) {
    this.updatedAt = updatedAt;
  }
}
