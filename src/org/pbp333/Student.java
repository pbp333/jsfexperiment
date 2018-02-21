package org.pbp333;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	private String firstName;

	private String lastName;

	private String country;

	private List<String> countryOptions;

	private String favoriteLanguage;

	private List<String> favoriteLanguageOptions;

	private List<String> knownLanguages;

	private List<String> knownLanguagesOptions;

	public Student() {

		countryOptions = new ArrayList<>();
		countryOptions.add("Portugal");
		countryOptions.add("Spain");
		countryOptions.add("Brazil");
		countryOptions.add("USA");

		favoriteLanguageOptions = new ArrayList<>();
		favoriteLanguageOptions.add("Java");
		favoriteLanguageOptions.add("PHP");
		favoriteLanguageOptions.add("JavaScript");
		favoriteLanguageOptions.add("C#");

		knownLanguagesOptions = new ArrayList<>();
		knownLanguagesOptions.add("Java");
		knownLanguagesOptions.add("PHP");
		knownLanguagesOptions.add("JavaScript");
		knownLanguagesOptions.add("C#");

	}

	public List<String> getKnownLanguages() {
		return knownLanguages;
	}

	public void setKnownLanguages(List<String> knownLanguages) {
		this.knownLanguages = knownLanguages;
	}

	public List<String> getKnownLanguagesOptions() {
		return knownLanguagesOptions;
	}

	public void setKnownLanguagesOptions(List<String> knownLanguagesOptions) {
		this.knownLanguagesOptions = knownLanguagesOptions;
	}

	public void setCountryOptions(List<String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public void setFavoriteLanguageOptions(List<String> favoriteLanguageOptions) {
		this.favoriteLanguageOptions = favoriteLanguageOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public List<String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public List<String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
