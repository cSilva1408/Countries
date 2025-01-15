public class Country
{
  //Coder: Carlos Silva
  //Date: 1/14/2025
  //Run GeoGame Java GUI with an Array of Countries

  // add private instance variables for the name, capital, language, and image file.
  private String name;
  private String language;
  private String capital;
  private String image;
  // add constructors
  public Country(String name, String language, String captial, String image) {
    this.name  = name;
    this.language = language;
    this.capital = capital;
    this.image = image; 
}
  // Write accessor/get methods for each instance variable that returns it.
  public Country() {
  
}

  public String getName() {
    return name;
}

 public String getLanguage() {
    return language;
}

  public String getCaptial() {
    return capital;
}

  public String getImage() {
    return image;
}
  // Write a toString() method that returns a concatenated String of 3 of the instance variables in a sentence like "..'s capital is .. and its primary language is ..."
  public String toString() {
    return name + "'s capital is " + capital + " and its primary language is " + language;
  }
}