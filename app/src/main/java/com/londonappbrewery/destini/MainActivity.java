package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int  mStoryIndex = 1;

//    String mButtonTopText;
//    String mButtonBottomText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mTextView = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);


//        mButtonTopText = (String) mButtonTop.getText();
//        mButtonBottomText = (String) mButtonBottom.getText();

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View view) {

//                if(mButtonTop.getText() == mButtonTop.getResources().getString(R.string.T1_Ans1)){
                if(mStoryIndex == 1){
                    mTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);

                    mStoryIndex = 3;
                }

               else if(mStoryIndex == 2){
                    mTextView.setText(R.string.T3_Story);
                    mButtonTop.setText(R.string.T3_Ans1);
                    mButtonBottom.setText(R.string.T3_Ans2);

                    mStoryIndex = 7;
                }

               else if((mStoryIndex == 3) || (mStoryIndex == 7)){
                    mTextView.setText(R.string.T6_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                    mStoryIndex = 6;
                }
            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                if(mButtonBottom.getText() == mButtonBottom.getResources().getString(R.string.T1_Ans2)){
                if(mStoryIndex == 1){
                    mTextView.setText(R.string.T2_Story);
                    mButtonTop.setText(R.string.T2_Ans1);
                    mButtonBottom.setText(R.string.T2_Ans2);

                    mStoryIndex = 2;
                }

               else if(mStoryIndex == 2){
                    mTextView.setText(R.string.T4_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                    mStoryIndex = 4;
                }

                else if((mStoryIndex == 3) || (mStoryIndex == 7)){
                    mTextView.setText(R.string.T5_End);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);

                    mStoryIndex = 5;
                }
            }
        });
    }
}
