package se.bytebrew.boys_service.core.domain.primitives;

import java.time.OffsetDateTime;

import se.bytebrew.starter.domain.DomainPrimitive;

public class UpdatedAt extends DomainPrimitive<OffsetDateTime> {

  public UpdatedAt(OffsetDateTime value) {
    super(value);
  }
}
