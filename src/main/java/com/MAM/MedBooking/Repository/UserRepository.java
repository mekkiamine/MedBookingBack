package com.MAM.MedBooking.Repository;

import com.MAM.MedBooking.Entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
