package com.day8.serilizationInheritance;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Users implements Externalizable{
	private int id;
	private String name;
	private String password;
	private String roles;
	public Users() {}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.write(id);
		out.writeObject(name);
		out.writeObject(password);
		//out.writeObject(roles);
	}
	
	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=in.readInt();
		name=(String) in.readObject();
		password=(String) in.readObject();
		//roles=(String) in.readObject();
		
	}
	
	public Users(int id, String name, String password, String roles) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.roles = roles;
	}
	
}
public class DemoExternilazation {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("extenal.ser"));
		Users user=new Users(121, "twju", "raj1235", "admin");
		oos.writeObject(user);
		
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("extenal.ser"));
		Users user2=(Users) ois.readObject();
		oos.writeObject(user2);
		
		
		
		
	}

}
