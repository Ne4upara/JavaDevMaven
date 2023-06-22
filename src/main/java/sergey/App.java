package sergey;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class App
{
    public static void main( String[] args )
    {
        FullName fullName = new FullName("Sergey", "Tomachenko");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
      //  String j = gson.toJson(fullName);

        System.out.println(gson.toJson(fullName));


    }
}
