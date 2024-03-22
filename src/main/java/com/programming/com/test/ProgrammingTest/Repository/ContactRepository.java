package com.programming.com.test.ProgrammingTest.Repository;

import com.programming.com.test.ProgrammingTest.Model.Customer;

import javax.management.Query;

@Repository
public class ContactRepository extends JpaRepository<Customer, Integer>  {

public void findByEmail(String email){
    Query query = " select * from Contact where email = {email}";
}
public void findByPhoneNumber(){
    Query query = " select * from Contact where phoneNumber = {phoneNumber}";
}

}
