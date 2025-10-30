package local.dev.api.rest.service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import local.dev.api.rest.model.Person;

@Service
public class PersonService {

    private static final AtomicLong COUNTER = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id) {

        logger.info("Find one Person");    
        return mockPerson();
        
    }

    private Person mockPerson() {
        Person person = new Person();
        person.setId(COUNTER.incrementAndGet());
        person.setFirstName("Carlos");
        person.setLastName("Gonzaga");
        person.setAddress("RJ - Rio de Janeiro");
        person.setGender("male");
        return person;
    }    

}
