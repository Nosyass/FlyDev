package tn.esprit.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	private  int id ;
private String Login ;
private String Password ;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}

@Id
@GeneratedValue(strategy=GenerationType.AUTO)
public String getLogin() {
	return Login;
}
public void setLogin(String login) {
	Login = login;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}




}
