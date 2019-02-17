

package useOfgenerics;


public class GenericExample<T> {
	private T a;
	private T d;
	
	public void add(T t) {
		this.a =t;
		
	}
	
	public void sum(T c) {
		this.d =c;
		}
	
	public T print() {
		return a ;
	}
	public T get() {
		return d ;
	}
	
	
	
}
