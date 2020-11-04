package com.first.db.controller;
import java.util.ArrayList;
import java.util.List;
import com.first.db.model.Person;
import com.first.db.repository.PersonsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
 
@RestController
@RequestMapping(value = "/person")
public class PersonsController {

    private List<Person> persons = new ArrayList<>();
    @Autowired
    PersonsRepository personsRepository;
	
	@GetMapping
	public List<Person> findAll() {
        return personsRepository.findAll();
        }
        @GetMapping("/{id}")
	public Person findById(@PathVariable Integer id) {
        return personsRepository.findById(id).get();
	}
	
	@PostMapping
	public Person add(@RequestBody Person p) {
        personsRepository.save(p);
        return p;
        }

        @DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
        personsRepository.deleteById(id);

        }
        
      
}
