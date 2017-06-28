/**
 * Making a class names Message
 * @author Pri
 *
 */
public class Message {
	//Taking a private variable string
private String msg;
//Making a constructor that takes msg as argument of type String
public Message( String msg){
	this.msg=msg;
}
//Here we have getters and setters
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
}
