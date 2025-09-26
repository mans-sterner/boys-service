package se.bytebrew.boys_service.core.domain.primitives;

import java.util.UUID;

import se.bytebrew.starter.domain.DomainPrimitive;

public class UserId extends DomainPrimitive<UUID> {

  public UserId(UUID value) {
    super(value);
  }
}
