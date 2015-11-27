package test;

public class NullParameterOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullParameterOverloading obj = new NullParameterOverloading();
	        obj.overLoad(null);
	}
	private void overLoad(Object o){
        System.out.println("Object o arguement method.");
    }
    private void overLoad(double[] dArray){
        System.out.println("Double array argument method.");
    }

}
