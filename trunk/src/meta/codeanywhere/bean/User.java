/**
 * User.java
 */
package meta.codeanywhere.bean;

/**
 * @author Biao Zhang
 * @version 11/17/2006
 */
public class User {
	private Integer id;
	private String username = null;
	private String password = null;
	private String email = null;
	
	public User() {
	}

	public User(int id, String username, String password, String email) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email Ҫ���õ� email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id Ҫ���õ� id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password Ҫ���õ� password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username Ҫ���õ� username
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	
}
