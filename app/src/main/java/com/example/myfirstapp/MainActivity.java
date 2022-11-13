package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public abstract class MainActivity extends AppCompatActivity {

    TextView result;
//    String[] operators = new String[]{"-", "+", "/", "X"};

    int num1 = 0;
    int num2 = 0;
    String ex = "";
    String op = "";
    double ans = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result = findViewById(R.id.textResult);

    }

    public void funcButton(View view) {

//        Button b = (Button) view;
    }

    public void Num(View view) {
        Button b = (Button) view;
//        Log.d("result in num", b.getText().toString());
        setEx(b.getText().toString());
    }

    public void setEx(String val) {
        ex = ex + val;
        Log.d("result in ex", ex);
        result.setText(ex);
    }

    public void Clear(View view) {
        ex = "";
        Log.d("result", ex);
        result.setText(ex);
    }


    public void Equal(View view) {
        Log.d("result from Equal", ex);
//        op = findSymbol(ex);
        Log.d("result from op", op);

        if (ex.contains("+")) {
            String[] str = ex.split("\\+");
            num1 = Integer.parseInt(str[0]);
            num2 = Integer.parseInt((str[1]));
            ans = num1 + num2;
            result.setText(String.valueOf(ans));
        }


        if (ex.contains("-")) {
            String[] str = ex.split("-");
            num1 = Integer.parseInt(str[0]);
            num2 = Integer.parseInt((str[1]));
            ans = num1 - num2;
            result.setText(String.valueOf(ans));
        }


        if (ex.contains("X")) {
            String[] str = ex.split("X");
            num1 = Integer.parseInt(str[0]);
            num2 = Integer.parseInt((str[1]));
            ans = num1 * num2;
            result.setText(String.valueOf(ans));
        }


        if (ex.contains("/")) {
            String[] str = ex.split("/");
            num1 = Integer.parseInt(str[0]);
            num2 = Integer.parseInt((str[1]));
            ans = (double) num1 / num2;
            result.setText(String.valueOf(ans));
        }

    }


}





//    private String findSymbol(String ex) {
//        for (String operator : operators) {
//            if (ex.contains(operator)) {
//
//                return operator;
//            }
//        }
//        return "invalid input";
//    }

//switch (op) {
//
//        case "+":
//            String str[] = ex.split("\\+");
//            num1 = Integer.parseInt(str[0]);
//            num2  = Integer.parseInt((str[1]));
//            ans = num1 + num2;
//        break;
//        case "-":
//        String str[] = ex.split("-");
////            num1 = Integer.parseInt(str[0]);
////            num2  = Integer.parseInt((str[1]));
////            ans = num1 - num2;
//        break;
//        case "X":
//        String str[] = ex.split("\\*");
////            num1 = Integer.parseInt(str[0]);
////            num2  = Integer.parseInt((str[1]));
////            ans = num1 * num2;
//        break;
//        case "/":
//       String str[] = ex.split("/");
////            num1 = Integer.parseInt(str[0]);
////            num2  = Integer.parseInt((str[1]));
////            ans = num1 / num2;
//        break;
//
//default:
//        System.out.println("Invalid Operator");
//        }
//        return ans;
