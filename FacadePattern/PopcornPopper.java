package FacadePattern;

public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void pop() {
		System.out.println(description + " 팝콘 튀기기!");
	}
 
  
        public String toString() {
                return description;
        }
}
