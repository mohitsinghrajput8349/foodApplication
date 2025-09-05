package com.example.foodorderback.dto;

import com.example.foodorderback.model.Meal;
import com.example.foodorderback.model.OrderItem;

public class ItemFromCartDTO {
	
// mujhe order item ko banaane aur database mein lgane par alg foood ke current price ko save rakhana chahiye tha, na ki keval food ki id ko database mein dalna, agar bhojan ki keemat baad mein badalti hai, to prices mein bhi diffrence hoga, jaise ki purane order ke liye keemat!!! isi tarah, behtar hota ki main imp variables (jaise name, type ka name ) ko wapas bhejtaa poorey object ko food ki id ke aadhaar par wapas bhejne ke bajaya isake alava, customer ko keval variables send krna sabse achcha hota, na ki objects kyonki is tarah objects ko bhejne par bevajah bahut saare data bheje jaate hain, jo nishchit roop se achchha nahi hai maine is baare mein shuru mein nahi socha, isliye ise abhi ke liye aise hi chhod diya gaya hai

	private Long mealId;
	private String mealName;
	private String mealTypeName;
	private String mealDescription;
	private String mealImage;
	private String mealImageName;
	private int mealPrice;
	
	private int quantity;
	
	public ItemFromCartDTO() {
		
	}
	
	public ItemFromCartDTO(OrderItem orderItem) {
		this.mealId = orderItem.getMeal().getId();
		this.mealName = orderItem.getMealName();
		this.mealTypeName = orderItem.getMealTypeName();
		this.mealDescription = orderItem.getMealDescription();
			this.mealImage = orderItem.getMeal().getImage();
		this.mealImageName = orderItem.getMealImageName();
		this.mealPrice = orderItem.getMealPrice();
		
		this.quantity = orderItem.getQuantity();
	}


	public int getQuantity() {
		return quantity;
	}

	public Long getMealId() {
		return mealId;
	}

	public void setMealId(Long mealId) {
		this.mealId = mealId;
	}

	public String getMealName() {
		return mealName;
	}

	public void setMealName(String mealName) {
		this.mealName = mealName;
	}

	public String getMealTypeName() {
		return mealTypeName;
	}

	public void setMealTypeName(String mealTypeName) {
		this.mealTypeName = mealTypeName;
	}

	public String getMealDescription() {
		return mealDescription;
	}

	public void setMealDescription(String mealDescription) {
		this.mealDescription = mealDescription;
	}

	public String getMealImage() {
		return mealImage;
	}

	public void setMealImage(String mealImage) {
		this.mealImage = mealImage;
	}

	public String getMealImageName() {
		return mealImageName;
	}

	public void setMealImageName(String mealImageName) {
		this.mealImageName = mealImageName;
	}

	public int getMealPrice() {
		return mealPrice;
	}

	public void setMealPrice(int mealPrice) {
		this.mealPrice = mealPrice;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
