package com.tenant;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Iterator;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Optionals;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;
import org.springframework.beans.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping("com.tenant")
public class TenantResources 
{   
	@Autowired
	tenantRepo repo;
	//Display the all Tenant in to the table 
	@RequestMapping("tenants")
	public List<Tenant> getTenants(@RequestBody Tenant t)
	{		
		return (List<Tenant>) repo.findAll();
	}
	
	// Return a total count of Tenant
	@GetMapping("tenants/count")
	public long gettenanatcount()
	{
		return repo.count();
	}
	
	// Save the new Id of Tenant
	@PostMapping(value ="/tenants/create")
	public Tenant postTenant(@RequestBody Tenant tenant)
	{
		Tenant t1 =  repo.save(new Tenant(tenant.getId(),tenant.getTenantName(),tenant.getMobileNo(),tenant.getAddress(),tenant.getCity(),tenant.getZipcode()));
		return t1;
	}	
	
	//find all tenant by there id 
	@PostMapping(value ="/tenants/by{id}")
	public Optional<Tenant> getTenant(@PathVariable("id") Integer id)
	{
//Optional<Tenant> to = new Optional<Tenant>();
		
			return repo.findById(id);
	//	return repo.findById(ids);
	}
	
	// Delete the tenant by them id 
	@DeleteMapping("/tenants/{id}")
	public void deleteTenant(@PathVariable("id") Integer id)
	{
		repo.deleteById(id);
	}
	
	//UPDATE Tenant ROW by id 
	@PutMapping("/tenants/update{id}") 
	public Tenant updateTenant(@RequestBody Tenant tenant,@PathVariable("id") Integer id) 
		{
		
			tenant.setAddress(tenant.getAddress());
			tenant.setMobileNo(tenant.getMobileNo());
			tenant.setId(id);
			Tenant t2=repo.save(tenant);
			return t2;
		}
	}

