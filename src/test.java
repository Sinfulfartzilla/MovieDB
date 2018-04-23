import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

//this is a required for the json stuff to work.
import org.json.JSONArray;
import org.json.JSONObject;


public class test {
	public test Rocky;
    ArrayList<test> MovieEntry = new ArrayList<test>();  //this is where all the movies are going to be stored.
    ArrayList<String> ArrayPOS = new ArrayList<String>();  //this is to save the specific location in the array
    
    //movie details
    public String Title;
    public String Year;
    public String Type;
    
    //constructor
    public test(String title, String year, String type) {
    	Title = title;
    	Year = year;
    	Type = type;
    	
    }
	
    
    public void movieBuilder(String s1, String s2, String s3) {
    	
    	
    }
    //builder (move to a method)
	public static void main(String[] args) throws Exception {
		String b1 = null, b2 = null, b3 = null;
	    String jsonInput = OMDB_GET.searchMovieByTitle("batman", "852159f0");
	
	    //creating a new json object	
	    JSONObject jsonout = new JSONObject(jsonInput);
	    
	    //setting up the array(everything is stored inside or "search"
	    JSONArray jsonArray = jsonout.getJSONArray("Search");
	    
	    //for the array length, this will print out all the results.
	    for (int i = 0, size = jsonArray.length(); i < size; i++)
	    {
	      JSONObject objectInArray = jsonArray.getJSONObject(i);

	      // "...and get thier component and thier value."
	      String[] elementNames = JSONObject.getNames(objectInArray);
	      System.out.printf("%d Info About Movie:\n", elementNames.length);
	      for (String elementName : elementNames)
	      {
	        String value = objectInArray.getString(elementName);
	    	  
	    	//create strings for each element that is currently being stored  
	        b1 = objectInArray.getString("Title");
	        b2 = objectInArray.getString("Type");
	        b3 = objectInArray.getString("Year");
	        
	        Toolkit tk = Toolkit.getDefaultToolkit();
	        tk.beep();
	        Thread.sleep(500);
	       
	        
	        System.out.printf("name=%s, value=%s\n", elementName, value);
	      }
	      System.out.println();
	      
	    }
	  }
}
