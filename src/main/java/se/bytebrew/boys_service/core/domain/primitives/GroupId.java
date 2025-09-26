package se.bytebrew.boys_service.core.domain.primitives;

import java.util.UUID;

import se.bytebrew.starter.domain.DomainPrimitive;

public class GroupId extends DomainPrimitive<UUID> {

  public GroupId(UUID value) {
    super(value);
  }
}
