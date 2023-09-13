package Variables;

public class VariablesProgram1 {
	int a=10;
	static int b=20;
	

	public static void main(String[] args) {
		VariablesProgram1 vb= new VariablesProgram1();
		System.out.println(vb.a);
		System.out.println(vb.b);
vb.a=100;
vb.b=200;
System.out.println(vb.a);
System.out.println(vb.b);
VariablesProgram1 vbb= new VariablesProgram1();
System.out.println(vbb.a);
System.out.println(vbb.b);

	}

}
