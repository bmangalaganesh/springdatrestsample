/**
 * 
 */
package com.scb.data.rest.domain;


import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "users", path = "users")
//public interface UserRepository extends PagingAndSortingRepository<WebsiteUser, Long> {
    //List<WebsiteUser> findByName(@Param("name") String name);
//}

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

/**
 * @author Manglu
 *
 */
@Service
public interface CompanyRepository extends JpaRepository<Company, Integer> {
	
	//Find using the Property Name
	List<Company> findBysNameEnglish(@Param("name") String name);

	List<Company>findAll();
}
