package com.example.dbconnection;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DbconnectionApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(DbconnectionApplication.class, args);
	}
	
	@Override
	public void run(String... args)throws Exception{
		String sql = "INSERT INTO stu_db (id, sname, dept) VALUES (?, ?, ?)";
		
		int result = jdbcTemplate.update(sql, 5,"Lexi", "civil");
		
		if(result>0) {
			System.out.println("A new row has been added");
		}
	}

}
