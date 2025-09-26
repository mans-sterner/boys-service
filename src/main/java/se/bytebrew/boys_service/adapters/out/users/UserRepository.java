package se.bytebrew.boys_service.adapters.out.users;

import se.bytebrew.boys_service.core.domain.entities.User;

public class UserRepository {

  private final UserEntityRepository repository;

  public UserRepository(UserEntityRepository repository) {
    this.repository = repository;
  }

  private UserEntity toEntity(User user) {
    return new UserEntity(
        user.getId().value(),
        user.getName().value(),
        user.getCreatedAt().value(),
        user.getUpdatedAt().value()
    );
  }
}
