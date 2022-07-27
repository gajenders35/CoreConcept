package Cloning;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
class Employe implements Cloneable{
	private int EmpId;
	private String name;
	
	private Department department;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

@ToString
@AllArgsConstructor
@Setter
@Getter
class Department {

	private int deprtmentId;
	private String name;
}


public class ShallowCloning {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Department department=new Department(201, "CSE");
		Employe orignal=new Employe(1,"sonu",department);
		System.out.println(orignal.hashCode());
		System.out.println(orignal);
		
		orignal.getDepartment().setName("IT");
		orignal.setEmpId(2);
		
		System.out.println("after changing");
		System.out.println(orignal);
		Employe cloned=(Employe) orignal.clone();
		System.out.println(cloned.hashCode());
		System.out.println(cloned);
	}

}
