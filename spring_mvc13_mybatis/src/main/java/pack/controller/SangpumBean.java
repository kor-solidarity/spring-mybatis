package pack.controller;

public class SangpumBean {
	// 10.10-3-27
	// private String code, sang, su ,dan; // needed in insert/update
	private String searchValue;

	public String getSearchValue() {
		System.out.println("SangpumBean.getSearchValue()");
		return searchValue;
	}

	public void setSearchValue(String searchValue) {
		System.out.println("SangpumBean.setSearchValue()");
		this.searchValue = searchValue;
	}
	
	
	
	
	
}
