package se.bytebrew.boys_service.core.domain.primitives;

import java.time.OffsetDateTime;

import se.bytebrew.starter.domain.DomainPrimitive;

public class CreatedAt extends DomainPrimitive<OffsetDateTime> {

  public CreatedAt(OffsetDateTime value) {
    super(value);
  }
}
