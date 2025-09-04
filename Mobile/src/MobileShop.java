import java.util.ArrayList;
public class MobileShop {
	

	 
	    public static void main(String[] args) {
	      
	        ArrayList mobileList = new ArrayList<>();

	        Mobile iphone = new Mobile("Apple", "iPhone 20", 5999);
	        Mobile Oppo = new Mobile("Oppo", "new12", 1899);
	        Mobile Nokia = new Mobile("Nokia", "sony13", 333);
	        Mobile onePlus = new Mobile("OnePlus", "9 Pro", 444);
	        Mobile xiaomi = new Mobile("Xiaomi", "12 Pro", 111);

	     
	        mobileList.add(iphone);
	        mobileList.add(Oppo);
	        mobileList.add(Nokia);
	        mobileList.add(onePlus);
	        mobileList.add(xiaomi);
	       
	        System.out.println("List of Mobile Phones:");

	       	for (int i = 0; i < mobileList.size(); i++) {
	            Object mobile = mobileList.get(i);
	          
	            System.out.println("Brand: " + ((Mobile) mobile).getBrand() + ", Model: " + ((Mobile) mobile).getModel() + ", Price: " + ((Mobile) mobile).getPrice());


	       
	}
}
}
