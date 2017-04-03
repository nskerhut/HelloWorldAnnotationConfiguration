package HelloWorldMaven;

public class HelloWorld {

	public static void main(String[] args) {
		HelloWorldModel model = new HelloWorldModel();
		model.setValue("Hello World from Maven!!!!");
		
		System.out.println(model.getValue());

	}

}
