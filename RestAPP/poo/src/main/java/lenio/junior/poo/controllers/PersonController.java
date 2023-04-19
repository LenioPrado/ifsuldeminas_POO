package lenio.junior.poo.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lenio.junior.poo.entities.Person;
import lenio.junior.poo.repositories.PersonRepository;

import java.util.List;

@RestController
public class PersonController {

    // Property to hold our repository
    public PersonRepository People;

    // Constructor that receives the repository via dependency injection
    public PersonController(PersonRepository people){
        this.People = people;
    }

    // Get to /people that returns list of people
    @GetMapping("/people")
    public List<Person> getPeople(){
        return People.findAll(); // Returns all people!
    }

    // Post to /people, takes in request body which must be of type Person
    @PostMapping("/people")
    public List<Person> createPerson(@RequestBody Person newPerson){
        People.save(newPerson); //creates new person
        return People.findAll(); // returns all cats
    }

    // put to /people/:id, takes in the body and url param id
    @PutMapping("/people/{id}")
    public List<Person> updatePerson(@RequestBody Person updatedPerson, @PathVariable Long id){
        // search for the person by id, map over the person, alter them, then save
        People.findById(id)
            .map(person -> {
                person.setName(updatedPerson.getName());
                person.setAge(updatedPerson.getAge());
                return People.save(person); // save and return edits
            });

        return People.findAll(); // return all people
    }

    // delete request to /people/:id, deletes person based on id param
    @DeleteMapping("/people/{id}")
    public List<Person> deleteCat(@PathVariable Long id){
        People.deleteById(id);
        return People.findAll();
    }
}
