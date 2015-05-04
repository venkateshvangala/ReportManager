package models.data;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;


@Entity
@Table(name = "rm_user")
public class User extends Model{

	@Id
	@GeneratedValue
	public long userId;
	
	@Column
	public String displayName;
	
	@Column 
	@Required
	public String email;
	
	@Column
	public String password;
	
	@Column
	public String mobile;
	
	@Column 
	public String firstName;
	
	@Column 
	public String lastName;
	
	@Column
	public String gender;
	
	@Column
	public int age;
	
	@Column
	public String role;
	
	public Timestamp lastUpdated;
	
	@Column 
	public String updatedBy;
	
	@Column 
	public String createdBy;
	
	public Timestamp dateCreated;
	
	public static Finder<Long, User> find = new Finder<Long, User>(Long.class, User.class);
	
	public static User findUserByEmail(String email){
		return User.find.where().eq("email", email).findUnique();
	}
	
	public static List<User> findAll(){
		return find.all();
	}
}
