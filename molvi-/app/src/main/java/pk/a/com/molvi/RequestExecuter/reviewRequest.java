package pk.a.com.molvi.RequestExecuter;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by WhySoSerious on 9/20/2016.
 */
public class reviewRequest extends StringRequest {
    private Map<String,String> params;

    public reviewRequest(String review,String userId , String writerId, Response.Listener<String> listener) {
        super(Request.Method.POST, AppURLs.BaseUrl+AppURLs.review, listener, null);
        params = new HashMap<>();
        params.put("review", review);
        params.put("userid", userId);
        params.put("writerid", writerId);


    }
    @Override
    public Map<String,String> getParams()
    {
        return  params;
    }
}
