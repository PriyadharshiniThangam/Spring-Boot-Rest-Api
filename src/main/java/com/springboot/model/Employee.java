package com.springboot.model;

public class Employee {
	public Employee() {
		 
    }
 
    public Employee(Integer id, String firstName, String lastName, String email) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
  
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
 
    public Integer getId() {  
        return id;  
    }  
    public void setId(int id) {  
        this.id = id;  
    }  
    public String getfirstName() {  
        return firstName;  
    }  
    public void setfirstName(String firstname) {  
        this.firstName = firstname;  
    }  
      
    public String getEmail() {  
        return email;  
    }  
    public void setEmail(String email) {  
        this.email = email;  
    }   
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstName=" + firstName + ",lastName=" + lastName + ", email=" + email + "]";
    }

}
