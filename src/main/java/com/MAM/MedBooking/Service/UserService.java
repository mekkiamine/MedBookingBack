    package com.MAM.MedBooking.Service;

    import com.MAM.MedBooking.Entity.User;
    import com.MAM.MedBooking.Repository.UserRepository;
    import jakarta.annotation.PostConstruct;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    @Service
    public class UserService {

        @Autowired
        private UserRepository userRepository;

        @PostConstruct
        public void init() {
            try {
                insertUser();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        public void insertUser() {
            User user = new User(1,"amine","amine@mekki.tn");
            userRepository.save(user);
        }
    }
