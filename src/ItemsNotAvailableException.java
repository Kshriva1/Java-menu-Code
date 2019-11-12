
public class ItemsNotAvailableException extends Throwable {
	public String message;
	ItemsNotAvailableException(String message){
		this.message = message;
	}
}
