package week3.day1.polymorphism;

public class APIClient {
	
	public void sendRequest(String endPoint) {
		
		System.out.println(endPoint);

	}
	
	public void sendRequest (String endPoint, String requestBody , String requestStatus) {
		
		System.out.println(endPoint+requestBody+requestStatus);

	}
	
	public static void main(String[] args) {
		
		APIClient ol = new APIClient();
		ol.sendRequest("abcd");
		ol.sendRequest("this", "is", "overloading");
	}

}
