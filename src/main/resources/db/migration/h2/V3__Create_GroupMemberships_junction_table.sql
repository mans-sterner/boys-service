-- Create the group memberships junction table
  CREATE TABLE boys.group_memberships (
      user_id UUID NOT NULL,
      group_id UUID NOT NULL,
      joined_at TIMESTAMP WITH TIME ZONE NOT NULL DEFAULT CURRENT_TIMESTAMP,

      PRIMARY KEY (user_id, group_id),

      CONSTRAINT fk_group_membership_user
          FOREIGN KEY (user_id) REFERENCES boys.users(id) ON DELETE CASCADE,
      CONSTRAINT fk_group_membership_group
          FOREIGN KEY (group_id) REFERENCES boys.groups(id) ON DELETE CASCADE
  );

  -- Indexes for efficient queries
  CREATE INDEX idx_group_memberships_user_id ON boys.group_memberships(user_id);
  CREATE INDEX idx_group_memberships_group_id ON boys.group_memberships(group_id);
