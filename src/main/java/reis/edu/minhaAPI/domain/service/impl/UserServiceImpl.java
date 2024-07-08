package reis.edu.minhaAPI.domain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reis.edu.minhaAPI.domain.model.User;
import reis.edu.minhaAPI.domain.repository.UserRepository;
import reis.edu.minhaAPI.domain.service.UserService;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {

        if (user.getId() != null && userRepository.existsById(user.getId())) {
            throw new IllegalArgumentException("User already exists");
        }

        return userRepository.save(user);
    }
}
