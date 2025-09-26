package se.bytebrew.boys_service.adapters.out.users;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Value;

@Entity
@Table(name = "users", schema = "boys")
@Value
@NoArgsConstructor(force = true)
@AllArgsConstructor
@Builder
public class UserEntity {

  @Id
  UUID id;

  @Column
  String name;

  @CreationTimestamp
  OffsetDateTime createdAt;

  @UpdateTimestamp
  OffsetDateTime updatedAt;
}
