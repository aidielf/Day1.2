package id.aidiel.day12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class BelajarComponent extends AppCompatActivity {


    ImageView keboenpict, androidpict;
    TextView keboentext, locationdetial;
    Button hotelbutton, sharebutton;

    int i1, i2, i3, i4;
    String s1, s2, s3, s4, b1, b2, b3, b4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi variable ImageView
        keboenpict = (ImageView) findViewById(R.id.keboenpict);
        androidpict = (ImageView) findViewById(R.id.androidpict);
        //inisialisasi variable textview
        keboentext = (TextView) findViewById(R.id.keboentext);
        locationdetial = (TextView) findViewById(R.id.locationdetail);
        //inisialisasi variable button
        hotelbutton = (Button) findViewById(R.id.hotelbutton);
        sharebutton = (Button) findViewById(R.id.sharebutton);

        //set component untuk ImageView

        i1=R.drawable.room;
        i2=R.drawable.hotel;
        i3=R.drawable.keboen;
        i4=R.drawable.android;

        //set component untuk TextView

        s1="MARGO HOTEL";
        s2="JL. MARGONDA RAYA";
        s3="KEBOEN CODING";
        s4="DEPOK";

        //set component untuk Button

        b1="BOOKING NOW";
        b2="KEBOEN CODING";
        b3="HOTEL";
        b4="SHARE";

        hotelbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setObject(i1,i2,s1,s2,b1,b2);
            }
        });
        sharebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setObject(i3,i4,s3,s4,b3,b4);
            }
        });
    }

    private void setObject(int i1,int i2,String s1,String s2,String b1,String b2){
        keboenpict.setImageResource(i1);
        androidpict.setImageResource(i2);

        keboentext.setText(s1);
        locationdetial.setText(s2);

        hotelbutton.setText(b1);
        sharebutton.setText(b2);
    }
}
