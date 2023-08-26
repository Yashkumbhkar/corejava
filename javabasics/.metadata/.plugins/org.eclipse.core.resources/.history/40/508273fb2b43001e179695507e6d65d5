package com.rays.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable {

	 public int id = 0;
	 public String name = null;
	 public  String  adress =null;
	 public  transient int salary = 0;
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
		out.writeObject(name);
		out.writeObject(adress);
		out.writeInt(salary);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id =in.readInt();
		name=(String) in.readObject();
		adress  = (String) in.readObject();
		salary = in.readInt();
		
		
	}
	  
	   
}
