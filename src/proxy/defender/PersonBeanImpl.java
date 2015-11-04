package proxy.defender;

public class PersonBeanImpl implements PersonBean {
	String name;
	String gender;
	String interests;
	int rating;
	int ratingCount;
	
	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getInterests() {
		return interests;
	}

	
	public int getRating() {
		if (ratingCount == 0){
			return 0;
		} else {
			return rating / ratingCount;
		}
	}

	
	public void setName(String name) {
		this.name = name;

	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	public void setInterests(String interests) {
		this.interests = interests;

	}

	@Override
	public void setRating(int rating) {
		this.rating += rating;
		ratingCount++;

	}

}
