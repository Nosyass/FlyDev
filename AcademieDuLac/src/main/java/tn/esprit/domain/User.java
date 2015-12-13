package tn.esprit.domain;

import javax.persistence.Entity;

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
