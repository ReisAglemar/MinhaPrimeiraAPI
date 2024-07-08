package reis.edu.minhaAPI.domain.service;

import reis.edu.minhaAPI.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);

}
