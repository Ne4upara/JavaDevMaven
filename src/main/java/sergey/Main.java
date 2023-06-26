package sergey;


import com.google.gson.Gson;


public class Main
{
    public static void main( String[] args )
    {
        FullName fullName = new FullName("Sergey", "Tomachenko");

        Gson gson = new Gson();

        System.out.println(gson.toJson(fullName));
    }
}
