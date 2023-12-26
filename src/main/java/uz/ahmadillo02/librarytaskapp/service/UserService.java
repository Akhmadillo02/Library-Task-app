package uz.ahmadillo02.librarytaskapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import uz.ahmadillo02.librarytaskapp.entity.User;
import uz.ahmadillo02.librarytaskapp.repository.UserRepository;

@Service
@RequiredArgsConstructor
public class UserService  {

    private final UserRepository userRepository;

    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public User addUser(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    public String deleteUser(Long id) {
        userRepository.deleteById(id);
        return "delete user";
    }
}
