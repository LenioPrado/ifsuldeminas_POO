package lenio.junior.poo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import lenio.junior.poo.entities.Person;

// We create our repository, the <> typing defines the entity class acting as a schema, and type of the ID
public interface PersonRepository extends JpaRepository<Person, Long> {

}
