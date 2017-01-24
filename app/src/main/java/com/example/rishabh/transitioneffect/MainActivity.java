package com.example.rishabh.transitioneffect;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.transition.TransitionManager;
public class MainActivity extends AppCompatActivity {

    ViewGroup activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    activity_main=(ViewGroup)findViewById(R.id.activity_main);
        activity_main.setOnTouchListener(
              new RelativeLayout.OnTouchListener(){
                  @Override
                  public boolean onTouch(View v, MotionEvent event) {
                      move();
                      return true;
                  }
              }
        );
        }
    public void move(){
        TransitionManager.beginDelayedTransition(activity_main);
        //for changing the position

        View button=findViewById(R.id.button);
        RelativeLayout.LayoutParams positionRules= new RelativeLayout.LayoutParams( RelativeLayout.LayoutParams.WRAP_CONTENT,RelativeLayout.LayoutParams.WRAP_CONTENT);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_BOTTOM,RelativeLayout.TRUE);
        positionRules.addRule(RelativeLayout.ALIGN_PARENT_RIGHT,RelativeLayout.TRUE);
        button.setLayoutParams(positionRules);

        //for changing the size
        ViewGroup.LayoutParams sizeRule=button.getLayoutParams();
        sizeRule.width=300;
        sizeRule.height=300;
        button.setLayoutParams(sizeRule);

    }
    }

