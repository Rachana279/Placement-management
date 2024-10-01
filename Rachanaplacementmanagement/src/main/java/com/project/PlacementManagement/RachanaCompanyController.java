package com.project.PlacementManagement;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RachanaCompanyController {
	 @Autowired
	 private RachanaCompanyService service;
	 
	 //Retrieval
	 @GetMapping("/RachanaCompany")
	 public List<RachanaCompany> list(){
     return service.listAll();
	 }
	 //Retrieve By Id
	 @GetMapping("/RachanaCompany/{id}")
	 public ResponseEntity<RachanaCompany> get(@PathVariable Integer id){
		try {
			RachanaCompany RachanaCompany=service.get(id);
			return new ResponseEntity<RachanaCompany>(RachanaCompany,HttpStatus.OK);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<RachanaCompany>(HttpStatus.NOT_FOUND);
		}
	 }
	 //Create
	 @PostMapping("/RachanaCompany")
		public void add(@RequestBody RachanaCompany RachanaCompany ) {
			service.save(RachanaCompany);
		 
	 }
	 //Update
	 @PutMapping("/RachanaCompany/{id}")
	 public ResponseEntity<RachanaCompany> update (@RequestBody RachanaCompany RachanaCompany,@PathVariable Integer id){
		 try {
			RachanaCompany  existRachanaCompany =service.get(id);
			RachanaCompany.setId(id);
			 service.save(RachanaCompany);
			 return new ResponseEntity<RachanaCompany>(HttpStatus.OK);
		} catch (Exception e ) {
			// TODO Auto-generated catch block
			 return new ResponseEntity<RachanaCompany>(HttpStatus.NOT_FOUND);
			 
			
		}
		 
		 
	 }
	 //Delete
	 @DeleteMapping("/RachanaCompany/{id}")
	 public void delete(@PathVariable Integer id){
		 service.delete(id);
	 }
	 
	
	 
}

