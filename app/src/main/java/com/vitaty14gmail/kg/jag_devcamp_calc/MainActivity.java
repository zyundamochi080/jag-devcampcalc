//created by KG
package com.vitaty14gmail.kg.jag_devcamp_calc;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView textView_num;
    private TextView textView_ans;
    private Button[] buttons;

    private Calc calc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView_num = (TextView)findViewById(R.id.textView_num);
        textView_ans = (TextView)findViewById(R.id.textView_ans);

        buttons = new Button[17];
        int[] buttonid = {
                R.id.button_0, R.id.button_1, R.id.button_2,
                R.id.button_3, R.id.button_4, R.id.button_5,
                R.id.button_6, R.id.button_7, R.id.button_8,
                R.id.button_9, R.id.button_dot, R.id.button_del,
                R.id.button_add, R.id.button_sub, R.id.button_mul,
                R.id.button_div, R.id.button_equ
        };

        for(int i=0;i<buttons.length;i++){
            buttons[i]=(Button)findViewById(buttonid[i]);
            buttons[i].setOnClickListener(this);
        }

        calc = new Calc("0","0");
        textView_num.setText(calc.clear());
    }

    public void onClick(View view){
        Button button = (Button)view;

        switch (button.getId()){
            case R.id.button_0:
                textView_num.setText(calc.inputData("0"));
                break;
            case R.id.button_1:
                textView_num.setText(calc.inputData("1"));
                break;
            case R.id.button_2:
                textView_num.setText(calc.inputData("2"));
                break;
            case R.id.button_3:
                textView_num.setText(calc.inputData("3"));
                break;
            case R.id.button_4:
                textView_num.setText(calc.inputData("4"));
                break;
            case R.id.button_5:
                textView_num.setText(calc.inputData("5"));
                break;
            case R.id.button_6:
                textView_num.setText(calc.inputData("6"));
                break;
            case R.id.button_7:
                textView_num.setText(calc.inputData("7"));
                break;
            case R.id.button_8:
                textView_num.setText(calc.inputData("8"));
                break;
            case R.id.button_9:
                textView_num.setText(calc.inputData("9"));
                break;
            case R.id.button_dot:
                textView_num.setText(calc.inputData("."));
                break;
            case R.id.button_del:
                textView_num.setText(calc.clear());
                textView_ans.setText("answer:"+calc.clear());
                break;
            case R.id.button_add:
                calc.onOperatorButtonClick(1);
                break;
            case R.id.button_sub:
                calc.onOperatorButtonClick(2);
                break;
            case R.id.button_mul:
                calc.onOperatorButtonClick(3);
                break;
            case R.id.button_div:
                calc.onOperatorButtonClick(4);
                break;
            case R.id.button_equ:
                textView_ans.setText("answer:"+calc.doCalc());
                break;
        }
    }
}
