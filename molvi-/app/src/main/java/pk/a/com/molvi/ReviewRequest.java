package pk.a.com.molvi;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import pk.a.com.molvi.RequestExecuter.RegisterRequest;
import pk.a.com.molvi.RequestExecuter.reviewRequest;

/**
 * Created by WhySoSerious on 8/24/2016.
 */
public class ReviewRequest extends Activity {
    TextView tv,tv2;
    String a,b,Userid;
    SharedPreferences prefs;
    String key,coment;
    EditText comment;
    Button submit;
    int userid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_contact_us);
tv= (TextView) findViewById(R.id.nameshow);
        tv2= (TextView) findViewById(R.id.contactshow);
        comment= (EditText) findViewById(R.id.comment);
        submit= (Button) findViewById(R.id.submit);
        Intent intent = getIntent();
        a=intent.getStringExtra("name");
        b=intent.getStringExtra("phone");
        userid=intent.getIntExtra("id",0);
        Userid=Integer.toString(userid);
        tv.setText(a);
        tv2.setText(b);
        prefs = getSharedPreferences("data", Context.MODE_PRIVATE);

        key=prefs.getString("key","N/A");
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getValues();
            }
        });

    }
    protected void getValues() {
        coment = comment.getText().toString();
        Response.Listener<String> responselistener = new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(ReviewRequest.this,"come in response listerner "+" ",Toast.LENGTH_LONG).show();
                String key= response;
                if(key.equals(200))
                {
                   // Intent i=new Intent(ReviewRequest.this,Home_Activity.class);
                    //startActivity(i);
                    Toast.makeText(ReviewRequest.this,"ok",Toast.LENGTH_LONG).show();
                }


            }
        };



        reviewRequest reviewRequest = new reviewRequest(coment,Userid,key,responselistener);
        RequestQueue queue = Volley.newRequestQueue(ReviewRequest.this);
        queue.add(reviewRequest);




    }
}
