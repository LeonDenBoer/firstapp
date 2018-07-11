package nl.hu.v1.wac.firstapp.persistence;

public interface UserDao {
	
	String findRoleForUser(String name, String pass);

}
