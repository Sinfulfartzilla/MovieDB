//this will have the methods to get the information about the movies
public class movieInfo {
	String response;
	
	//this is the method used to get the information regarding the movie
	public String getMovieInfo(String searchTerm) {
		return response = OMDB_GET.searchMovieByTitle(searchTerm, "852159f0");
	}
	
}
