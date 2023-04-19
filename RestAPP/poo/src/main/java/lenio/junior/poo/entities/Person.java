package lenio.junior.poo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {

    // MODEL ID FIELD
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //Model Specific Properties
    public String name;
    public Integer age;

    //constructor
    public Person (){

    }

    public Person(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    //getters

    public Long getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public Integer getAge(){
        return this.age;
    }

    //setters

    public void setId(Long id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(Integer age){
        this.age = age;
    }


}