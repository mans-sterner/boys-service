package se.bytebrew.boys_service.core.domain.entities;

import lombok.Builder;
import lombok.Getter;
import se.bytebrew.boys_service.core.domain.primitives.CreatedAt;
import se.bytebrew.boys_service.core.domain.primitives.Name;
import se.bytebrew.boys_service.core.domain.primitives.UpdatedAt;
import se.bytebrew.boys_service.core.domain.primitives.UserId;

@Getter
@Builder
public class User {
  private final UserId id;
  private final Name name;
  private final CreatedAt createdAt;
  private final UpdatedAt updatedAt;

  public User(UserId id, Name name, CreatedAt createdAt, UpdatedAt updatedAt) {
    this.id = id;
    this.name = name;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }
}
