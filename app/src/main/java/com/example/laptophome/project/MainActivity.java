package com.example.laptophome.project;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    Random rand = new Random();
    Button start;
    private static final int[] idArray = {R.id.bt0, R.id.bt1, R.id.bt2, R.id.bt3, R.id.bt4, R.id.bt5, R.id.bt6, R.id.bt7, R.id.bt8};
    MediaPlayer mediaPlayer;
    final int[] myMusic = {R.raw.sound0, R.raw.sound1, R.raw.sound2};
    private Button[] bt = new Button[idArray.length];
    int c;
    int z, y, flag1 = 50, flag3 = 100, flag2 = 150, flag4 = 200;
    int count_sound = 0, count_square = 0,count1=0,count2=0;
    //Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11;
    TextView result ;

    Button sound_btn;
    Button square_btn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();


        sound_btn=(Button)findViewById(R.id.sound_btn);
        square_btn=(Button)findViewById(R.id.square_btn);
        start=(Button)findViewById(R.id.start_btn);

        square_btn.setVisibility(View.INVISIBLE);
        sound_btn.setVisibility(View.INVISIBLE);
         result=(TextView)findViewById(R.id.textView4);
        result.setText(" ");
        result.setVisibility(View.INVISIBLE);
        count_square = 0;
        count_sound = 0;
        count2=0;
        count1=0;
        for (int i = 0; i < idArray.length; i++) {
            final int b = i;

            bt[b] = (Button) findViewById(idArray[b]);
            bt[b].setVisibility(View.INVISIBLE);
        }



    }


    public void ran(View v) {


        start.setVisibility(View.INVISIBLE);
        for (int i = 0; i < idArray.length; i++) {
            final int b = i;

            bt[b] = (Button) findViewById(idArray[b]);
            bt[b].setVisibility(View.INVISIBLE);
        }
        square_btn.setVisibility(View.VISIBLE);
        sound_btn.setVisibility(View.VISIBLE);
        result.setText("");
        count1=0;
        count2=0;
        flag1 = 50;
        flag3 = 100;
        flag2 = 150;
        flag4 = 200;
        count_sound = 0;
        count_square = 0;
        result.setVisibility(View.INVISIBLE);

        z = rand.nextInt(9);
        flag2 = z;
        y = rand.nextInt(3);
        flag4 = y;
        new CountDownTimer(2000, 1000) {


            public void onTick(long milli5tilFinished) {

                bt[z] = (Button) findViewById(idArray[z]);
                bt[z].setVisibility(View.VISIBLE);
                mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                mediaPlayer.start();
            }

            public void onFinish() {
                bt[0].setVisibility(View.INVISIBLE);
                bt[1].setVisibility(View.INVISIBLE);
                bt[2].setVisibility(View.INVISIBLE);
                bt[3].setVisibility(View.INVISIBLE);
                bt[4].setVisibility(View.INVISIBLE);
                bt[5].setVisibility(View.INVISIBLE);
                bt[6].setVisibility(View.INVISIBLE);
                bt[7].setVisibility(View.INVISIBLE);
                bt[8].setVisibility(View.INVISIBLE);

                mediaPlayer.release();

                z = rand.nextInt(9);
                flag1 = z;
                y = rand.nextInt(3);
                flag3 = y;

                new CountDownTimer(2000, 1000) {

                    public void onTick(long milli5tilFinished) {

                        if (flag1 == flag2) {
                            count_square++;
                        }
                        if (flag3 == flag4) {
                            count_sound++;
                        }

                        bt[z] = (Button) findViewById(idArray[z]);
                        bt[z].setVisibility(View.VISIBLE);
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                        mediaPlayer.start();
                    }

                    public void onFinish() {
                        bt[0].setVisibility(View.INVISIBLE);
                        bt[1].setVisibility(View.INVISIBLE);
                        bt[2].setVisibility(View.INVISIBLE);
                        bt[3].setVisibility(View.INVISIBLE);
                        bt[4].setVisibility(View.INVISIBLE);
                        bt[5].setVisibility(View.INVISIBLE);
                        bt[6].setVisibility(View.INVISIBLE);
                        bt[7].setVisibility(View.INVISIBLE);
                        bt[8].setVisibility(View.INVISIBLE);
                        mediaPlayer.release();


                        z = rand.nextInt(9);
                        flag2 = z;
                        y = rand.nextInt(3);
                        flag4 = y;
                        new CountDownTimer(2000, 1000) {

                            public void onTick(long milli5tilFinished) {

                                if (flag1 == flag2) {
                                    count_square++;
                                }
                                if (flag3 == flag4) {
                                    count_sound++;
                                }
                                bt[z] = (Button) findViewById(idArray[z]);
                                bt[z].setVisibility(View.VISIBLE);
                                mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                mediaPlayer.start();
                            }

                            public void onFinish() {
                                bt[0].setVisibility(View.INVISIBLE);
                                bt[1].setVisibility(View.INVISIBLE);
                                bt[2].setVisibility(View.INVISIBLE);
                                bt[3].setVisibility(View.INVISIBLE);
                                bt[4].setVisibility(View.INVISIBLE);
                                bt[5].setVisibility(View.INVISIBLE);
                                bt[6].setVisibility(View.INVISIBLE);
                                bt[7].setVisibility(View.INVISIBLE);
                                bt[8].setVisibility(View.INVISIBLE);
                                mediaPlayer.release();

                                z = rand.nextInt(9);
                                flag1 = z;
                                y = rand.nextInt(3);
                                flag3 = y;

                                new CountDownTimer(2000, 1000) {


                                    public void onTick(long milli5tilFinished) {
                                        if (flag1 == flag2) {
                                            count_square++;
                                        }
                                        if (flag3 == flag4) {
                                            count_sound++;
                                        }


                                        bt[z] = (Button) findViewById(idArray[z]);
                                        bt[z].setVisibility(View.VISIBLE);
                                        mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                        mediaPlayer.start();

                                    }

                                    public void onFinish() {
                                        bt[0].setVisibility(View.INVISIBLE);
                                        bt[1].setVisibility(View.INVISIBLE);
                                        bt[2].setVisibility(View.INVISIBLE);
                                        bt[3].setVisibility(View.INVISIBLE);
                                        bt[4].setVisibility(View.INVISIBLE);
                                        bt[5].setVisibility(View.INVISIBLE);
                                        bt[6].setVisibility(View.INVISIBLE);
                                        bt[7].setVisibility(View.INVISIBLE);
                                        bt[8].setVisibility(View.INVISIBLE);
                                        mediaPlayer.release();
                                        z = rand.nextInt(9);
                                        flag2 = z;
                                        y = rand.nextInt(3);
                                        flag4 = y;
                                        new CountDownTimer(2000, 1000) {


                                            public void onTick(long milli5tilFinished) {

                                                if (flag1 == flag2) {
                                                    count_square++;
                                                }
                                                if (flag3 == flag4) {
                                                    count_sound++;
                                                }
                                                bt[z] = (Button) findViewById(idArray[z]);
                                                bt[z].setVisibility(View.VISIBLE);
                                                mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                mediaPlayer.start();
                                            }

                                            public void onFinish() {
                                                bt[0].setVisibility(View.INVISIBLE);
                                                bt[1].setVisibility(View.INVISIBLE);
                                                bt[2].setVisibility(View.INVISIBLE);
                                                bt[3].setVisibility(View.INVISIBLE);
                                                bt[4].setVisibility(View.INVISIBLE);
                                                bt[5].setVisibility(View.INVISIBLE);
                                                bt[6].setVisibility(View.INVISIBLE);
                                                bt[7].setVisibility(View.INVISIBLE);
                                                bt[8].setVisibility(View.INVISIBLE);

                                                mediaPlayer.release();

                                                z = rand.nextInt(9);
                                                flag1 = z;
                                                y = rand.nextInt(3);
                                                flag3 = y;

                                                new CountDownTimer(2000, 1000) {

                                                    public void onTick(long milli5tilFinished) {

                                                        if (flag1 == flag2) {
                                                            count_square++;
                                                        }
                                                        if (flag3 == flag4) {
                                                            count_sound++;
                                                        }

                                                        bt[z] = (Button) findViewById(idArray[z]);
                                                        bt[z].setVisibility(View.VISIBLE);
                                                        mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                        mediaPlayer.start();
                                                    }

                                                    public void onFinish() {
                                                        bt[0].setVisibility(View.INVISIBLE);
                                                        bt[1].setVisibility(View.INVISIBLE);
                                                        bt[2].setVisibility(View.INVISIBLE);
                                                        bt[3].setVisibility(View.INVISIBLE);
                                                        bt[4].setVisibility(View.INVISIBLE);
                                                        bt[5].setVisibility(View.INVISIBLE);
                                                        bt[6].setVisibility(View.INVISIBLE);
                                                        bt[7].setVisibility(View.INVISIBLE);
                                                        bt[8].setVisibility(View.INVISIBLE);
                                                        mediaPlayer.release();


                                                        z = rand.nextInt(9);
                                                        flag2 = z;
                                                        y = rand.nextInt(3);
                                                        flag4 = y;
                                                        new CountDownTimer(2000, 1000) {

                                                            public void onTick(long milli5tilFinished) {

                                                                if (flag1 == flag2) {
                                                                    count_square++;
                                                                }
                                                                if (flag3 == flag4) {
                                                                    count_sound++;
                                                                }
                                                                bt[z] = (Button) findViewById(idArray[z]);
                                                                bt[z].setVisibility(View.VISIBLE);
                                                                mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                                mediaPlayer.start();
                                                            }

                                                            public void onFinish() {
                                                                bt[0].setVisibility(View.INVISIBLE);
                                                                bt[1].setVisibility(View.INVISIBLE);
                                                                bt[2].setVisibility(View.INVISIBLE);
                                                                bt[3].setVisibility(View.INVISIBLE);
                                                                bt[4].setVisibility(View.INVISIBLE);
                                                                bt[5].setVisibility(View.INVISIBLE);
                                                                bt[6].setVisibility(View.INVISIBLE);
                                                                bt[7].setVisibility(View.INVISIBLE);
                                                                bt[8].setVisibility(View.INVISIBLE);
                                                                mediaPlayer.release();

                                                                z = rand.nextInt(9);
                                                                flag1 = z;
                                                                y = rand.nextInt(3);
                                                                flag3 = y;

                                                                new CountDownTimer(2000, 1000) {


                                                                    public void onTick(long milli5tilFinished) {
                                                                        if (flag1 == flag2) {
                                                                            count_square++;
                                                                        }
                                                                        if (flag3 == flag4) {
                                                                            count_sound++;
                                                                        }


                                                                        bt[z] = (Button) findViewById(idArray[z]);
                                                                        bt[z].setVisibility(View.VISIBLE);
                                                                        mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                                        mediaPlayer.start();

                                                                    }

                                                                    public void onFinish() {
                                                                        bt[0].setVisibility(View.INVISIBLE);
                                                                        bt[1].setVisibility(View.INVISIBLE);
                                                                        bt[2].setVisibility(View.INVISIBLE);
                                                                        bt[3].setVisibility(View.INVISIBLE);
                                                                        bt[4].setVisibility(View.INVISIBLE);
                                                                        bt[5].setVisibility(View.INVISIBLE);
                                                                        bt[6].setVisibility(View.INVISIBLE);
                                                                        bt[7].setVisibility(View.INVISIBLE);
                                                                        bt[8].setVisibility(View.INVISIBLE);
                                                                        mediaPlayer.release();
                                                                        z = rand.nextInt(9);
                                                                        flag2 = z;
                                                                        y = rand.nextInt(3);
                                                                        flag4 = y;
                                                                        new CountDownTimer(2000, 1000) {


                                                                            public void onTick(long milli5tilFinished) {

                                                                                if (flag1 == flag2) {
                                                                                    count_square++;
                                                                                }
                                                                                if (flag3 == flag4) {
                                                                                    count_sound++;
                                                                                }
                                                                                bt[z] = (Button) findViewById(idArray[z]);
                                                                                bt[z].setVisibility(View.VISIBLE);
                                                                                mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                                                mediaPlayer.start();
                                                                            }

                                                                            public void onFinish() {
                                                                                bt[0].setVisibility(View.INVISIBLE);
                                                                                bt[1].setVisibility(View.INVISIBLE);
                                                                                bt[2].setVisibility(View.INVISIBLE);
                                                                                bt[3].setVisibility(View.INVISIBLE);
                                                                                bt[4].setVisibility(View.INVISIBLE);
                                                                                bt[5].setVisibility(View.INVISIBLE);
                                                                                bt[6].setVisibility(View.INVISIBLE);
                                                                                bt[7].setVisibility(View.INVISIBLE);
                                                                                bt[8].setVisibility(View.INVISIBLE);

                                                                                mediaPlayer.release();

                                                                                z = rand.nextInt(9);
                                                                                flag1 = z;
                                                                                y = rand.nextInt(3);
                                                                                flag3 = y;

                                                                                new CountDownTimer(2000, 1000) {

                                                                                    public void onTick(long milli5tilFinished) {

                                                                                        if (flag1 == flag2) {
                                                                                            count_square++;
                                                                                        }
                                                                                        if (flag3 == flag4) {
                                                                                            count_sound++;
                                                                                        }

                                                                                        bt[z] = (Button) findViewById(idArray[z]);
                                                                                        bt[z].setVisibility(View.VISIBLE);
                                                                                        mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                                                        mediaPlayer.start();
                                                                                    }

                                                                                    public void onFinish() {
                                                                                        bt[0].setVisibility(View.INVISIBLE);
                                                                                        bt[1].setVisibility(View.INVISIBLE);
                                                                                        bt[2].setVisibility(View.INVISIBLE);
                                                                                        bt[3].setVisibility(View.INVISIBLE);
                                                                                        bt[4].setVisibility(View.INVISIBLE);
                                                                                        bt[5].setVisibility(View.INVISIBLE);
                                                                                        bt[6].setVisibility(View.INVISIBLE);
                                                                                        bt[7].setVisibility(View.INVISIBLE);
                                                                                        bt[8].setVisibility(View.INVISIBLE);
                                                                                        mediaPlayer.release();


                                                                                        z = rand.nextInt(9);
                                                                                        flag2 = z;
                                                                                        y = rand.nextInt(3);
                                                                                        flag4 = y;
                                                                                        new CountDownTimer(2000, 1000) {

                                                                                            public void onTick(long milli5tilFinished) {

                                                                                                if (flag1 == flag2) {
                                                                                                    count_square++;
                                                                                                }
                                                                                                if (flag3 == flag4) {
                                                                                                    count_sound++;
                                                                                                }
                                                                                                bt[z] = (Button) findViewById(idArray[z]);
                                                                                                bt[z].setVisibility(View.VISIBLE);
                                                                                                mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                                                                mediaPlayer.start();
                                                                                            }

                                                                                            public void onFinish() {
                                                                                                bt[0].setVisibility(View.INVISIBLE);
                                                                                                bt[1].setVisibility(View.INVISIBLE);
                                                                                                bt[2].setVisibility(View.INVISIBLE);
                                                                                                bt[3].setVisibility(View.INVISIBLE);
                                                                                                bt[4].setVisibility(View.INVISIBLE);
                                                                                                bt[5].setVisibility(View.INVISIBLE);
                                                                                                bt[6].setVisibility(View.INVISIBLE);
                                                                                                bt[7].setVisibility(View.INVISIBLE);
                                                                                                bt[8].setVisibility(View.INVISIBLE);
                                                                                                mediaPlayer.release();

                                                                                                z = rand.nextInt(9);
                                                                                                flag1 = z;
                                                                                                y = rand.nextInt(3);
                                                                                                flag3 = y;

                                                                                                new CountDownTimer(2000, 1000) {


                                                                                                    public void onTick(long milli5tilFinished) {
                                                                                                        if (flag1 == flag2) {
                                                                                                            count_square++;
                                                                                                        }
                                                                                                        if (flag3 == flag4) {
                                                                                                            count_sound++;
                                                                                                        }


                                                                                                        bt[z] = (Button) findViewById(idArray[z]);
                                                                                                        bt[z].setVisibility(View.VISIBLE);
                                                                                                        mediaPlayer = MediaPlayer.create(getApplicationContext(), myMusic[y]);
                                                                                                        mediaPlayer.start();

                                                                                                    }

                                                                                                    public void onFinish() {
                                                                                                        bt[0].setVisibility(View.INVISIBLE);
                                                                                                        bt[1].setVisibility(View.INVISIBLE);
                                                                                                        bt[2].setVisibility(View.INVISIBLE);
                                                                                                        bt[3].setVisibility(View.INVISIBLE);
                                                                                                        bt[4].setVisibility(View.INVISIBLE);
                                                                                                        bt[5].setVisibility(View.INVISIBLE);
                                                                                                        bt[6].setVisibility(View.INVISIBLE);
                                                                                                        bt[7].setVisibility(View.INVISIBLE);
                                                                                                        bt[8].setVisibility(View.INVISIBLE);
                                                                                                        mediaPlayer.release();
                                                                                                        new CountDownTimer(1000, 500) {


                                                                                                            public void onTick(long milli5tilFinished) {



                                                                                                            }

                                                                                                            public void onFinish() {
                                                                                                                square_btn.setVisibility(View.INVISIBLE);
                                                                                                                sound_btn.setVisibility(View.INVISIBLE);
                                                                                                                result.setVisibility(View.VISIBLE);

                                                                                                                result.setText("the repetition squares are " + count_square + "  and the repetition sound are " + count_sound + "  you discover " + count2 + "  repetition squares and " + count1 + " repetition sound");
                                                                                                                start.setVisibility(View.VISIBLE);


                                                                                                            }
                                                                                                        }.start();

                                                                                                    }
                                                                                                }.start();


                                                                                            }
                                                                                        }.start();


                                                                                    }
                                                                                }.start();


                                                                            }
                                                                        }.start();

                                                                    }
                                                                }.start();


                                                            }
                                                        }.start();


                                                    }
                                                }.start();


                                            }
                                        }.start();

                                    }
                                }.start();


                            }
                        }.start();


                    }
                }.start();


            }
        }.start();



    }
    public void sncount(View v) {



        new CountDownTimer(100, 100) {


            public void onTick(long milli5tilFinished) {
                sound_btn.setBackgroundColor(Color.argb(255, 255, 255, 255));
            }

            public void onFinish() {
                count1++;

                sound_btn.setBackgroundColor(Color.argb(0,0, 0, 0));
            }
        }.start();
    }
    public void sqcount(View v) {

        new CountDownTimer(100, 100) {


            public void onTick(long milli5tilFinished) {
                square_btn.setBackgroundColor(Color.argb(255, 255, 255, 255));
            }

            public void onFinish() {
                count2++;

                square_btn.setBackgroundColor(Color.argb(0, 0, 0, 0));
            }
        }.start();
    }

}





