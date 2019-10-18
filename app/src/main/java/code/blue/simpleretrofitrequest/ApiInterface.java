package code.blue.simpleretrofitrequest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    //https://programming-quotes-api.herokuapp.com/
    @GET("quotes")
    Call<List<Quote>> getQuotes();
}
