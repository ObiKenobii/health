package health;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import health.LoginDAO;

public class LoginBean {
	private String username;
	private String password;

	
	/*
	public String login() {
		return validateUsernamePassword();
	}
	*/

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// validate login
	public String validateUsernamePassword() {
		/*
		 * boolean valid = LoginDAO.validate(username, password);
		 */
		
		// Fake Authentifizierung
		boolean valid = false;
		boolean isAdmin = false;
		if (getPassword().equals("passwort") && getUsername().equals("admin")) {
			valid = true;
			isAdmin = true;
		} else if (getPassword().equals("passwort") && getUsername().equals("user")){
			valid = true;
		} if (valid) {
			HttpSession session = SessionBean.getSession();
			session.setAttribute("username", username);
			if (isAdmin){
				return "admin";
			} else {
				return "true";
			}
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage(FacesMessage.SEVERITY_WARN,
							"Incorrect Username and Passowrd",
							"Please enter correct username and Password"));
			return "false";
		}
	}

	// logout event, invalidate session
	public String logout() {
		HttpSession session = SessionBean.getSession();
		session.invalidate();
		return "login";
	}

}
