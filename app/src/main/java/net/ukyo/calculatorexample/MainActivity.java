package net.ukyo.calculatorexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView textResult;
    private Button btn0;
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;
    private Button btn7;
    private Button btn8;
    private Button btn9;
    private Button btnPlus;
    private Button btnMinus;
    private Button btnTimes;
    private Button btnDivided;
    private Button btnDel;
    private Button btnDot;
    private Button btnEquals;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
        setListener();
    }

    private void findViews() {
        btn0 = (Button) findViewById(R.id.btn_0);
        btn1 = (Button) findViewById(R.id.btn_1);
        btn2 = (Button) findViewById(R.id.btn_2);
        btn3 = (Button) findViewById(R.id.btn_3);
        btn4 = (Button) findViewById(R.id.btn_4);
        btn5 = (Button) findViewById(R.id.btn_5);
        btn6 = (Button) findViewById(R.id.btn_6);
        btn7 = (Button) findViewById(R.id.btn_7);
        btn8 = (Button) findViewById(R.id.btn_8);
        btn9 = (Button) findViewById(R.id.btn_9);
        btnPlus = (Button) findViewById(R.id.btn_plus);
        btnMinus = (Button) findViewById(R.id.btn_minus);
        btnTimes = (Button) findViewById(R.id.btn_times);
        btnDivided = (Button) findViewById(R.id.btn_divided);
        btnDel = (Button) findViewById(R.id.btn_del);
        btnDot = (Button) findViewById(R.id.btn_dot);
        btnEquals = (Button) findViewById(R.id.btn_equals);
    }

    private void setListener() {
        btn0.setOnClickListener(clickListener);
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);
        btn3.setOnClickListener(clickListener);
        btn4.setOnClickListener(clickListener);
        btn5.setOnClickListener(clickListener);
        btn6.setOnClickListener(clickListener);
        btn7.setOnClickListener(clickListener);
        btn8.setOnClickListener(clickListener);
        btn9.setOnClickListener(clickListener);
        btnPlus.setOnClickListener(clickListener);
        btnMinus.setOnClickListener(clickListener);
        btnTimes.setOnClickListener(clickListener);
        btnDivided.setOnClickListener(clickListener);
        btnDel.setOnClickListener(clickListener);
        btnDot.setOnClickListener(clickListener);
        btnEquals.setOnClickListener(clickListener);
    }


    private View.OnClickListener clickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_0:
                    break;
                case R.id.btn_1:
                    break;
                case R.id.btn_2:
                    break;
                case R.id.btn_3:
                    break;
                case R.id.btn_4:
                    break;
                case R.id.btn_5:
                    break;
                case R.id.btn_6:
                    break;
                case R.id.btn_7:
                    break;
                case R.id.btn_8:
                    break;
                case R.id.btn_9:
                    break;
                case R.id.btn_plus:
                    break;
                case R.id.btn_minus:
                    break;
                case R.id.btn_times:
                    break;
                case R.id.btn_divided:
                    break;
                case R.id.btn_del:
                    break;
                case R.id.btn_dot:
                    break;
                case R.id.btn_equals:
                    break;
            }

        }
    };
}
