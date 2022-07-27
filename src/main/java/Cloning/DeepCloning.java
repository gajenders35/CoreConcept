package Cloning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
class Student implements Cloneable{
	private int sId;
	private String name;
	private Address address;
	
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Student cloned = (Student)super.clone();
		cloned.setAddress((Address) cloned.getAddress().clone());
		return cloned;
	}
}


@ToString
@AllArgsConstructor
@Getter
@Setter
class Address implements Cloneable{
	private String village;
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
public class DeepCloning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
	
	Address ad=new Address("Khairoli");
	Student orignal=new Student(1, "sonu", ad);
	
	
	Student cloned=(Student)orignal.clone();
	
	
	cloned.setName("");
	cloned.getAddress().setVillage("Mah");
	
	System.out.println(orignal);
	System.out.println(cloned);
	
	}
}
