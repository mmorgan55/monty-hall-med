package edu.cnm.deepdive.montyhallgame;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

  private TextView winTally;
  private TextView loseTally;
  private TextView userInfo;
  private Button switchButton;
  private Button stayButton;
  private ImageButton button1;
  private ImageButton button2;
  private ImageButton button3;
  private  boolean gameStart = false;
  private Random rng;
  private LinkedList<ImageButton> buttons;
  private ImageButton winButton;


  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    winTally = findViewById(R.id.win_tally);
    loseTally = findViewById(R.id.lose_tally);
    userInfo = findViewById(R.id.user_info);
    switchButton = findViewById(R.id.switch_button);
    stayButton = findViewById(R.id.stay_button);
    button1 = findViewById(R.id.button_one);
    button2 = findViewById(R.id.button_two);
    button3 = findViewById(R.id.button_three);
    rng = new Random();



    View.OnClickListener buttonListener = (view) -> {
      ((ImageButton) view).setImageResource(R.drawable.button_clicked);
      gameHasStarted();

    };


  }

  private void gameHasStarted () {
    if (gameStart) {
      gameStart = false;
      userInfo.setText("Pick a door");

    } else {
      gameStart = true;
      userInfo.setText("Do you want to switch?");
      switchButton.setVisibility(View.VISIBLE);
      stayButton.setVisibility(View.VISIBLE);
    }
  }

  private void setButtons () {
    buttons = new LinkedList<>();
    buttons.add(button1);
    buttons.add(button2);
    buttons.add(button3);


  }

  //TODO reset game state and variables
  private void resetState () {

  }
}
